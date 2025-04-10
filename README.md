<!-- <b><center>[Alert!] CodeMind is a work in progress. We are actively modifying the code to make it easier for end users to reproduce the results or add new models/datasets/reasoning tasks. Please create issues if you observe difficulties in using CodeMind.</center></b> -->

<!--<div align='center'>-->
<!--</div>-->

<!--Solely relying on test passing to evaluate Large Language Models (LLMs) for code synthesis may result in unfair assessment or promoting models with data leakage. As an alternative, we introduce CodeMind,--> 
<!--CodeMind is a framework designed to gauge the code reasoning abilities of LLMs. It currently supports three code reasoning tasks: Independent Execution Reasoning (IER), Dependent Execution Reasoning (DER), and Specification Reasoning (SR).-->
 <!--The first two evaluate models to predict the execution output of an arbitrary code or code the model could correctly synthesize. The third one evaluates the extent to which LLMs implement the specified expected behavior.-->

## CodeMind Framework
<img src="https://github.com/Intelligent-CAT-Lab/CodeMind/blob/main/CodeMind-Logo.jpg" width="20%" height="20%" align="right"/> Solely relying on test passing to evaluate Large Language Models (LLMs) for code synthesis may result in unfair assessment or promoting models with data leakage. As an alternative, we introduce CodeMind, a framework designed to gauge the code reasoning abilities of LLMs. CodeMind currently supports three inductive code reasoning tasks: (1) Independent Execution Reasoning (IER), Dynamic Semantics  Reasoning (DER), and Specification Reasoning (SR). Please follow the instructions below to reproduce the results to use existing models, tasks, and datasets. We also support adding new models, tasks, and datasets. 

### Dependencies
<!--Deployment and use of CodeMind require specific dependencies.--> <!--Please check if all dependencies listed on ```requirements.txt``` are installed in your environment.-->
To install all the dependencies, run the following command: ```pip install -r requirements.txt```

CodeMind is designed to read API keys required for API-access models from local variables. Please modify and run ```setup.sh {OPANAIKEY} {GEMINIAPI}``` to automatically add the variable to your local machines.


### How to reproduce the results
#### IER Reasoning Task
```
cd scripts
bash run_IER.sh {MODEL_ID} {CACHE_DIR} {DATASET}

## below is the command to run Magicoder on Humaneval:
bash run_IER.sh ise-uiuc/Magicoder-S-DS-6.7B ${path_to_store_checkpoints} humaneval Python
```

```MODEL_ID```: Currently our framework supports following OpenAI and huggingface models: ```gpt-3.5-turbo```, ```gpt-4-turbo```, ```codellama/CodeLlama-13b-Instruct-hf```,```codellama/CodeLlama-34b-Instruct-hf```, ```codellama/CodeLlama-13b-hf```, ```deepseek-ai/deepseek-coder-6.7b-instruct```, ```deepseek-ai/deepseek-coder-6.7b-base```,  ```deepseek-ai/deepseek-coder-33b-instruct```,```ise-uiuc/Magicoder-S-DS-6.7B```, ```bigcode/starcoder```, ```bigcode/starcoder2-15b```, ```semcoder/semcoder_s```

```CACHE_DIR```: path to store the downloaded pretrained huggingface model checkpoints.  
```DATASET```: choose one from the following list [ Avatar, cruxeval, humaneval, classeval]

#### DSR Reasoning Task

```
cd scripts
bash run_DSR.sh {MODEL_ID}  {CACHAE_DIR} {DATASET}

## Below is the command to run DSR for CodeLlama-13b-instruct on humaneval
bash run_DSR.sh codellama/CodeLlama-13b-Instruct-hf ${path_to_store_checkpoints}  humaneval
```
```DATASET```: choose one from the following list [ Avatar, cruxeval, humaneval, classeval]

#### SR Reasoning Task
```
cd scripts
bash run_SR.sh {MODEL_ID} {DATASET} {CACHAE_DIR} {SR_TYPE}

## Below is the command to run SR for Deepseek-coder on classeval under 'no_test' setting
bash run_SR.sh deepseek-ai/deepseek-coder-6.7b-instruc classeval ${path_to_store_checkpoints} no_test

## Below is the command to run SR  for Deepseek-coder on humaneval under 'use test' setting
bash run_SR.sh deepseek-ai/deepseek-coder-6.7b-instruc humaneval ${path_to_store_checkpoints} use_test
```
```SR_TYPE```: can be 'no_test' or 'use_test' 

```DATASET```: choose one from [humaneval, classeval]

<!-- ### How to Add New Models
You have two options to evaluate a new model using CodeMind:

Option 1: Open an issue on the repo's issue tracker and label it with "new_model." We will resolve the issue by adding the new model per each "new_model" request. 

Option 2: You can modify the "model_config.json" by adding properties of the new model, such as model ID and interface type. You should also modify "create_prompt_ier.py" and "reate_prompt_der.py" scripts, as different models may require additional information in the prompt that is currently not supported by our scripts.  -->

<!-- ### How to Add New Reasoning Tasks
To add a new reasoning task to CodeMind, please open an issue on the repo's issue tracker and label it with "new_task." We will provide additional information about how to integrate your new reasoning tasks into CodeMind.   -->

<!--To add a new task, create a directory in the ```DER/``` directory with the name of the task. Please upload all your scripts and add a README under your directory to explain how to run the scripts.
Note that please include a script to process your raw output into the data format required by the IER:
```
+---Task
    |
    +--Problem_1
       |
        +--input.txt
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


<!-- ### How to Add New Dataset
<!--Please visit the ```/Dataset``` directory for the latest version of benchmarks integrated with CodeMins.-->
<!-- Datasets are stored under the ```/Dataset``` directory. If a dataset contains instances from different programming languages, they should be separated into separate sub-directories (similar to the structure below). 
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
Given that different datasets read test data differently, please open an issue on the repo's issue tracker to add a new dataset to CodeMind.  --> 

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
<!-- 
We also upload our artifact to [Zenodo](https://zenodo.org/records/10699284) and we have a license: 10.5281/zenodo.10699284. -->

## Contributing to CodeMind
CodeMind is an open-source project to promote the proper evaluation of LLMs for code-related tasks. If you are interested in building on top of CodeMind and adding more code reasoning tasks, please send an email to {cl144,reyhaneh}@illinois.edu.



