### IER (Independent Execution Reasoning)
#### How to run
```
cd IER_new
./run.sh {MODEL_ID} {CACHE_DIR} {DATASET} {TASK}

## below is the command to run Magicoder on MBPP:
./run.sh ise-uiuc/Magicoder-S-DS-6.7B ${path_to_store} mbpp IER
```

```MODEL_ID```: Currently our framework supports following OpenAI and huggingface models: ```gpt-3.5-turbo```, ```gpt-4-1106-preview```, ```codellama/CodeLlama-13b-Instruct-hf```, ```codellama/CodeLlama-13b-hf```, ```Qwen/CodeQwen1.5-7B-Chat```, ```Qwen/CodeQwen1.5-7B```, ```deepseek-ai/deepseek-coder-6.7b-instruct```, ```deepseek-ai/deepseek-coder-6.7b-base```, ```meta-llama/Llama-2-13b-hf```, ```ise-uiuc/Magicoder-S-DS-6.7B```, ```mistralai/Mistral-7B-Instruct-v0.1```, ```bigcode/starcoder```, ```bigcode/starcoder2-15b```, ```WizardLM/WizardCoder-15B-V1.0```

```CACHE_DIR```: path to store the downloaded pretrained huggingface model checkpoints.

```DATASET```: choose one from the following list [codenet_java, codenet_python, avatar_java, avatar_python, cruxeval, mbpp, humaneval]


#### How to add new models into the framework:
1. Add a new prompt in ```create_prompt.py```. Please refer to ```create_prompt_magicode``` in that file.
2. Assign the new model to its corresponding generator in ```main.py```
