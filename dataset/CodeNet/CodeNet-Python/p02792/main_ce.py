N=int("25")
num = [[0 for i in range(10)] for j in range(10)]
for i in range(1,N+1):
    if i % 10 > 0:
        num[int(str(i)[0])][i % 10] += 1
#print num
c = 0
for i in range(1,10):
    for j in range(1,10):
        c += num[i][j]*num[j][i]
print c
