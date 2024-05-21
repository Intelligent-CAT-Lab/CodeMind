def combination(target, k, list):
    if len(list) == k:
        global v
        v += 1
        for i in list:
            ansList[i].append(v)
        return
    i = 0
    if len(list) > 0:
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
elif n == 2:
    print("No")
else:
    k = 0
    for i in range(3, n + 1):
        if i * (i - 1) // 2 == n:
            k = i
            break
        elif i * (i - 1) // 2 > n:
            print("No")
            break
    else:
        print("Yes")
        ansList = [[] for _ in range(k)]
        target = list(range(k))
        combination(target, 2, [])
        print(k)
        for i in range(k):
            print(k - 1, end=' ')
            for j in ansList[i]:
                print(j, end=' ')
            print()