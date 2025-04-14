from typing import *
def remove_duplicates(numbers: List[int]) -> List[int]:
    import collections
    c = collections.Counter(numbers)
    return [n for n in numbers if c[n] <= 1]

output = remove_duplicates([])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_26__1/output.txt", 'w')
file.write(str(output))
file.close()
    