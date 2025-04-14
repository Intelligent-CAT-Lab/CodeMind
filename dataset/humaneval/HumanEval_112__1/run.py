from typing import *
def reverse_delete(s,c):
    s = ''.join([char for char in s if char not in c])
    return (s,s[::-1] == s)

output = reverse_delete("mamma", "mia")
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_112__1/output.txt", 'w')
file.write(str(output))
file.close()
    