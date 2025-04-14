from typing import *
def filter_by_prefix(strings: List[str], prefix: str) -> List[str]:
    return [x for x in strings if x.startswith(prefix)]

output = filter_by_prefix([], 'john') 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_29/output.txt", 'w')
file.write(str(output))
file.close()
    