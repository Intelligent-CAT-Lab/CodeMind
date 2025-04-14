from typing import *
def do_algebra(operator, operand):
    expression = str(operand[0])
    for oprt, oprn in zip(operator, operand[1:]):
        expression+= oprt + str(oprn)
    return eval(expression)

output = do_algebra(['//', '*'], [7, 3, 4])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_160__0/output.txt", 'w')
file.write(str(output))
file.close()
    