import math
from collections import Counter

def factorization(n):
    list = []
    tmp = n
    for i in range(2, int(math.sqrt(n)) + 1):
        if tmp % i == 0:
            cnt = 0
            while tmp % i == 0:
                cnt += 1
                tmp //= i
            list.append((i, cnt))
    if tmp != 1:
        list.append((tmp, 1))
    if not list:
        list.append((n, 1))
    return list

def add_map(map, x, y):
    if x in map:
        map[x] += y
    else:
        map[x] = y

def main():
    N = int(input())
    map = {}
    for i in range(2, N + 1):
        list = factorization(i)
        for array in list:
            add_map(map, array[0], array[1])
    values = list(map.values())
    values.sort(reverse=True)
    ans = 0
    for i in range(len(values)):
        if values[i] >= 74:
            ans += 1
        if values[i] >= 24:
            for j in range(i):
                if values[j] >= 2:
                    ans += 1
        if values[i] >= 14:
            for j in range(i):
                if values[j] >= 4:
                    ans += 1
        if values[i] >= 4:
            for j in range(i + 1, len(values)):
                if values[j] >= 4:
                    for k in range(len(values)):
                        if i != k and j != k and values[k] >= 2:
                            ans += 1
    print(ans)

if __name__ == "__main__":
    main()