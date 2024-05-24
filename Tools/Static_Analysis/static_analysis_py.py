from subprocess import Popen, PIPE, STDOUT, DEVNULL
import subprocess
import os
import json
from utils import violin_box_plot, box_plot, load_json, violin_seaborn
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt


def get_cyclomatic_complexity(DataSet, Model, Root):
    data = {}
    if Model:
        root_folder = os.path.join(Root, DataSet, Model)
    for d in os.listdir(root_folder):
        # if d!="HumanEval_64":
        #     continue
        code_path = os.path.join(root_folder, d, 'main_under_test.py')
        radon_cmd = ["radon", "cc", code_path, "-a"]
        try:
            result = subprocess.check_output(
                radon_cmd,
                stdin=DEVNULL,
                stderr=DEVNULL
                )
            result = result.decode("utf-8")
            message = result.split("\n")[-2]
            if message.startswith("Average complexity:"):
                complexity = float(message.split("(")[-1].split(")")[0])
            else:
                complexity = 1
                print(code_path)
        except:
            complexity = 1
            print(code_path)
        data[d] = complexity
    
    wr_folder = os.path.join(Root, "property", DataSet, Model)
    if not os.path.exists(wr_folder):
        os.makedirs(wr_folder)
    
    path_json = os.path.join(wr_folder, 'cc.json')
    with open(path_json, 'w') as wr:
        json.dump(data, wr, indent=4)
    # print(data)



def get_testing_result(DataSet, Model, Root):
    data = {}
    ROOT_RESULT = "../test_results"
    jsonl_path = os.path.join(ROOT_RESULT, DataSet, Model, "test_result.jsonl")
    with open(jsonl_path, 'r') as json_file:
        json_list = list(json_file)
        for json_str in json_list:
            result = json.loads(json_str)
            test_result = result["test_result"]
            code_id = result["problem_name"]
            data[code_id] = test_result
    wr_folder = os.path.join(Root, "property", DataSet, Model)
    if not os.path.exists(wr_folder):
        os.makedirs(wr_folder)
    
    path_json = os.path.join(wr_folder, 'testing_result.json')
    with open(path_json, 'w') as wr:
        json.dump(data, wr, indent=4)

def get_reasoning_result(DataSet, Model, Root=None):
    data = {}
    ROOT_RESULT = "../synthesized_code/execution/"
    ROOT_GT = "../synthesized_code/passed_test"
    
    folder_result = os.path.join(ROOT_RESULT, DataSet, Model)
    folder_gt = os.path.join(ROOT_GT, DataSet, Model)
    
    for d in os.listdir(folder_result):
        if d == "process_log.txt":
            continue
        path_pred = os.path.join(folder_result, d, 'predict.txt')
        path_gt = os.path.join(folder_gt, d, 'output.txt')
        
        pred = open(path_pred, 'r').read().replace('\n','').replace(' ','').replace('"','\'')
        gt = open(path_gt, 'r').read().replace('\n','').replace(' ','').replace('"','\'')
        
        if pred == gt:
            flag = 1
        else:
            flag = 0
        data[d] = flag
    
    wr_folder = os.path.join(Root, "property", DataSet, Model)
    if not os.path.exists(wr_folder):
        os.makedirs(wr_folder)
    path_json = os.path.join(wr_folder, 'reasoning_result.json')
    with open(path_json, 'w') as wr:
        json.dump(data, wr, indent=4)

def compare_cyclomatic_complexity(model, dataset, type):
    root = "/home/changshu/LLM_REASONING/synthesized_code/under_test/property"
    folder = os.path.join(root, dataset, model)
    path_cc = os.path.join(folder, 'cc.json')
    cc_pass = []
    cc_fail = []
    if type == "testing":
        path_result = os.path.join(folder, "testing_result.json")
    if type == "reasoning":
        path_result = os.path.join(folder, "reasoning_result.json")
    with open(path_cc, 'r') as file:
        data_cc = json.load(file)
    with open(path_result, 'r') as file:
        data_result = json.load(file)
    for key in data_result.keys():
        cc = data_cc[key]
        if data_result[key] == 1: ## pass
            cc_pass.append(cc)
        else:
            cc_fail.append(cc)
    data = [cc_pass, cc_fail]
    labels = ['pass', 'fail']
    xlabel = ""
    ylabel = "Cyclomatic Complexity"
    title = f"{dataset}_{model}_({type})"
    return cc_pass, cc_fail




