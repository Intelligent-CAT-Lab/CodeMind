from typing import *
def check_if_last_char_is_a_letter(txt):
 
    check = txt.split(' ')[-1]
    return True if len(check) == 1 and (97 <= ord(check.lower()) <= 122) else False

output = check_if_last_char_is_a_letter("apple pi e ")
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_134__0/output.txt", 'w')
file.write(str(output))
file.close()
    