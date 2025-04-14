from typing import *
def filter_by_substring(strings: List[str], substring: str) -> List[str]:
    return [x for x in strings if substring in x]

output = filter_by_substring(['xxx', 'asd', 'aaaxxy', 'john doe', 'xxxAAA', 'xxx'], 'xx')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_7__1/output.txt", 'w')
file.write(str(output))
file.close()
    