from typing import *
def filter_by_prefix(strings: List[str], prefix: str) -> List[str]:
    return [x for x in strings if x.startswith(prefix)]

output = filter_by_prefix(['a', 'ab', 'abc', 'ba', 'bb', 'bc'], 'a')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_29__1/output.txt", 'w')
file.write(str(output))
file.close()
    