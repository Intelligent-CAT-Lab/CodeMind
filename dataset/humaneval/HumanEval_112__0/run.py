from typing import *
def reverse_delete(s,c):
    s = ''.join([char for char in s if char not in c])
    return (s,s[::-1] == s)

output = reverse_delete("abcdedcba","v")
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_112__0/output.txt", 'w')
file.write(str(output))
file.close()
    