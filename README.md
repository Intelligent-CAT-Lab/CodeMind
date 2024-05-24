<b><center>[Alert!] CodeMind is a work in progress. We are actively modifying the code to make it easier for end users to reproduce the results or add new models/datasets/reasoning tasks. Please create issues if you observe difficulties in using CodeMind</center></b>

<div align='center'>
<img src="https://github.com/Intelligent-CAT-Lab/CodeMind/blob/main/CodeMind-Logo.jpg" width="20%" height="20%" />
  <br>
</div>

<!--Solely relying on test passing to evaluate Large Language Models (LLMs) for code synthesis may result in unfair assessment or promoting models with data leakage. As an alternative, we introduce CodeMind,--> <!--CodeMind is a framework designed to gauge the code reasoning abilities of LLMs. It currently supports three code reasoning tasks: Independent Execution Reasoning (IER), Dependent Execution Reasoning (DER), and Specification Reasoning (SR).--> <!--The first two evaluate models to predict the execution output of an arbitrary code or code the model could correctly synthesize. The third one evaluates the extent to which LLMs implement the specified expected behavior.-->

## CodeMind Framework
CodeMind currently supports three inductive code reasoning tasks: (1) Independent Execution Reasoning (IER), Dependent Execution Reasoning (DER), and Specification Reasoning (SR). 

### Dependencies
<!--Deployment and use of CodeMind require specific dependencies.--> <!--Please check if all dependencies listed on ```requirements.txt``` are installed in your environment.-->
To install all the dependencies, run the following command: ```pip install -r requirements.txt```

<!--You must first define the API key as a local variable for API-access models. This avoids accidental exposure of the API key. CodeMind currently support ```OPENAIKEY```.-->

### How to reproduce the results
#### IER Reasoning Task
```
cd scripts
bash run_IER.sh {MODEL_ID} {CACHE_DIR} {DATASET}

## below is the command to run Magicoder on MBPP:
bash run_IER.sh ise-uiuc/Magicoder-S-DS-6.7B ${path_to_store_checkpoints} mbpp
```

```MODEL_ID```: Currently our framework supports following OpenAI and huggingface models: ```gpt-3.5-turbo```, ```gpt-4-1106-preview```, ```codellama/CodeLlama-13b-Instruct-hf```, ```codellama/CodeLlama-13b-hf```, ```Qwen/CodeQwen1.5-7B-Chat```, ```Qwen/CodeQwen1.5-7B```, ```deepseek-ai/deepseek-coder-6.7b-instruct```, ```deepseek-ai/deepseek-coder-6.7b-base```, ```meta-llama/Llama-2-13b-hf```, ```ise-uiuc/Magicoder-S-DS-6.7B```, ```mistralai/Mistral-7B-Instruct-v0.1```, ```bigcode/starcoder```, ```bigcode/starcoder2-15b```, ```WizardLM/WizardCoder-15B-V1.0```

```CACHE_DIR```: path to store the downloaded pretrained huggingface model checkpoints.

```DATASET```: choose one from the following list [CodeNet, Avatar, cruxeval, mbpp, humaneval]

#### DER Reasoning Task

```
cd scripts
bash run_DER.sh {MODEL_ID} {DATASET} {CACHAE_DIR} {TASK} [SRC_LANG] [TGT_LANG]

## Below is the command to run DER(TASK=Synthesis) for CodeLlama-instruct on MBPP
bash run_DER.sh codellama/CodeLlama-13b-Instruct-hf mbpp ${path_to_store_checkpoints} Synthesis

## Below is the command to run DER(TASK=Translation) for CodeLlama-instruct on CodeNet
bash run_DER.sh codellama/CodeLlama-13b-Instruct-hf CodeNet ${path_to_store_checkpoints} Translation Java Python
```

```Task```: can be 'Synthesis'(code synthesis) or 'Translation'(code translation)
```SRC_LANG``` and ```TGT_LANG```: optional, required when running code translation. Our framework currently supports Python and Java.

