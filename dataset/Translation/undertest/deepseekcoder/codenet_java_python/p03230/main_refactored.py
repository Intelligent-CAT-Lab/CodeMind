class main:
    import sys
    
    def combination(target, k, list):
        if len(list) == k:
            global v
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
    
    n = int(sys.stdin.readline())
    
    if n == 1:
        print("Yes")
        print(2)
        print("1 1")
        print("1 1")
        sys.exit()
    if n == 2:
        print("No")
        sys.exit()
    
    k = 0
    for i in range(3, n + 1):
        ic2 = i * (i - 1) // 2
        if ic2 == n:
            k = i
            break
        elif ic2 > n:
            print("No")
            sys.exit()
    
    print("Yes")
    
    ansList = [[] for _ in range(k)]
    target = list(range(k))
    combination(target, 2, [])
    
    print(k)
    for i in range(k):
        print(f"{k - 1} {' '.join(map(str, ansList[i]))}")