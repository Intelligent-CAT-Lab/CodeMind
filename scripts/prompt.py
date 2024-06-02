# from utils import Dataset, Model,OpenAIModel
import openai
import time
import os

openai.api_key = os.getenv("OPENAIKEY")

def chatgpt_generator(model,message, temp=0.0, max_len=1024):
    err_flag = False
    inference_not_done = True
    messages = [
        {
            'role': "system",
            'content': message
        }
    ]
    while inference_not_done:
        try:
            completion = openai.ChatCompletion.create(
                # model = "gpt-3.5-turbo-0613",
                model = model,
                max_tokens = max_len,
                temperature = temp,
                messages = messages,
                frequency_penalty=0,
                presence_penalty=0                
            )
            output = completion.choices[0].message["content"]
            inference_not_done = False
            # print(output)

        except Exception as e:
            print(e)
            if 'maximum context length is 128000 tokens.' in str(e):
              
                inference_not_done = False
                err_flag = True
                output = ''
            else:
                time.sleep(3)
            
    return err_flag, output


def huggingface_generator(model, prompt, max_new_tokens):
    device = "cuda:0"
    hf_model, hf_tokenizer = model
    model_inputs = hf_tokenizer([prompt], return_tensors="pt").to(device)
    generated_ids = hf_model.generate(**model_inputs, max_new_tokens=max_new_tokens, num_beams=1, do_sample=False)
    # generated_ids = hf_model.generate(**model_inputs, max_new_tokens=max_new_tokens)
    generated_text = hf_tokenizer.batch_decode(generated_ids)[0]
    return generated_text


def huggingface_generator_chat(model, prompt, max_new_tokens):
    device = "cuda:0"
    hf_model, hf_tokenizer = model
    messages = [
        {"role": "system", "content": "I want you to act as a code executor. I will give you a piece of code and its input. You need to think step by step and then print the output of code execution."},
        {"role": "user", "content": prompt}
    ]
    text = hf_tokenizer.apply_chat_template(
        messages,
        tokenize=False,
        add_generation_prompt=True
    )
    model_inputs = hf_tokenizer([text], return_tensors="pt").to(device)
    generated_ids = hf_model.generate(
            model_inputs.input_ids,
            max_new_tokens=max_new_tokens,
            temperature = 0,
            do_sample=False,
            num_beams=1
        )
    generated_ids = [
            output_ids[len(input_ids):] for input_ids, output_ids in zip(model_inputs.input_ids, generated_ids)
        ]
    generated_text = hf_tokenizer.batch_decode(generated_ids, skip_special_tokens=True)[0]
    return generated_text