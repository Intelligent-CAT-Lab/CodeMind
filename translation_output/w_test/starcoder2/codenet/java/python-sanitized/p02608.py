import math

n = int(input())

eratosu = [0] * 100000

for i in range(1, 101):
    for j in range(1, 101):
        for k in range(1, 101):
            result = i * i + j * j + k * k + i * j + j * k + k * i
            if result >= 100000:
                continue
            eratosu[result] += 1

for i in range(1, n + 1):
    print(eratosu[i])