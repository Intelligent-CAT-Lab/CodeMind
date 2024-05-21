def combination(target, k, list):
    if len(list) == k:
        v += 1
        for i in list:
            ansList[i].append(v)
        return
    
    i = 0
    if list:
        i = list[-1] + 1
        if len(list) + len(target) - i < k:
            return
    for i in range(i, len(target)):
        list.append(i)
        combination(target, k, list)
        list.pop()

def main():
    n = int(input())
    if n == 1:
        print("Yes")
        print(2)
        print("1 1")
        print("1 1")
        return
    if n == 2:
        print("No")
        return
    
    k = 0
    for i in range(3, n + 1):
        ic2 = i * (i - 1) // 2
        if ic2 == n:
            k = i
            break
        elif ic2 > n:
            print("No")
            return
    print("Yes")
    
    global ansList, v
    ansList = [[] for _ in range(k)]
    target = list(range(k))
    combination(target, 2, [])
    
    print(k)
    for i in range(k):
        print(k - 1, end=' ')
        for j in ansList[i]:
            print(j, end=' ')
        print()

if __name__ == "__main__":
    main()