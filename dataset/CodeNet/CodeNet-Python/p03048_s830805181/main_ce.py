r,g,b,n = map(int,"1 2 3 4".split())
count = 0
for i in range(int(n/r)+1):
    for j in range(int((n-i*r)/g)+1):
        k =  n - i * r - j * g
        if k % b == 0:
            count += 1
print(count)
