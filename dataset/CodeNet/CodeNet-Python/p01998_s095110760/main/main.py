import math

N = int(eval(input()))
P = [True for x in range(N + 3)]

P[0] = False
P[1] = False

for i in range(2, int(math.sqrt(N + 3)) + 1):
    if P[i]:
        for j in range(i * 2, N + 3, i):
            P[j] = False

count = 0

for q in range(3, N + 1):
    if P[q] and P[2 + q]:
        count += 2

print(count)

