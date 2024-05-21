def count(pnum):
    result = 0
    for i in range(31):
        if (2 ** i) <= pnum:
            result = 2 ** i
    return result

pnum = int(input())
print(count(pnum))