# Define models as a datatype.
from enum import Enum, auto
from dataclasses import dataclass
from typing import List, Callable


class Model(Enum):
    GPT_3 = "GPT_3"
    GPT_4 = "GPT_4"
    MagicCoder="MagicCoder" 
    WizardCoder = "WizardCoder"
    CodeLlama = "CodeLlama"
    StarCoder = "StarCoder"
    DeepSeek = "DeepSeek"
    Mistral = "Mistral"
    CodeQwen = "CodeQwen"
    CodeQwenBase="CodeQwenBase"
    # Add other models as needed
    
    def is_huggingface(self):
        return not(self in [Model.GPT_3, Model.GPT_4])


class OpenAIModel():
    '''
    map the model name to the model id in openai
    '''
    mapping: dict = {
        "GPT_3":"gpt-3.5-turbo-0613",
    "GPT_4":"gpt-4-1106-preview"}
    def __call__(self,model:Model):
        return self.mapping[model.value]
        
        
        
        
    


class Dataset(Enum):
    MBPP = "MBPP"
    HumanEval = "HumanEval"
    HumanEvalNoTest="HumanEvalNoTest"
    MBPPNoTest="MBPPNoTest"
    # Add other datasets as needed
    

def format_with_input_output(template,nl, input_data, expected_output, assertion, signature):
    '''This function is used for prompts that require input and output'''
    return template.format(nl, input_data, expected_output)

def format_with_nl_only(template,nl, input_data, expected_output, assertion, signature):
    '''This function is used for special prompts that do not require input and output'''
    return template.format(nl)
def format_with_nl_assert(template,nl, input_data, expected_output, assertion, signature):
    '''This function is used for special prompts that do not require input and output'''
    return template.format(nl, assertion)
def format_with_nl_signature(template,nl, input_data, expected_output, assertion, signature):
    '''This function is used for prompts that need both the nl and signature name'''
    return template.format(signature, nl)

class PromptText:
    def __init__(self,template,format_function: Callable[[str, str, str], str]):
        self.template = template
        self.format_function = format_function

    def create(self, nl, input_data, expected_output, assertion, signature):
        '''Create a prompt with the given input and output'''
        return self.format_function(self.template, nl, input_data, expected_output, assertion, signature)

    
@dataclass
class PromptType:
   
    models: List[Model]
    datasets: List[Dataset]
    prompt_text: PromptText(template="", format_function="NA")



# basic_prompt = PromptType(
#     models=[Model.GPT_3, Model.GPT_4],
#     datasets=[Dataset.MBPP, Dataset.HumanEval],
#     prompt_text=
#     PromptText(
#         template="""NL:{}\nInput:{}\nOutput:{}""",
#         format_function=format_with_input_output
#     )) # An example usage.



magiccoder_prompt = PromptType(
    models = [Model.MagicCoder],
    datasets = [Dataset.MBPP, Dataset.HumanEval],
    prompt_text = PromptText(
        template="""You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Write a Python solution to the following problem:
```
{}
```
Your code should satisfy the follwing assertion:
{}

Enclose your solution in ```python and ```. Only return the function.

@@ Response""",
        format_function=format_with_nl_assert
    )
)
wizardcoder_prompt = PromptType(
    models = [Model.WizardCoder],
    datasets = [Dataset.MBPP, Dataset.HumanEval],
    prompt_text = PromptText(
        template="""Below is an instruction that describes a task, paired with an input that provides further context.  Write a response that appropriately completes the request.

### Instruction:
Write a Python solution to the following problem:
```
{}
```

Your code should satisfy the follwing assertion:
{}

Enclose your solution in ```python and ```. Only print the function.

### Response:""",
        format_function=format_with_nl_assert
    )
)

codellama_prompt = PromptType(
    models = [Model.CodeLlama],
    datasets = [Dataset.MBPP, Dataset.HumanEval],
    prompt_text = PromptText(
        template="""[INST]Your task is to write a Python function to solve a programming problem.
The Python code must be between [PYTHON] and [/PYTHON] tags.
You are given one example test from which you can infere the function signature.

Problem: 
```
{}
```
Test: 
```
{}
```
[/INST]""",
        format_function=format_with_nl_assert
    )
)

starcoder_prompt = PromptType(
    models = [Model.StarCoder],
    datasets = [Dataset.MBPP],
    prompt_text = PromptText(
        template="""<fim_prefix> Your task is to write a Python function to solve a programming problem.
You are given one example test from which you can infere the function signature.

Problem:{}
Your code should satisfy the follwing assertion:
{}

Enclose your solution in [python] and [/python]. Only print the function. Do not add any natural language description or assertion in your response.

Response:<fim_suffix><fim_middle>""",
        format_function=format_with_nl_assert
    )
)

