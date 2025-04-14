from typing import *
def filter_integers(values: List[Any]) -> List[int]:
    return [x for x in values if isinstance(x, int)]

output = filter_integers([4, {}, [], 23.2, 9, 'adasd'])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_22__1/output.txt", 'w')
file.write(str(output))
file.close()
    