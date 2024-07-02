def extract_void():
    api_list = []
    output_file = "/home/changshu/CodeMind/Tools/Variable/api_wo_return_java.txt"
    log_path = "/home/changshu/CodeMind/Tools/Variable/err_java.txt"
    with open(log_path, 'r') as f:
        lines = f.readlines()
        for i in range(len(lines)):
            if "error: 'void' type not allowed here" in lines[i]:
                api_line = lines[i+1].strip("\n")
                api = api_line.split('"+')[1]
                if api.endswith(");"):
                    api = api[:-2].split('(')[0]
                if api not in api_list:
                    api_list.append(api)
    with open(output_file, 'w') as wr:
        for a in api_list:
            wr.write(a+'\n')

extract_void()
