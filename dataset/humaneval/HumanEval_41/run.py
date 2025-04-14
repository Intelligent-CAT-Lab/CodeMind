from typing import *
def car_race_collision(n: int):
    return n**2

output = car_race_collision(2) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_41/output.txt", 'w')
file.write(str(output))
file.close()
    