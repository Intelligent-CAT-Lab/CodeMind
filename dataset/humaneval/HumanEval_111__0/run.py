from typing import *
def histogram(test):
    dict1={}
    list1=test.split(" ")
    t=0

    for i in list1:
        if(list1.count(i)>t) and i!='':
            t=list1.count(i)
    if t>0:
        for i in list1:
            if(list1.count(i)==t):
                
                dict1[i]=t
    return dict1

output = histogram('a b c d g')
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_111__0/output.txt", 'w')
file.write(str(output))
file.close()
    