### DER (Dependent Execution Reasoning)
#### Configuration files
```json
{
    "model_name": "DeepSeek",
    "generation_config": {
        "type": "huggingface",
        "temperature": 0.0,
        "model_id": "deepseek-ai/deepseek-coder-6.7b-instruct",
        "chache_dir": "/u/cliu5/huggingface",
        "use_auth_token": "",
        "max_new_tokens": 1024,
        "sep_token": "### Response",
        "code_start_token": "```python\n",
        "code_end_token":  "```\n"
    }
}
```

```sep_token```: prompt specific, the token which separates the response and the question.  
```code_start_token``` and ```code_end_token```: prompt specific, which enclose the generated code.


#### How to run:
```
bash run.sh {MODEL} {DATADIR} {DATASET} {OUTDIR} {ORGDATASET} {UNDERTESTDIR} {TESTRESULTDIR}  {PASSINGDIR} {FILENAME} {REASONINGDIR}
```
Below is an example of running GPT_4 on HumanEval for DER:
```
bash run.sh GPT_4 ../dataset/HumanEval HumanEval ../Results/DER/synthesis ../dataset/HumanEval/HumanEval.jsonl ../Results/DER/undertest ../Results/DER/testresult ../Results/DER/passing mian.py ../Result/DER/undertest
```

```pipeline.py``` Loads ```GPT_4``` model and ```HumanEval``` dataset and writes the synthesized code in a jsonl file under ```../Results/DER/synthesis```

```convert.py```: post-processing on the synthesized code, write the synthesized code and the code followed by assertions under ```../Results/DER/undertest```.

```evaluate.py```: test the synthesized code under  ```../Results/DER/undertest``` and writes the passing code under ```../Results/DER/passing```
