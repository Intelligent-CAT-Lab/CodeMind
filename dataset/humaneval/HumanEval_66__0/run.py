from typing import *
def digitSum(s):
    if s == "": return 0
    return sum(ord(char) if char.isupper() else 0 for char in s)

output = digitSum("abcCd")
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_66__0/output.txt", 'w')
file.write(str(output))
file.close()
    