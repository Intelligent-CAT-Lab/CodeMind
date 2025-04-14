from typing import *
def all_prefixes(string: str) -> List[str]:
    result = []

    for i in range(len(string)):
        result.append(string[:i+1])
    return result

output = all_prefixes('')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_14__1/output.txt", 'w')
file.write(str(output))
file.close()
    