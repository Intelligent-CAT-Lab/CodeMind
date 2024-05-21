import math

def count(pnum):
    result = 0
    for i in range(int(math.log(pnum, 2)) + 1):
        result = 2**i
    return result

pnum = int(input())
print(count(pnum))