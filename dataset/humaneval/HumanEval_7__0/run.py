from typing import *
def filter_by_substring(strings: List[str], substring: str) -> List[str]:
    return [x for x in strings if substring in x]

output = filter_by_substring(['xxx', 'asd', 'xxy', 'john doe', 'xxxAAA', 'xxx'], 'xxx')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_7__0/output.txt", 'w')
file.write(str(output))
file.close()
    