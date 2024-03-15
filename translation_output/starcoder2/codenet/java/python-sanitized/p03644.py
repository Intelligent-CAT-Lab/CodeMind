import math

def count(pnum):
    result = 0
    for i in range(0, int(math.pow(2, i)) <= pnum):
        result = int(math.pow(2, i))
    return result

print(count(int(input())))