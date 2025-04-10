import os
import argparse
import re
from python_loc_counter import LOCCounter
import statistics
import json

def get_loc(path):
    counter = LOCCounter(path)
    loc_data = counter.getLOC()
    return loc_data["source_loc"]

def load_passes(root_dir):
    path_pass = os.path.join(root_dir, 'pass_id.txt')
    id_list = []
    f = open(path_pass, 'r')
    for line in f.readlines():
        id_list.append(line.strip("\n"))
    return id_list

def load_pass_ids(model, dataset):
    pass_id_path = f"../Experiment_Results/Refactor_new/{model}/{dataset}/pass_id.txt"
    pids = []
    with open(pass_id_path, 'r') as f:
        lines = f.readlines()
        for line in lines:
            pids.append(line.strip())
    return pids



if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", type=str, default='none')
    parser.add_argument("--dataset", type=str, default='none', help="select one from [CodeNet, Avatar, cruxeval, mbpp, humaneval]")
    parser.add_argument("--writePath", type=str, default="../Experiment_Results/")
    parser.add_argument("--task", type=str, default="Synthesis")
    args = parser.parse_args()

    model_id = args.model
    write_dir = args.writePath
    dataset = args.dataset
    task = args.task
    
    dis_pred_before, dis_pred_after, dis_before_after, before, after, ref = [], [], [], [], [], []

    if dataset == 'Avatar':
        dataset_name = 'Avatar-Python'
        root_data = f"../dataset/Avatar/Avatar-Python"
    else:
        dataset_name = dataset
        root_data = f"../dataset/{dataset}"
    root_dir = f"../Experiment_Results/Refactor_new/{model_id.split('/')[-1]}/{dataset_name}"
    pass_ids = load_pass_ids(model_id.split('/')[-1], dataset_name)
    
    wr_path = f"../Experiment_Results/result_stat/CR_new/{model_id}_{dataset}.txt"
    correct_ids = []
    
    pass_list = load_passes(root_dir)
    if dataset == 'Avatar': total = 86
    elif dataset == 'humaneval': total = 164
    elif dataset == 'classeval': total = 400
    elif dataset == "cruxeval": total = 800
    r_cr = []
    loc_dict = {
        "pass":[],
        "fail":[]
    }
    for d in os.listdir(root_dir):
        if ".txt" in d: continue
        
        path_pred = os.path.join(root_dir, d, 'cleaned_main.py')
        path_before = os.path.join(root_data, d, 'cleaned_main.py')
        path_after = os.path.join(root_data, d, "cleaned_transformation.py")
        if not os.path.exists(path_pred): continue
        if not os.path.exists(path_before): continue
        if d in pass_ids:
            loc_pred = get_loc(path_pred)
            loc_before = get_loc(path_before)
            loc_after = get_loc(path_after)
            
            dis_pred_after.append(loc_pred-loc_after)
            dis_pred_before.append(loc_pred-loc_before)
            dis_before_after.append(loc_before-loc_after)
            before.append(loc_before)
            after.append(loc_after)
            ref.append(loc_pred)
            if loc_after > loc_pred:
                r_cr.append(loc_before/max(loc_before, loc_pred))
                correct_ids.append(d)
                loc_dict["pass"].append(loc_pred)
            else:
                loc_dict["fail"].append(loc_pred)
        else:
            loc_pred = get_loc(path_pred)
            loc_dict["fail"].append(loc_pred)
    
            # if loc_pred < loc_before:
            #     print(d)
    # loc_stat_path = f"../Experiment_Results/result_stat/CR/LOC_{model_id}_{dataset}.json"
    # with open(loc_stat_path, 'w') as wr:
    #     json.dump(loc_dict, wr, indent=4)
    with open(wr_path, 'w') as wr:
        for i in correct_ids:
            wr.write(i + '\n')
    print(statistics.mean(loc_dict['pass']))
    print(statistics.mean(loc_dict['fail']))
            
    # print("Pred-After:",  statistics.mean(dis_pred_after))
    # print("Pred-Before:", statistics.mean(dis_pred_before))
    # print("Before-After:", statistics.mean(dis_before_after))
    # print("After:", statistics.mean(after))
    # print("Before:", statistics.mean(before))
    # print("Refactor:", statistics.mean(ref))
    print(dataset)
    print("pass@1:", len(pass_ids)/total)
    print("RCR:", sum(r_cr)/total)