def count(pnum):
    result = 0
    for i in range(0, pnum + 1):
        result = 2 ** i
    return result

pnum = int(input())
print(count(pnum))