def plot_cc_all_benchmark():
    def get_data(json_data):
        list_cc = []
        for k in json_data.keys():
            list_cc.append(json_data[k])
        return list_cc
    path_codenet_java = "../cyclomatic_complexity/codenet_java.json"
    path_codenet_python = "../cyclomatic_complexity/codenet_python.json"
    path_avatar_java = "/../cyclomatic_complexity/avatar_java.json"
    path_avatar_python = "../cyclomatic_complexity/avatar_python.json"
    path_humaneval = "../cyclomatic_complexity/humaneval.json"
    path_mbpp = "../cyclomatic_complexity/mbpp.json"
    path_cruxeval = "../cyclomatic_complexity/cruxeval.json"
    cc_codenet_java = get_data(load_json(path_codenet_java))
    cc_codenet_python = get_data(load_json(path_codenet_python))
    cc_avatar_java = get_data(load_json(path_avatar_java))
    cc_avatar_python = get_data(load_json(path_avatar_python))
    cc_humaneval = get_data(load_json(path_humaneval))
    cc_mbpp = get_data(load_json(path_mbpp))
    cc_cruxeval = get_data(load_json(path_cruxeval))
    
    
    data = [cc_codenet_java, cc_codenet_python, cc_avatar_java, cc_avatar_python, cc_humaneval, cc_mbpp, cc_cruxeval]
    violin_box_plot(
        data,
        ["", "", "", "","", "", ""],
        "Benchmarks",
        "CC",
        "Cyclomatic_Complexity_of_Benchmarks"
    )

def plot_loc_all_benchmark():
    def get_data(json_data):
        list_cc = []
        for k in json_data.keys():
            list_cc.append(json_data[k])
        return list_cc
    path_codenet_java = "../program_property/loc/codenet_java.json"
    path_codenet_python = "../program_property/loc/codenet_python.json"
    path_avatar_java = "../program_property/loc/avatar_java.json"
    path_avatar_python = "../program_property/loc/avatar_python.json"
    path_humaneval = "../program_property/loc/humaneval.json"
    path_mbpp = "../program_property/loc/mbpp.json"
    path_cruxeval = "../program_property/loc/cruxeval.json"
    cc_codenet_java = get_data(load_json(path_codenet_java))
    cc_codenet_python = get_data(load_json(path_codenet_python))
    cc_avatar_java = get_data(load_json(path_avatar_java))
    cc_avatar_python = get_data(load_json(path_avatar_python))
    cc_humaneval = get_data(load_json(path_humaneval))
    cc_mbpp = get_data(load_json(path_mbpp))
    cc_cruxeval = get_data(load_json(path_cruxeval))
    
    
    data = [cc_codenet_java, cc_codenet_python, cc_avatar_java, cc_avatar_python, cc_humaneval, cc_mbpp, cc_cruxeval]
    print(data)
    violin_box_plot(
        data,
        ["CodeNet\n(Java)", "CodeNet\n(Python)", "Avatar\n(Java)", "Avatar\n(Python)","HumanEval", "MBPP", "CruxEval"],
        "Benchmarks",
        "LoC",
        "LoC"
    )



