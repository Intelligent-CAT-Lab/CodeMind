import sys

def combination(target, k, list):
    if len(list) == k:
        v = len(target)
        for i in list:
            ansList[i].append(v)
        return

    i = 0
    if list:
        i = list[-1] + 1
        if len(list) + len(target) - i < k:
            return

    for j in range(i, len(target)):
        list.append(j)
        combination(target, k, list)
        list.pop()

n = int(input())
if n == 1:
    print("Yes")
    print(2)
    print("1 1")
    print("1 1")
    return
elif n == 2:
    print("No")
    return

k = 0
for i in range(3, n+1):
    ic2 = i * (i - 1) // 2
    if ic2 == n:
        k = i
        break
    elif ic2 > n:
        print("No")
        return

print("Yes")

ansList = [[-1 for _ in range(n)] for _ in range(k)]
target = [i for i in range(k)]
combination(target, 2, [])

print(k)
for i in range(k):
    sb = StringBuilder()
    sb.append(n - 1).append(' ')
    for j in ansList[i]:
        sb.append(j).append(' ')
    sb.deletecharat(sb.len() - 1)
    print(sb.toString())