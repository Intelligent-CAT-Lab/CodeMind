from typing import *
def remove_duplicates(numbers: List[int]) -> List[int]:
    import collections
    c = collections.Counter(numbers)
    return [n for n in numbers if c[n] <= 1]

output = remove_duplicates([1, 2, 3, 4])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_26__0/output.txt", 'w')
file.write(str(output))
file.close()
    