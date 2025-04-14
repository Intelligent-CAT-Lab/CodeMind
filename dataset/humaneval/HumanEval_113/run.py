from typing import *
def odd_count(lst):
    res = []
    for arr in lst:
        n = sum(int(d)%2==1 for d in arr)
        res.append("the number of odd elements " + str(n) + "n the str"+ str(n) +"ng "+ str(n) +" of the "+ str(n) +"nput.")
    return res

output = odd_count(['1234567']) 
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_113/output.txt", 'w')
file.write(str(output))
file.close()
    