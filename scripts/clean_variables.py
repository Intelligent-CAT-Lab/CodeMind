import os
import argparse
import ast
import json

def parse_results(root_dir):
    start, end = '[PYTHON]', '[/PYTHON]'
    for d in os.listdir(root_dir):
        path_response = os.path.join(root_dir, d, 'response.txt')
        path_predict = os.path.join(root_dir, d, 'predict.txt')
        response = open(path_response, 'r').read()
        if 'Magicoder' in root_dir:
            new_text = response.split('@@Response')[1]
        if 'CodeLlama' in root_dir or 'Mistral' in root_dir or 'Llama-2' in root_dir:
            new_text = response.split('[/INST]')[1]
        if 'deepseek-coder' in root_dir:
            new_text = response.split('### Response')[1]
        if 'gpt-' in root_dir:
            new_text = response
        if 'starcoder' in root_dir:
            new_text = response.split("<fim_suffix><fim_middle>")[1]
        if 'WizardCoder' in root_dir:
            new_text = response.split("### Response:")[1]

        predict = new_text[new_text.find(start)+len(start):new_text.find(end)].lstrip('\n')
        with open(path_predict, 'w') as wr:
            wr.write(predict)

def extract_prediction(root_dir, scratch_pad):
    def simplest_type(s):
        try:
            return ast.literal_eval(s)
        except:
            return s
    def string_to_dict(input_string):
        # Remove the surrounding braces and split the string into key-value pairs
        input_string = input_string.strip('{}')
        pairs = input_string.split(',')

        # Create a dictionary from the key-value pairs
        result_dict = {}
        for pair in pairs:
            key = pair.split('=')[0]
            value = pair.lstrip(f"{key}=")
            result_dict[key.strip()] = simplest_type(value.strip())
        return result_dict

    def extract_single_file(filename):
        result_dict = {}
        ## result_dict={lineno:{var1:[states], var2:[states]}}
        with open(filename, 'r') as file:
            for current_line, line in enumerate(file, start=1):
                if '[STATE]' in line:
                    comment = line.split("##")[-1].lstrip()
                    vars = comment.split('[STATE]')
                    for var in vars:
                        if "=" not in var:
                            continue
                        var_name = var.split('=')[0]
                        var_values = "=".join(var.split('=')[1:]).split('[/STATE]')[0]
                        try:
                            var_values = ast.literal_eval(var_values)
                        except:
                            var_values = var_values
                        if current_line not in result_dict.keys():
                            result_dict[current_line] = {}
                        result_dict[current_line][var_name] = var_values
        return result_dict
    
    def extract_single_file_scratchpad(filename):
        result_dict = {}
        ## result_dict={lineno:{var1:[states], var2:[states]}}
        with open(filename, 'r') as file:
            for current_line, line in enumerate(file, start=1):
                if '[STATE]' in line:
                    comment = line.split("##")[-1].lstrip()
                    vars = comment.split('[STATE]')
                    if current_line not in result_dict.keys():
                        result_dict[current_line] = {}
                    for var in vars:
                        if "=" not in var:
                            continue
                        var = var.replace('[/STATE]', '').strip('\n')
                        var_dict = string_to_dict(var)
                        for k in var_dict.keys():
                            if k not in result_dict[current_line].keys():
                                result_dict[current_line][k] = []
                            result_dict[current_line][k].append(var_dict[k])
        return result_dict
    results = {}
    for d in os.listdir(root_dir):
        file_name = os.path.join(root_dir, d, 'predict.txt')
        if not scratch_pad:
            result = extract_single_file(file_name)
        else:
            result = extract_single_file_scratchpad(file_name)
        results[d] = result
    return results

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", type=str, default='none')
    parser.add_argument("--dataset", type=str, default='none', help="select one from [CodeNet, Avatar, cruxeval, mbpp, humaneval]")
    parser.add_argument("--writePath", type=str, default="../Experiment_Results/LIP")
    parser.add_argument('--scratch_pad', help='use test dataset', action='store_true')
    parser.add_argument('--pl', type=str, default='Python')
    args = parser.parse_args()

    model_id = args.model
    write_dir = args.writePath
    dataset = args.dataset
    scratch_pad = args.scratch_pad
    pl = args.pl
    if not scratch_pad:
        if pl == 'Python':
            if dataset in ['CodeNet']:
                root_folder = os.path.join(write_dir, model_id.split("/")[-1], dataset+"-Python")
            else:
                root_folder = os.path.join(write_dir, model_id.split("/")[-1], dataset)
    else:
        if pl == 'Python':
            if dataset in ['CodeNet']:
                root_folder = os.path.join(write_dir, 'scratch_pad', model_id.split("/")[-1], dataset+"-Python")
            else:
                root_folder = os.path.join(write_dir, 'scratch_pad', model_id.split("/")[-1], dataset)
    parse_results(root_folder)
    predictions = extract_prediction(root_folder, scratch_pad)
    # print(predictions)
    
    if dataset == 'CodeNet':
        gt_path = f"/home/changshu/CodeMind/dataset/Loops/{dataset}-{pl}.json"
    else:
        gt_path = f"/home/changshu/CodeMind/dataset/Loops/{dataset}.json"
    gt = json.load(open(gt_path, 'r'))
    cleaned_gt = {}
    for k in gt.keys():
        if len(gt[k]['For']):
            cleaned_gt[k] = {}
            for j in gt[k]['For']:
                vnames = j['iterator']
                vvalues = j['iterator_gt']
                lineno = j['line_no']
                cleaned_gt[k][lineno] = {}
                for a,b in zip(vnames, vvalues):
                    cleaned_gt[k][lineno][a] = b
    correct_count = 0
    report = {}
    for k in cleaned_gt.keys():
        report[k] = {}
        report[k]['gt'] = cleaned_gt[k]
        report[k]['prediction'] = predictions[k]
        if cleaned_gt[k] == predictions[k]:
            correct_count += 1
            report[k]['label'] = 1
        else:
            report[k]['label'] = 0
    print('correct', correct_count)
    print('total', len(cleaned_gt.keys()))
    print('%', 100*correct_count/len(cleaned_gt.keys()))
    