def plot_cc_synthesized():
    Dataset = 'HumanEval'
    type = "reasoning"
    ROOT = "/home/changshu/LLM_REASONING/synthesized_code/under_test"
    pass_MagicCoder, fail_MagicCoder = compare_cyclomatic_complexity('MagicCoder', Dataset, type)
    pass_GPT3, fail_GPT3 = compare_cyclomatic_complexity('GPT_3', Dataset, type)
    pass_GPT4, fail_GPT4 = compare_cyclomatic_complexity('GPT_4', Dataset, type)
    pass_CodeLlama, fail_CodeLlama = compare_cyclomatic_complexity('CodeLlama',Dataset, type)
    pass_WizardCoder, fail_WizardCoder = compare_cyclomatic_complexity('WizardCoder',Dataset, type)
    pass_StarCoder, fail_StarCoder = compare_cyclomatic_complexity('StarCoder',Dataset, type)
    pass_mistral, fail_mistral = compare_cyclomatic_complexity('Mistral',Dataset, type)
    
    data = []
    for label, clist in zip(['MagicCoder', 'GPT-3', "CodeLlama", "WizardCoder", "GPT-4", "StarCoder", "Mistral"], 
                           [pass_MagicCoder, pass_GPT3, pass_CodeLlama, pass_WizardCoder, pass_GPT4, pass_StarCoder, pass_mistral]):
        for li in clist:
            data.append([li, 'correct', label])
    
    for label, clist in zip(['MagicCoder', 'GPT-3', "CodeLlama", "WizardCoder" , "GPT-4", "StarCoder", "Mistral"], 
                           [fail_MagicCoder, fail_GPT3, fail_CodeLlama, fail_WizardCoder, fail_GPT4, fail_StarCoder, fail_mistral]):
        for li in clist:
            data.append([li, 'incorrect', label])        

    df = pd.DataFrame(data, columns=['Cyclomatic Complexity', 'Reasoning Result', 'Model'])
    violin_seaborn(df, x="Model", y='Cyclomatic Complexity', hue="Reasoning Result", title="HUMANEVAL_RERASONING")

def quickcheck():
    path_huamneval = "../program_property/cyclomatic_complexity/humaneval.json"
    path_codellama = "../synthesized_code/under_test/property/HumanEval/CodeLlama/cc.json"
    path_gpt3 = "../synthesized_code/under_test/property/HumanEval/GPT_3/cc.json"
    path_gpt4 = "../synthesized_code/under_test/property/HumanEval/GPT_4/cc.json"
    path_deepseek = "../synthesized_code/under_test/property/HumanEval/DeepSeek/cc.json"
    path_magic = "../synthesized_code/under_test/property/HumanEval/MagicCoder/cc.json"
    path_star = "../synthesized_code/under_test/property/HumanEval/StarCoder/cc.json"
    path_star2 = "../synthesized_code/under_test/property/HumanEval/StarCoder2/cc.json"
    path_wizard = "../synthesized_code/under_test/property/HumanEval/WizardCoder/cc.json"
    path_mistral = "../synthesized_code/under_test/property/HumanEval/Mistral/cc.json"
    
    data_1  = json.load(open(path_huamneval, 'r'))
    list_1 = [data_1[k] for k in data_1.keys()]
    
    data_2 = json.load(open(path_codellama, 'r'))
    list_2 = [data_2[k] for k in data_2.keys()]
    
    data_3 = json.load(open(path_gpt3, 'r'))
    list_3 = [data_3[k] for k in data_3.keys()]
    
    data_4 = json.load(open(path_gpt4, 'r'))
    list_4 = [data_4[k] for k in data_4.keys()]
    
    data_5 = json.load(open(path_deepseek, 'r'))
    list_5 = [data_5[k] for k in data_5.keys()] 
    
    data_6 = json.load(open(path_magic, 'r'))
    list_6 = [data_6[k] for k in data_6.keys()]
    
    data_7 = json.load(open(path_star, 'r'))
    list_7 = [data_7[k] for k in data_7.keys()]
    
    data_8 = json.load(open(path_wizard, 'r'))
    list_8 = [data_8[k] for k in data_8.keys()] 
    
    data_9 = json.load(open(path_mistral, 'r'))
    list_9 = [data_9[k] for k in data_9.keys()]
    
    data_10 = json.load(open(path_star2, 'r'))
    list_10 = [data_10[k] for k in data_10.keys()]
    
    # labels = ["dataset", "GPT-4", "GPT-3.5", "Mistral", "CoeLlama", "DeepSeek", "MagicCoder", "StarCoder", "WizardCoder"]
    labels = ["", "", "", "", "", "", "", "", "", ""]

    data_all = [list_1, list_4, list_3, list_9, list_2, list_5, list_6, list_7, list_10, list_8]
    
    violin_box_plot(
        data_all,
        labels,
        "Models",
        "CC (HumanEval)",
        "CCSynHumanevalViolin_updated"
        )
