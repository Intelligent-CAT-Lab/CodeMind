<div align='center'>
<img src="https://github.com/Intelligent-CAT-Lab/CodeMind/blob/main/CodeMind-Logo.jpg" width="25%" height="25%" />
  <br>
</div>

Solely relying on test passing to evaluate Large Language Models (LLMs) for code synthesis may result in unfair assessment or promoting models with data leakage. As an alternative, we introduce CodeMind, a framework designed to gauge the code reasoning abilities of LLMs. CodeMind currently supports three code reasoning tasks: Independent Execution Reasoning (IER), Dependent Execution Reasoning (DER), and Specification Reasoning (SR). The first two evaluate models to predict the execution output of an arbitrary code or code the model could correctly synthesize. The third one evaluates the extent to which LLMs implement the specified expected behavior.

### Paper
Interested to read more about CodeMind, the code reasoning tasks, and a grounded-theory study evaluating LLMs for code reasoning across five benchmarks and two programming languages? Please read the pre-print on Arxiv: https://arxiv.org/pdf/2402.09664.pdf

citiation:
```
@article{liu2024codemind,
  title={CodeMind: A Framework to Challenge Large Language Models for Code Reasoning},
  author={Liu, Changshu and Zhang, Shizhuo Dylan and Jabbarvand, Reyhaneh},
  journal={arXiv preprint arXiv:2402.09664},
  year={2024}
}
```

We also upload our artifact to [Zenodo](https://zenodo.org/records/10699284) and we have a license: 10.5281/zenodo.10699284.

### Contributing to CodeMind
CodeMind is an open-source project to promote the proper evaluation of LLMs for code-related tasks. If you are interested in building on top of CodeMind and adding more code reasoning tasks, please send an email to {cl144,reyhaneh}@illinois.edu.

## CodeMind Framework

### Dependencies
Deployment and use of CodeMind require specific dependencies. Please check if all dependencies listed on ```requirements.txt``` are installed in your environment. 
To install all the dependencies, simply run the following command: ```pip install -r requirements.txt```

Need to register an OpenAI Key and write it into a local variable(```OPENAIKEY```)

### Dataset Structure
Please visit the ```/Dataset``` directory for the latest version of benchmarks integrated with CodeMins.

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

### Using CodeMind
CodeMind currently supports three inductive code reasoning tasks: (1) Independent Execution Reasoning (IER), Dependent Execution Reasoning (DER), and Specification Reasoning (SR). Detailed instructions about using CodeMind to evaluate LLMs for these tasks are explained under each task's corresponding folder. 

### Results of the Grounded-Theory Study
You can find the raw results of our study under ```Results```. Please use CodeMind and try to reproduce our results!
