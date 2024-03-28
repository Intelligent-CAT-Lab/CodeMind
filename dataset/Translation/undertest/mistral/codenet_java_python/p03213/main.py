def factorization(n):
    list = []
    tmp = n
    for i in range(2, int(n**0.5) + 1):
        if tmp % i == 0:
            cnt = 0
            while tmp % i == 0:
                cnt += 1
                tmp //= i
            list.append([i, cnt])
    if tmp != 1:
        list.append([tmp, 1])
    if len(list) == 0:
        list.append([n, 1])
    return list

map = {}
def add_map(x, y):
    if x in map:
        map[x] += y
    else:
        map[x] = y

N = int(input())
for i in range(2, N+1):
    list = factorization(i)
    for array in list:
        add_map(array[0], array[1])

values = list(map.values())
values.sort()
values.reverse()
ans = 0
for i in range(len(values)):
    if values[i] >= 74:
        ans += 1
for i in range(len(values)):
    if values[i] >= 24:
        for j in range(len(values)):
            if i == j:
                continue
            if values[j] >= 2:
                ans += 1
for i in range(len(values)):
    if values[i] >= 14:
        for j in range(len(values)):
            if i == j:
                continue
            if values[j] >= 4:
                ans += 1
for i in range(len(values)):
    if values[i] >= 4:
        for j in range(i+1, len(values)):
            if values[j] >= 4:
                for k in range(len(values)):
                    if i == k or j == k:
                        continue
                    if values[k] >= 2:
                        ans += 1

print(ans)