deepseek_prompt = PromptType(
    models = [Model.DeepSeek],
    datasets = [Dataset.MBPP],
    prompt_text = PromptText(
        template="""You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.
### Instruction
Write a Python solution to the following problem:
{}

Your code should satisfy the follwing assertion:
{}

Enclose your solution in ```python and ```. Only print the function. Don not add any natural langugae explanation to your response.
### Response""",
        format_function=format_with_nl_assert
    )
)


mistral_prompt = PromptType(
    models = [Model.Mistral],
    datasets = [Dataset.MBPP,Dataset.HumanEval],
    prompt_text = PromptText(
        template="""[INST]Your task is to write a Python function to solve a programming problem.
The Python code must be between ```python and ``` tags. 
You are given one example test from which you can infere the function signature.

Problem:
```
{}
```
Test: 
{}

Do not add any natural language explanation or assertion to your response.
[/INST]""",
        format_function=format_with_nl_assert
    )
)


magiccoder_prompt_notest = PromptType(
    models = [Model.MagicCoder],
    datasets = [Dataset.HumanEvalNoTest],
    prompt_text = PromptText(
        template="""You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Write a Python solution to the following problem:
```
{}
```

Enclose your solution in ```python and ```. Only return the function.

@@ Response""",
        format_function=format_with_nl_only
    )
)

mistral_prompt_notest = PromptType(
    models = [Model.Mistral],
    datasets = [Dataset.HumanEvalNoTest],
    prompt_text = PromptText(
        template="""[INST]Your task is to write a Python function to solve a programming problem.
The Python code must be between ```python and ``` tags. 

Problem:
```
{}
```

Do not add any natural language explanation to your response.
[/INST]""",
        format_function=format_with_nl_only
    )
)


deepseek_prompt_notest = PromptType(
    models = [Model.DeepSeek],
    datasets = [Dataset.HumanEvalNoTest],
    prompt_text = PromptText(
        template="""You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.
### Instruction
Write a Python solution to the following problem:
```
{}
```

Enclose your solution in ```python and ```. Only print the function. Don not add any natural langugae explanation to your response.
### Response""",
        format_function=format_with_nl_only
    )
)

codellama_prompt_notest = PromptType(
    models = [Model.CodeLlama],
    datasets = [Dataset.HumanEvalNoTest],
    prompt_text = PromptText(
        template="""[INST]Your task is to write a Python function to solve a programming problem.
The Python code must be between [PYTHON] and [/PYTHON] tags.

Problem: 
```
{}
```
[/INST]""",
        format_function=format_with_nl_only
    )
)

wizardcoder_prompt_notest = PromptType(
    models = [Model.WizardCoder],
    datasets = [Dataset.HumanEvalNoTest],
    prompt_text = PromptText(
        template="""Below is an instruction that describes a task, paired with an input that provides further context.  Write a response that appropriately completes the request.

### Instruction:
Write a Python solution to the following problem:
```
{}
```

Enclose your solution in ```python and ```. Only print the function.

### Response:""",
        format_function=format_with_nl_only
    )
)


starcoder_prompt_notest = PromptType(
    models = [Model.StarCoder],
    datasets = [Dataset.HumanEvalNoTest],
    prompt_text = PromptText(
        template="""<fim_prefix> Your task is to write a Python function to solve a programming problem.

Problem:
```
{}
```

Enclose your solution in [python] and [/python]. Only print the function. Do not add any natural language description or assertion in your response.

Response:<fim_suffix><fim_middle>""",
        format_function=format_with_nl_only
    )
)

magiccoder_prompt_notest_signature = PromptType(
    models = [Model.MagicCoder],
    datasets = [Dataset.MBPPNoTest],
    prompt_text = PromptText(
        template="""You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Write a Python solution ```{}``` to the following problem:
```
{}
```

Enclose your solution in ```python and ```. Only return the function.

@@ Response""",
        format_function=format_with_nl_signature
    )
)

mistral_prompt_notest_signaturte = PromptType(
    models = [Model.Mistral],
    datasets = [Dataset.MBPPNoTest],
    prompt_text = PromptText(
        template="""[INST]Your task is to write a Python function ```{}``` to solve a programming problem.
The Python code must be between ```python and ``` tags. 

Problem:
```
{}
```

Do not add any natural language explanation to your response.
[/INST]""",
        format_function=format_with_nl_signature
    )
)

deepseek_prompt_notest_signature = PromptType(
    models = [Model.DeepSeek],
    datasets = [Dataset.MBPPNoTest],
    prompt_text = PromptText(
        template="""You are an expert Python programmer.Your task is to write a Python function ```{}``` to solve a programming problem.
### Instruction
Write a Python solution to the following problem:
```
{}
```

Enclose your solution in ```python and ```. Only print the function. Don not add any natural langugae explanation to your response.
### Response""",
        format_function=format_with_nl_signature
    )
)

