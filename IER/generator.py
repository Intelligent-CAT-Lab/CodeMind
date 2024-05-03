from utils import Dataset, Model,OpenAIModel
import openai
import time
import os
openai.api_key = os.getenv("OPENAIKEY")

def chatgpt_generator(model,message, temp=0.0, max_len=1000):
    openai_model = OpenAIModel()
    model_identifier = openai_model(Model(model))
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
                model = model_identifier,
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
        generated_text = hf_tokenizer.batch_decode(generated_ids)[0]
        return generated_text