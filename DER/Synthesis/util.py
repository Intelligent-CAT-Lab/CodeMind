from constants import Dataset, Model, PromptType,PromptBuilder,OpenAIModel
import openai
import time
import os
openai.api_key = os.getenv("OPENAIKEY")
def chatgpt_wrapper(model,message, temp=0.0, max_len=1000):
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


