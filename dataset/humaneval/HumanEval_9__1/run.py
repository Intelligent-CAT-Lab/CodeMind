from typing import *
def rolling_max(numbers: List[int]) -> List[int]:
    running_max = None
    result = []

    for n in numbers:
        if running_max is None:
            running_max = n
        else:
            running_max = max(running_max, n)

        result.append(running_max)

    return result

output = rolling_max([1, 2, 3, 4])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_9__1/output.txt", 'w')
file.write(str(output))
file.close()
    