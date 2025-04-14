from typing import *
def count_upper(s):
    count = 0
    for i in range(0,len(s),2):
        if s[i] in "AEIOU":
            count += 1
    return count

output = count_upper('dBBE')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_98__0/output.txt", 'w')
file.write(str(output))
file.close()
    