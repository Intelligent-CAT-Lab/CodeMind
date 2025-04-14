from typing import *
def below_zero(operations: List[int]) -> bool:
    balance = 0

    for op in operations:
        balance += op
        if balance < 0:
            return True

    return False

output = below_zero([1, -1, 2, -2, 5, -5, 4, -4])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_3__1/output.txt", 'w')
file.write(str(output))
file.close()
    