from typing import *
def fruit_distribution(s,n):
    lis = list()
    for i in s.split(' '):
        if i.isdigit():
            lis.append(int(i))
    return n - sum(lis)

output = fruit_distribution("5 apples and 6 oranges",21)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_67__1/output.txt", 'w')
file.write(str(output))
file.close()
    