### IER (Independent Execution Reasoning)

#### Configuration files:
Each model is paired with a configuration file as follows:
```json
{
    "model": "CodeLlama",
    "type":"huggingface",
    "model_id":"codellama/CodeLlama-13b-Instruct-hf",
    "chache_dir": "/u/cliu5/huggingface",
    "use_auth_token": "XXXX",
    "max_new_tokens": 1024
}
```
```cache_dir``` refers to the location of the downloaded huggingface checkpoints. If noting is found under this directory, required checkpoints will be downloaded to this location.

```use_auth_token```: required by some model, e.g. StarCoder.

#### How to run:
```
cd IER
./run.sh {MODEL_NAME} {FILE_NAME} {DATASET_NAME} {DATASET_PATH} {RESULT_NAME}

## below is an example of running IER on MBPP dataset:
./run.sh MagicCoder main.py MBPP ../dataset/mbpp ../Result/IER
```

```/prompts```: includes all the prompts we used in this study. For example, under ```/prompts/GPT.py``` we defined all the prompts required by GPT models (GPT-3.5. GPT-4) for different datasets.

```predict.py``` imports all the prompts from ```/prompts``` and selects the proper one according to ```MODEL_NAME``` and ```DATASET_NAME```.

```generator.py``` includes OpenAI API and Huggingface API.

 #### How to include new models:
1. add new prompt under ```/IER/prompts``` following the format of existed prompts.
2. Import the new prompt properly into ```predict.py```
3. Add a new generator in ```generator.py``` if needed.
4. Add new configuration files.