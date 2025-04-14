from typing import *
def encrypt(s):
    d = 'abcdefghijklmnopqrstuvwxyz'
    out = ''
    for c in s:
        if c in d:
            out += d[(d.index(c)+2*2) % 26]
        else:
            out += c
    return out

output = encrypt('et')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_89__0/output.txt", 'w')
file.write(str(output))
file.close()
    