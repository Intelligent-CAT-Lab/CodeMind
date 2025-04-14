from typing import *
def string_xor(a: str, b: str) -> str:
    def xor(i, j):
        if i == j:
            return '0'
        else:
            return '1'

    return ''.join(xor(x, y) for x, y in zip(a, b))

output = string_xor('0101', '0000')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_11__1/output.txt", 'w')
file.write(str(output))
file.close()
    