from typing import *
def mean_absolute_deviation(numbers: List[float]) -> float:
    mean = sum(numbers) / len(numbers)
    return sum(abs(x - mean) for x in numbers) / len(numbers)

output = mean_absolute_deviation([1.0, 2.0, 3.0]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_4/output.txt", 'w')
file.write(str(output))
file.close()
    