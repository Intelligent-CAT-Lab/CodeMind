from dataclasses import dataclass
from typing import List, Callable
from enum import Enum
import openai

class PromptText:
    def __init__(self,template,format_function: Callable[[str, str, str], str]):
        self.template = template
        self.format_function = format_function

    def create(self, nl, input_data, expected_output, assertion, signature):
        '''Create a prompt with the given input and output'''
        return self.format_function(self.template, nl, input_data, expected_output, assertion, signature)

class Model(Enum):
    GPT_3 = "GPT_3"
    GPT_4 = "GPT_4"
    MagicCoder="MagicCoder" 
    WizardCoder = "WizardCoder"
    CodeLlama = "CodeLlama"
    StarCoder = "StarCoder"
    DeepSeek = "DeepSeek"
    Mistral = "Mistral"
    Llama = "Llama"
    CodeQwen="CodeQwen"
    CodeQwenBase="CodeQwenBase"
    
    # Add other models as needed
    
    def is_huggingface(self):
        return not(self in [Model.GPT_3, Model.GPT_4])


class Dataset(Enum):
    MBPP = "MBPP"
    HumanEval = "HumanEval"
    CodeNetJava = "CodeNetJava"
    CodeNetPython = "CodeNetPython"
    CruxEval = "CruxEval"
    AvatarJava = "AvatarJava"
    AvatarPython = "AvatarPython"
    # Add other datasets as needed
    

@dataclass
class PromptType:
   
    models: List[Model]
    datasets: List[Dataset]
    prompt_text: PromptText(template="", format_function="NA")

class OpenAIModel():
    '''
    map the model name to the model id in openai
    '''
    mapping: dict = {
        "GPT_3":"gpt-3.5-turbo-0613",
    "GPT_4":"gpt-4-1106-preview"}
    def __call__(self,model:Model):
        return self.mapping[model.value]

