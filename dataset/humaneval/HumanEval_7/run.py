from typing import *
def filter_by_substring(strings: List[str], substring: str) -> List[str]:
    return [x for x in strings if substring in x]

output = filter_by_substring([], 'john') 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_7/output.txt", 'w')
file.write(str(output))
file.close()
    