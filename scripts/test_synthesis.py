import os
import subprocess

def test_python(py_path):
    test_result = 1 ## pass
    try:
        test_result = subprocess.run(
        ['python', code_undertest_path],
        capture_output = True,
        text = True,
        timeout=100
        )
        
        if test_result.stderr:
            test_result_flag = 0
    except:
        test_result_flag = 0
    return test_result


if __name__ == "main":
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", type=str, default='none')
    parser.add_argument("--dataset", type=str, default='none', help="select one from [CodeNet, Avatar, cruxeval, mbpp, humaneval]")
    parser.add_argument("--writePath", type=str, default="../Experiment_Results/intermediate")
    parser.add_argument("--task", type=str, default="Synthesis")
    parser.add_argument('--use_test', help='use test dataset', action='store_true')
    parser.add_argument('--use_misleading_test', help='use test dataset', action='store_true')
    parser.add_argument('--test_one')
    args = parser.parse_args()

    model_id = args.model
    write_dir = args.writePath
    dataset = args.dataset
    task = args.task
    use_test = args.use_test
    use_misleading_test = args.use_misleading_test
    test_one = args.test_one

    if use_test:
        root_dir = os.path.join(write_dir, task, "use_test", model_id.split("/")[-1], dataset)
    elif use_misleading_test:
        root_dir = os.path.join(write_dir, task, "misleading_test", model_id.split("/")[-1], dataset)
    else:
        root_dir = os.path.join(write_dir, task, "no_test", model_id.split("/")[-1], dataset)
    
    total_samples = []
    pass_samples = []
    data_root = f"../dataset/Synthesis/{dataset}"
    for d in os.listdir(root_dir):
        total_samples.append(d)
        code_path = os.path.join(root_dir, d, 'main.py')
        if test_one:
            assertion_path = os.path.join(root_dir, d, 'assert.txt')
        else:
            assertion_path = os.path.join(root_dir, d, 'asserts.txt')
        path_ut = os.path.join(root_dir, d, 'main_underTest.py')
        if not os.path.exists(code_path) or not os.path.exists(assertion):
            continue
        code = open(code_path, 'r').read()
        assertion = open(assertion_path, 'r').read()

        code_ut = code + '\n' + assertion
        with open(path_ut, 'w') as wr:
            wr.write(code_ut)
        
        test_result = test_python(path_ut)

        if test_result:
            pass_samples.append(d)
    print("pass:"+ len(pass_samples) + '\t' + "total" + len(total_samples))

    log_path = os.path.join(root_dir, 'pass_id.txt')
    with open(log_path, 'w') as wrl:
        for i in pass_samples:
            wrl.write(i + '\n')