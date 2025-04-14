from typing import *
def car_race_collision(n: int):
    return n**2

output = car_race_collision(4)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_41__0/output.txt", 'w')
file.write(str(output))
file.close()
    