codellama_prompt_notest_signature = PromptType(
    models = [Model.CodeLlama],
    datasets = [Dataset.MBPPNoTest],
    prompt_text = PromptText(
        template="""[INST]Your task is to write a Python function ```{}``` to solve a programming problem.
The Python code must be between [PYTHON] and [/PYTHON] tags.

Problem: 
```
{}
```
[/INST]""",
        format_function=format_with_nl_signature
    )
)

wizardcoder_prompt_notest_signature = PromptType(
    models = [Model.WizardCoder],
    datasets = [Dataset.MBPPNoTest],
    prompt_text = PromptText(
        template="""Below is an instruction that describes a task, paired with an input that provides further context.  Write a response that appropriately completes the request.

### Instruction:
Write a Python solution ```{}``` to the following problem:
```
{}
```

Enclose your solution in ```python and ```. Only print the function.

### Response:""",
        format_function=format_with_nl_signature
    )
)


starcoder_prompt_notest_signature = PromptType(
    models = [Model.StarCoder],
    datasets = [Dataset.MBPPNoTest],
    prompt_text = PromptText(
        template="""<fim_prefix> Your task is to write a Python function ```{}``` to solve a programming problem.

Problem:
```
{}
```

Enclose your solution in [python] and [/python]. Only print the function. Do not add any natural language description to your response.

Response:<fim_suffix><fim_middle>""",
        format_function=format_with_nl_signature
    )
)


openai_prompt = PromptType(
    models=[Model.GPT_3, Model.GPT_4],
    datasets=[Dataset.MBPP, Dataset.HumanEval],
    prompt_text=
    PromptText(
        template="""
Your task is to write a Python function to solve a programming problem.
You must use the same function name, signature and variable names as the example test case.
Do not generate test cases. You should only write the function.
[Formatting Instructions]
- Start your code with ```python
- End your code with ```
- In the python code, you must use exactly the same signature as the example test case.

Problem: 
```
{}
```
Test:
```
{}
```

""",
        format_function=format_with_nl_assert
    )) # An example usage.


openai_prompt_notest_signature = PromptType(
    models=[Model.GPT_3, Model.GPT_4, Model.CodeQwen, Model.CodeQwenBase],
    datasets=[Dataset.MBPPNoTest],
    prompt_text=
    PromptText(
        template="""Your task is to write a Python function ```{}``` to solve a programming problem.
[Formatting Instructions]
- Start your code with ```python
- End your code with ```

Problem:
```
{}
```
""",
        format_function=format_with_nl_signature
    )) # An example usage.

openai_prompt_notest_signature_humaneval = PromptType(
    models=[Model.GPT_3, Model.GPT_4, Model.CodeQwen, Model.CodeQwenBase],
    datasets=[Dataset.HumanEvalNoTest],
    prompt_text=
    PromptText(
        template="""Your task is to write a Python function to solve a programming problem.
[Formatting Instructions]
- Start your code with ```python
- End your code with ```

Problem:
```
{}
```
""",
        format_function=format_with_nl_only
    )) # An example usage.

class PromptBuilder:
    def __init__(self, model, dataset):
        # print()
        if not isinstance(model, Model):
            raise ValueError(f"Invalid model: {model}. Valid options are: {[m.name for m in Model]}")
        if not isinstance(dataset, Dataset):
            raise ValueError(f"Invalid dataset: {dataset}. Valid options are: {[d.name for d in Dataset]}")
        self.model = model
        self.dataset = dataset

    @staticmethod
    def _validate_enum(value, enum):
        '''Validate that the given value is a valid enum value'''
        try:
            return enum(value)
        except ValueError:
            valid_options = ", ".join([e.value for e in enum])
            raise ValueError(f"Invalid value: {value}. Valid options are: {valid_options}")


    def _generate_base_prompt(self):
        '''Generate the base prompt for the given model and dataset'''
        for prompt_type in [magiccoder_prompt, wizardcoder_prompt, codellama_prompt,\
            starcoder_prompt, deepseek_prompt, mistral_prompt,\
                magiccoder_prompt_notest, mistral_prompt_notest, deepseek_prompt_notest, codellama_prompt_notest,\
                    wizardcoder_prompt_notest, starcoder_prompt_notest, magiccoder_prompt_notest_signature,\
                        mistral_prompt_notest_signaturte, deepseek_prompt_notest_signature, codellama_prompt_notest_signature, \
                            wizardcoder_prompt_notest_signature, starcoder_prompt_notest_signature, openai_prompt,openai_prompt_notest_signature, openai_prompt_notest_signature_humaneval]:
            if self.model in prompt_type.models and self.dataset in prompt_type.datasets:
                return prompt_type.prompt_text
        raise ValueError(f"Prompt not found for model: {self.model} and dataset: {self.dataset}")

    def __call__(self, nl, input=None, output=None):
        '''Generate a prompt with the given input and output'''
        prompt = self._generate_base_prompt()


        return prompt.create(nl, input, output)


if __name__ == "__main__":
    test = 'MagicCoder'
    assert PromptBuilder._validate_enum(test, Model)
    print(Model(test).is_huggingface())
    