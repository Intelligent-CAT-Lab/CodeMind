import os
import argparse
if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", type=str, default='none')
    parser.add_argument("--dataset", type=str, default='none', help="select one from [CodeNet, Avatar, cruxeval, mbpp, humaneval]")
    parser.add_argument("--writePath", type=str, default="../Experiment_Results/intermediate")
    parser.add_argument("--task", type=str, default="Synthesis")
    parser.add_argument('--use_test', help='use test dataset', action='store_true')
    parser.add_argument('--use_misleading_test', help='use test dataset', action='store_true')
    parser.add_argument('--der', help='use test dataset', action='store_true')
    args = parser.parse_args()

    model_id = args.model
    write_dir = args.writePath
    dataset = args.dataset
    task = args.task
    use_test = args.use_test
    use_misleading_test = args.use_misleading_test
    der = args.der

    if der:
        if use_test:
            root_dir = os.path.join(write_dir, 'DER', task, "use_test", model_id.split("/")[-1], dataset)
        elif use_misleading_test:
            root_dir = os.path.join(write_dir, 'DER', task, "misleading_test", model_id.split("/")[-1], dataset)
        else:
            root_dir = os.path.join(write_dir, 'DER', task, "no_test", model_id.split("/")[-1], dataset)
    else:
        if use_test:
            root_dir = os.path.join(write_dir, 'SR', task, "use_test", model_id.split("/")[-1], dataset)
        elif use_misleading_test:
            root_dir = os.path.join(write_dir, 'SR', task, "misleading_test", model_id.split("/")[-1], dataset)
        else:
            root_dir = os.path.join(write_dir, 'SR', task, "no_test", model_id.split("/")[-1], dataset)
    # print(root_dir)
    for d in os.listdir(root_dir):
        response_path = os.path.join(root_dir, d, 'raw_output.txt')
        raw_output = open(response_path, 'r').read()

        if 'gpt-' in model_id or 'CodeQwen' in model_id:
            code = raw_output.split("```python")[1].split("```")[0]
        if "Magicoder" in model_id:
            code = raw_output.split('@@ Response')[1].split("```python")[1].split("```")[0]
        if "CodeLlama" in model_id or "Mistral" in model_id:
            code = raw_output.split('[/INST]')[1].split('[PYTHON]')[1].split('[/PYTHON]')[0]
        if "deepseek-coder" in model_id:
            code = raw_output.split('### Response')[1].split('```python')[1].split('```')[0]
        if "starcoder" in model_id:
            code = raw_output.split('<fim_middle>')[1].split('[python]')[1].split('[/python]')[0]
        if "WizardCoder" in model_id:
            code = raw_output.split('### Response:')[1].split('```python')[1].split('```')[0]
        
        write_path = os.path.join(root_dir, d, 'main.py')
        with open(write_path, 'w', encoding='utf-8') as wr:
            wr.write(code)


