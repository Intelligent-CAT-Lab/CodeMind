import sys

n = int(input())
eratosu = [0] * 100000

for i in range(1, 101):
    for j in range(1, 101):
        for k in range(1, 101):
            result = i * i + j * j + k * k + i * j + j * k + k * i
            if result < 100000:
                eratosu[result] += 1

print(eratosu[1], end='')
for i in range(2, n + 1):
    print('\n' + str(eratosu[i]), end='')