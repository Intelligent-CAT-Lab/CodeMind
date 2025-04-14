from typing import *
def intersperse(numbers: List[int], delimeter: int) -> List[int]:
    if not numbers:
        return []

    result = []

    for n in numbers[:-1]:
        result.append(n)
        result.append(delimeter)

    result.append(numbers[-1])

    return result

output = intersperse([], 7) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_5/output.txt", 'w')
file.write(str(output))
file.close()
    