import sys

n = int(sys.stdin.readline())
eratosu = [0] * 100000

for i in range(1, 101):
    for j in range(1, 101):
        for k in range(1, 101):
            if i * i + j * j + k * k >= 100000:
                continue
            result = i * i + j * j + k * k + i * j + j * k + k * i
            eratosu[result] += 1

for i in range(1, n + 1):
    print(eratosu[i])