import os
import shutil
import argparse

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", type=str, default='none')
    parser.add_argument("--dataset", type=str, default='none', help="select one from [codenet_java, codenet_python, avatar_java, avatar_python, cruxeval, mbpp, humaneval]")
    parser.add_argument("--writePath", type=str, default="../Experiment_Results/intermediate")
    parser.add_argument("--task", type=str, default="Synthesis")
    parser.add_argument("--pl", type=str, default="Python", help="select one from [Python, Java]")
    parser.add_argument('--use_test', help='use test dataset', action='store_true')
    parser.add_argument('--use_misleading_test', help='use test dataset', action='store_true')
    parser.add_argument('--src', type=str, default="Python", help="select one from [Python, Java]")
    parser.add_argument('--tgt', type=str, default="Python", help="select one from [Python, Java]")
    args = parser.parse_args()

    model_id = args.model
    write_dir = args.writePath
    dataset = args.dataset
    task = args.task
    use_test = args.use_test
    use_misleading_test = args.use_misleading_test
    # test_one = args.test_one
    # pl = args.pl
    tgt = args.tgt
    src = args.src



    if task == 'Synthesis':
        root_dir = os.path.join(write_dir, 'DER', task, "use_test", model_id.split("/")[-1], dataset)
        log_path = os.path.join(write_dir, 'DER', task, "use_test", model_id.split("/")[-1], dataset, 'pass_id.txt')
        dataset_dir = f"../dataset/{task}/{dataset}"
        new_ds_folder = "../Experiment_Results/DER/"+task + "/" + model_id.split("/")[-1] + "/" + dataset
        

    if task == 'Translate':
        root_dir = os.path.join(write_dir, 'DER', 'Translation', "no_test", model_id.split("/")[-1], dataset, src, tgt+'-sanitized')
        log_path = os.path.join(root_dir, 'pass_id.txt')
        dataset_dir = f"../dataset/{dataset}/{dataset}-{tgt}"
        new_ds_folder = "../Experiment_Results/DER/" + task + "/" + model_id.split("/")[-1] + "/" + dataset + "-" + tgt

    with open(log_path, 'r') as f:
        lines = f.readlines()
        for line in lines:
            code_id = line.replace("\n",'')
            if '.' in code_id:
                tgt_folder = os.path.join(new_ds_folder, code_id.split('.')[0])
            else:
                tgt_folder = os.path.join(new_ds_folder, code_id)
            if not os.path.exists(tgt_folder):
                os.makedirs(tgt_folder)
            if task == 'Translate':
                if tgt == 'Python':
                    tgt_code_path = os.path.join(tgt_folder, 'main.py')
                    src_code_path = os.path.join(root_dir, code_id)
                if tgt == 'Java':
                    tgt_code_path = os.path.join(tgt_folder, 'Main.java')
                    src_code_path = os.path.join(root_dir, code_id)                  
            if task == 'Synthesis':
                src_code_path = os.path.join(root_dir, code_id, 'main.py')
                tgt_code_path = os.path.join(tgt_folder, 'main.py')
            src_input_path = os.path.join(dataset_dir, code_id.split('.')[0], 'input.txt')
            tgt_input_path = os.path.join(tgt_folder, 'input.txt')
            src_output_path = os.path.join(dataset_dir, code_id.split('.')[0], 'output.txt')
            tgt_output_path = os.path.join(tgt_folder, 'output.txt')

            shutil.copy(src_code_path, tgt_code_path)
            shutil.copy(src_input_path, tgt_input_path)
            shutil.copy(src_output_path, tgt_output_path) 
    
    
    

