from typing import *
def eat(number, need, remaining):
    if(need <= remaining):
        return [ number + need , remaining-need ]
    else:
        return [ number + remaining , 0]

output = eat(4, 5, 1)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_159__0/output.txt", 'w')
file.write(str(output))
file.close()
    