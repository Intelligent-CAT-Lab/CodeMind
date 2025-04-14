from typing import *
def largest_smallest_integers(lst):
    smallest = list(filter(lambda x: x < 0, lst))
    largest = list(filter(lambda x: x > 0, lst))
    return (max(smallest) if smallest else None, min(largest) if largest else None)

output = largest_smallest_integers([2, 4, 1, 3, 5, 7]) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_136/output.txt", 'w')
file.write(str(output))
file.close()
    