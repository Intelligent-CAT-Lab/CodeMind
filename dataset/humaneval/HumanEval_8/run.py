from typing import *
def sum_product(numbers: List[int]) -> Tuple[int, int]:
    sum_value = 0
    prod_value = 1

    for n in numbers:
        sum_value += n
        prod_value *= n
    return sum_value, prod_value

output = sum_product([1,1,1]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_8/output.txt", 'w')
file.write(str(output))
file.close()
    