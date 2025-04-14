from typing import *
def decimal_to_binary(decimal):
    return "db" + bin(decimal)[2:] + "db"

output = decimal_to_binary(0) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_79/output.txt", 'w')
file.write(str(output))
file.close()
    