#### SR Reasoning Task
```
cd scripts
bash run_SR.sh {MODEL_ID} {DATASET} {CACHAE_DIR} {TASK} {SR_TYPE} [SRC_LANG] [TGT_LANG]  

## Below is the command to run SR(TASK=Synthesis) for Deepseek-coder on MBPP under 'no_test' setting
bash run_SR.sh deepseek-ai/deepseek-coder-6.7b-instruc mbpp ${path_to_store_checkpoints} Synthesis no_test

## Below is the command to run SR(TASK=Translation) for Deepseek-coder on CodeNet under 'misleading test' setting
bash run_SR.sh deepseek-ai/deepseek-coder-6.7b-instruc CodeNet ${path_to_store_checkpoints} Translation misleading_test Java Python
```
```SR_TYPE```: can be 'no_test', 'with_test' or 'misleading_test'

### How to Add New Models
You have two options to evaluate a new model using CodeMind:

Option 1: Open an issue on the repo's issue tracker and label it with "new_model." We will resolve the issue by adding the new model per each "new_model" request. 

Option 2: You can modify the "model_config.json" by adding properties of the new model, such as model ID and interface type. You should also modify "create_prompt_ier.py" and "reate_prompt_der.py" scripts, as different models may require additional information in the prompt that is currently not supported by our scripts. 

### How to Add New Reasoning Tasks
To add a new reasoning task to CodeMind, please open an issue on the repo's issue tracker and label it with "new_task." We will provide additional information about how to integrate your new reasoning tasks into CodeMind.  

<!--To add a new task, create a directory in the ```DER/``` directory with the name of the task. Please upload all your scripts and add a README under your directory to explain how to run the scripts.
Note that please include a script to process your raw output into the data format required by the IER:
```
+---Task
    |
    +--Problem_1
    |  |
    |  +--input.txt
       |  |
       |  +--ouptut.txt
       |  |
       |  +--main.py/Main.java/etc.
       |
       +--Problem_2
       |
```
Create a folder for each "problem" and add the code(main.py, Main.java, etc.), the input (input.txt) and the ground-truth output(output.txt) under the folder.
Also create a directory in the ```dataset``` with the name of the task and upload the processed dataset under this directory. For example, all the passing translated code generated by LLMs can be found under ```dataset/Translation```-->

### How to Add New Dataset
<!--Please visit the ```/Dataset``` directory for the latest version of benchmarks integrated with CodeMins.-->
Datasets are stored under the ```/Dataset``` directory. If a dataset contains instances from different programming languages, they should be separated into separate sub-directories (similar to the structure below). 
```
+---Avatar
|   |
|   +---Avatar-java
|   |
|   +---Avatar-python
|
+---CodeNet
|   |
|   +---CodeNet-java
|   |
|   +---CodeNet-python
|
+---CRUXEval
|
+---HumanEval
|
+---MBPP
```
Given that different datasets read test data differently, please open an issue on the repo's issue tracker to add a new dataset to CodeMind. 

## Paper
Interested to read more about CodeMind, the code reasoning tasks, and a grounded-theory study evaluating LLMs for code reasoning across five benchmarks and two programming languages? Please read the pre-print on Arxiv: https://arxiv.org/pdf/2402.09664.pdf

citiation:
```
@article{liu2024codemind,
  title={CodeMind: A Framework to Challenge Large Language Models for Code Reasoning},
  author={Liu, Changshu and Zhang, Shizhuo Dylan and Ibrahimzada, Ali Reza and Jabbarvand, Reyhaneh},
  journal={arXiv preprint arXiv:2402.09664},
  year={2024}
}
```

We also upload our artifact to [Zenodo](https://zenodo.org/records/10699284) and we have a license: 10.5281/zenodo.10699284.

## Contributing to CodeMind
CodeMind is an open-source project to promote the proper evaluation of LLMs for code-related tasks. If you are interested in building on top of CodeMind and adding more code reasoning tasks, please send an email to {cl144,reyhaneh}@illinois.edu.