def quickcheck_translate():
    language = "python"
    path_huamneval = f"../program_property/cyclomatic_complexity/translate_{language}.json"
    path_codellama = f"../py_complexity_loc/cc_results/translate_{language}_codellama.json"
    path_gpt3 = f"../py_complexity_loc/cc_results/translate_{language}_gpt-3.5.json"
    path_gpt4 = f"../py_complexity_loc/cc_results/translate_{language}_gpt-4.json"
    path_deepseek = f"../py_complexity_loc/cc_results/translate_{language}_deepseekcoder.json"
    path_magic = f"../py_complexity_loc/cc_results/translate_{language}_magicoder.json"
    path_star = f"../py_complexity_loc/cc_results/translate_{language}_starcoder.json"
    path_star2 = f"../py_complexity_loc/cc_results/translate_{language}_starcoder2.json"
    path_wizard = f"../py_complexity_loc/cc_results/translate_{language}_wizardcoder.json"
    path_mistral = f"../py_complexity_loc/cc_results/translate_{language}_mistral.json"
    
    data_1  = json.load(open(path_huamneval, 'r'))
    list_1 = [data_1[k] for k in data_1.keys() if len(k.split("_"))!=2]
    
    print(len(list_1))
    
    data_2 = json.load(open(path_codellama, 'r'))
    list_2 = [data_2[k] for k in data_2.keys()]
    
    data_3 = json.load(open(path_gpt3, 'r'))
    list_3 = [data_3[k] for k in data_3.keys()]
    
    data_4 = json.load(open(path_gpt4, 'r'))
    list_4 = [data_4[k] for k in data_4.keys()]
    
    data_5 = json.load(open(path_deepseek, 'r'))
    list_5 = [data_5[k] for k in data_5.keys()] 
    
    data_6 = json.load(open(path_magic, 'r'))
    list_6 = [data_6[k] for k in data_6.keys()]
    
    data_7 = json.load(open(path_star, 'r'))
    list_7 = [data_7[k] for k in data_7.keys()]
    
    data_8 = json.load(open(path_wizard, 'r'))
    list_8 = [data_8[k] for k in data_8.keys()] 
    
    data_9 = json.load(open(path_mistral, 'r'))
    list_9 = [data_9[k] for k in data_9.keys()]
    
    data_10 = json.load(open(path_star2, 'r'))
    list_10 = [data_10[k] for k in data_10.keys()]
    
    # labels = ["dataset", "GPT-4", "GPT-3.5", "Mistral", "CoeLlama", "DeepSeek", "MagicCoder", "StarCoder", "WizardCoder"]
    labels = ["", "", "", "", "", "", "", "", "", ""]

    data_all = [list_1, list_4, list_3, list_9, list_2, list_5, list_6, list_7, list_10, list_8]
    
    violin_box_plot(
        data_all,
        labels,
        "Models",
        "CC (Python)",
        "CCTranslatePythonViolin_updated_1"
        )

    
if __name__ == "__main__":
    ROOT = "/home/changshu/LLM_REASONING/synthesized_code/under_test"
    DATASET = "HumanEval"
    MODEL = "GPT_3"
    # get_cyclomatic_complexity(DATASET,MODEL,ROOT)
    # get_cyclomatic_complexity(DATASET, "MagicCoder", ROOT)
    # get_cyclomatic_complexity(DATASET, "CodeLlama", ROOT)
    # get_cyclomatic_complexity(DATASET, "WizardCoder", ROOT)
    # get_cyclomatic_complexity(DATASET, "DeepSeek", ROOT)

    # cmd = "radon cc /home/changshu/LLM_REASONING/synthesized_code/under_test/HumanEval/CodeLlama/HumanEval_106/main_under_test.py -a"
    # result = subprocess.check_output(cmd.split(' '), stdin=DEVNULL, stderr=DEVNULL)
    # print(result)
    
    # get_testing_result(DATASET, MODEL, ROOT)
    # get_testing_result(DATASET, MODEL, ROOT)
    # get_reasoning_result(DATASET, MODEL, ROOT)
    # compare_cyclomatic_complexity(MODEL, DATASET,'testing')
    # compare_cyclomatic_complexity(MODEL, DATASET, "reasoning")
    
    # plot_cc_all_benchmark()
    # plot_cc_synthesized()
    # plot_loc_all_benchmark()
    
    # plot_loc_all_benchmark()
    # quickcheck()
    
    # plot_cc_all_benchmark()
    
    quickcheck_translate()