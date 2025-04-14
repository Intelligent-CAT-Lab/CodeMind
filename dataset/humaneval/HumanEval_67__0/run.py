from typing import *
def fruit_distribution(s,n):
    lis = list()
    for i in s.split(' '):
        if i.isdigit():
            lis.append(int(i))
    return n - sum(lis)

output = fruit_distribution("2 apples and 3 oranges",5)
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_67__0/output.txt", 'w')
file.write(str(output))
file.close()
    