from typing import *
def is_palindrome(text: str):
    for i in range(len(text)):
        if text[i] != text[len(text) - 1 - i]:
            return False
    return True

output = is_palindrome('xywyx') 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_48/output.txt", 'w')
file.write(str(output))
file.close()
    