## Artififact for CodeMind

### Environment:
Dependencies required in our project can be found in ```requirements.txt```  
Installlation: ```pip install -r requirements.txt```

### Dataset
Dataset we used in our study can be found in the following link:

https://drive.google.com/file/d/17VAhbkL8j36HzBjGfO0ZWIr54hte0qcU/view?usp=sharing
<!-- 
Raw results can be found in the following links:
https://drive.google.com/file/d/10wFkf4tA0QgWRjHxWiLGxtjIke9-PTSn/view?usp=drive_link

https://drive.google.com/file/d/1ghPqckTxBY_JgLF61G9mwoUrRJBMCZdg/view?usp=drive_link -->
```
+--avatar: Avatar(Python)
| |
| +--atcoder_ABC042_A
|    |
|    +--input.txt: input of the code/function
|    +--main.py: code
|    +--output.txt: ground truth output
|
+--avatar-java: Avatar(Java)
+--CodeNet_single_input_Java: CodeNet(Java)
+--CodeNet_sigle_input_Python: CodeNet(Python)
+--cruxeval: CruxEval(Python)
+--humaneval: HumanEval(Python)
+--mbpp: MBPP(Python)
|
|
+--HumanEval.jsonl: raw dataset of HumanEval(used in DER & SR)
+--sanitized-mbpp.json: raw dataset of MBPP (used in DER & SR)
```

### IER (Independent Execution Reasoning)

#### Configuration files:
Each experiment is paired with a configuration file as follows:
```json
{
    "root_dir":"PATH/TO/DATA",
    "file_name": "Main.java",
    "model": "GPT_3",
    "output_dir": "/PATH/TO/OUTPUT",
    "dataset": "CodeNetJava",
    "type":"openai",
    "model_id":"GPT_3",
    "chache_dir": "PATH/TO/CACHE",
    "use_auth_token": "XXXX",
    "max_new_tokens": 1024
}
```
```root_dir``` refers to the location of the dataset.  
```output_dir``` refers to the location to store the output of models.  
```cache_dir``` refers to the location of the downloaded huggingface checkpoints. If noting is found under this directory, required checkpoints will be downloaded to this location.

```use_auth_token```: required by some model, e.g. StarCoder.

#### How to run:
```
cd IER
python predict.py {PATH_TO_CONFIG}
```
#### How to include new models:
1. add new prompt under ```/IER/prompts``` following the format of existed prompts.
2. Import the new prompt properly into ```predict.py```
3. Add a new generator in ```generator.py``` if needed.
4. Add new configuration files.


### DER (Dependent Execution Reasoing)
#### Configuration files
```json
{
    "root_directory": "PATH/TO/DATASE",
    "model_name": "CodeLlama",
    "dataset_name": "HumanEval",
    "output_directory": "/PATH/TO/OUTPUT",
    "generation_config": {
        "type": "huggingface",
        "model_id": "codellama/CodeLlama-13b-Instruct-hf",
        "chache_dir": "/CACHE/DIR",
        "use_auth_token": "",
        "max_new_tokens": 1024,
        "sep_token": "",
        "code_start_token": "```python\n",
        "code_end_token":  "```"
    },
    "include_test": "False",
    "under_test_directory": "PATH/TO/CODE/UNDERTEST",
    "test_result_directory": "PATH/TO/TEST/RESULTS",
    "passed_test_directory": "PATH/TO/CODE/PASSING/TESTS",
    "dataset_path": "/PATH/TO/DATASET/HumanEval.jsonl"
}
```

```under_test_directory```: the synthesized code is going to be written into files under this directory.   
```test_result_directory```: testing results on synthesized code is goning to be written into json files under this directory.  
```passed_test_directory```: path to the code that can pass the test. 
```dataset_path```: points to the json/jsonl file of MBPP-sanitized or HumanEval   
```sep_token```: prompt specific, the token which separates the reponse and the question.  
```code_start_token``` and ```code_end_token```: prompt specific, which enclose the generated code.

#### How to run:
```
### step 1: code synthesis
cd DER
./run.sh $PATH_TO_CONFIG$

### step 2: execution reasoning
### go to IER
```


### SR (Speciafication Reasoning)
#### Configuration files:
The configuration is very similar to thoes in DER, the modifications are show below:  
1. set ```dataset_name``` to "MBPPNoTest" or "HumanEvalNoTest" if no test information is included in the prompt

2. set ```mutate``` to  1 to include misleading tests into the prompt.

#### How to run
```
cd SR
bash run.sh {PATH/TO/CONFIG}
```

### Evaluate
under ```/Evaluate/parse_results.py``` there are some functions that can be helpful to parse the output of LLMs on the reasoning task.