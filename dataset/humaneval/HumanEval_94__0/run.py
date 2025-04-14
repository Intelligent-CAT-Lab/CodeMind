from typing import *
def skjkasdkd(lst):
    def isPrime(n):
        for i in range(2,int(n**0.5)+1):
            if n%i==0:
                return False

        return True
    maxx = 0
    i = 0
    while i < len(lst):
        if(lst[i] > maxx and isPrime(lst[i])):
            maxx = lst[i]
        i+=1
    result = sum(int(digit) for digit in str(maxx))
    return result


output = skjkasdkd([127, 97, 8192])
file = open("/home/changshu/CODEMIND/dataset/humaneval/HumanEval_94__0/output.txt", 'w')
file.write(str(output))
file.close()
    