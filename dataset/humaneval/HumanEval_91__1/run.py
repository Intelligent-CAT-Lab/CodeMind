from typing import *
def is_bored(S):
    import re
    sentences = re.split(r'[.?!]\s*', S)
    return sum(sentence[0:2] == 'I ' for sentence in sentences)

output = is_bored("I love It !")
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_91__1/output.txt", 'w')
file.write(str(output))
file.close()
    