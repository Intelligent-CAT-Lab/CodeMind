from typing import *
def flip_case(string: str) -> str:
    return string.swapcase()

output = flip_case('These violent delights have violent ends')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_27__1/output.txt", 'w')
file.write(str(output))
file.close()
    