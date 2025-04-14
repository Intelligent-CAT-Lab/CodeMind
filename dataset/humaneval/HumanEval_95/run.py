from typing import *
def check_dict_case(dict):
    if len(dict.keys()) == 0:
        return False
    else:
        state = "start"
        for key in dict.keys():

            if isinstance(key, str) == False:
                state = "mixed"
                break
            if state == "start":
                if key.isupper():
                    state = "upper"
                elif key.islower():
                    state = "lower"
                else:
                    break
            elif (state == "upper" and not key.isupper()) or (state == "lower" and not key.islower()):
                    state = "mixed"
                    break
            else:
                break
        return state == "upper" or state == "lower" 

output = check_dict_case({"p":"pineapple", "b":"banana"}) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_95/output.txt", 'w')
file.write(str(output))
file.close()
    