from typing import *
def has_close_elements(numbers: List[float], threshold: float) -> bool:
    for idx, elem in enumerate(numbers):
        for idx2, elem2 in enumerate(numbers):
            if idx != idx2:
                distance = abs(elem - elem2)
                if distance < threshold:
                    return True

    return False

output = has_close_elements([1.1, 2.2, 3.1, 4.1, 5.1], 0.5)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_0__1/output.txt", 'w')
file.write(str(output))
file.close()
    