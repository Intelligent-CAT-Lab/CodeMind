from typing import *
def filter_integers(values: List[Any]) -> List[int]:
    return [x for x in values if isinstance(x, int)]

output = filter_integers([])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_22__0/output.txt", 'w')
file.write(str(output))
file.close()
    