M, D = map(int, "15 40".split())
count = 0
for a in range(1, M+1):
    for b in range(22, D+1):
        d10, d1 = int(str(b)[0]), int(str(b)[1])
        if d10 >= 2 and d1 >= 2 and d10*d1 == a:
            count += 1
print(count)              
