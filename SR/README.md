### SR (Specification Reasoning)
#### How to run
##### Run 'NoTest'
```
bash run_notest.sh ${MODEL} ${DATASET} ${DATADIR}
```
Below is an example of prompting ```GPT-4``` in 'NoTest' manner on ```MBPP```:

```
bash run_notest.sh GPT-4 MBPPNoTest ../dataset/MBPP
```

set ```DATASET``` to ```MBPPNoTest``` for MBPP and set it to ```HumanEvalNoTest``` for HumanEval.

###### Run 'Misleading Test'/'One Test'

```
bash run_misleading ${MODEL} ${DATASET} ${DATADIR} ${MISLEADING_FLAG}
```

Set ```MISLEADING_TEST``` to 1 for 'Misleading Test' set it to 0 for 'One Test'.

Below is an example of running ```GPT-4``` in 'Misleading Test' setting on ```HumanEval```:
```
bash run_misleading.sh GPT-4 HumanEval ../dataset/HumanEval 1
```

