from typing import *
def all_prefixes(string: str) -> List[str]:
    result = []

    for i in range(len(string)):
        result.append(string[:i+1])
    return result

output = all_prefixes('asdfgh') 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_14/output.txt", 'w')
file.write(str(output))
file.close()
    