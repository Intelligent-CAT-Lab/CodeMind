
import re
import os
def parse_log_python(log_path):
    lineno_list = []
    state_list = []
    state_dict = {} ## key: lineno; value: [{state_1}, {state_2}, ...]
    if not os.path.exists(log_path):
        return False, {}
    with open(log_path, 'r', encoding='utf-8') as f:
        text = f.read()

        if "-> self.quitting = True" not in text:
            return False, {}
        else:
            text = "".join(text.split("--Return--")[:-2])
            lines = text.split("\n")
            for line in lines:
                if line.startswith("->"):
                    pattern = r"##line:\((\d+)\)"
                    match = re.search(pattern, line)
                    if match:
                        lineno = match.group(1)
                    else:
                        lineno = "NA"
                    lineno_list.append(lineno)
                if line.startswith("(Pdb) {"):
                    line = line.strip("\n")
                    line = line.lstrip("(Pdb) ")
                    if "<locals>" in line:
                        line = line.replace("<locals>","")
                    if "<lambda> " in line:
                        line = line.replace("<lambda>","")
                    cleaned_string = re.sub(r"<[^>]+>", "'<complex_object_placeholder>'", line)
                    # print(cleaned_string)
                    state = eval(cleaned_string)
                    if state:
                        state_list.append(state)
                    else:
                        state_list.append({})
            for i,j in zip(lineno_list, state_list[1:]):
                if i not in state_dict.keys():
                    state_dict[i] = []
                state_dict[i].append(j)
            if state_dict:
                return True, state_dict
            else:
                return False, state_dict


if __name__ == "__main__":
    path = "/home/changshu/LLM_REASONING/prompts/single_line_all_1_Python/p01772_s174704165/log.txt"
    _,a = parse_log_python(path)
    print(a)