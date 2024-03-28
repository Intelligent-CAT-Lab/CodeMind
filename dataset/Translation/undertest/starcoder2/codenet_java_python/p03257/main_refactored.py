class main:
    n = int(input())
    if n == 2:
        print("4 7")
        print("23 10")
        exit()
    
    snt = [0] * (n * 2)
    cn = 0
    x = 2
    while cn < n * 2:
        if isSNT(x):
            snt[cn] = x
            cn += 1
        x += 1
    
    a = [[0] * n for i in range(n)]
    for i in range(n):
        for j in range(i % 2, n, 2):
            a1 = (i + j) // 2
            a2 = (j - i + n - 1) // 2 + n
            a[i][j] = snt[a1] * snt[a2]
    
    dx = [-1, 0, 1, 0]
    dy = [0, 1, 0, -1]
    for i in range(n):
        for j in range((i + 1) % 2, n, 2):
            gcd = 0
            tich = 1
            for k in range(4):
                if i + dx[k] < 0 or i + dx[k] >= n:
                    continue
                if j + dy[k] < 0 or j + dy[k] >= n:
                    continue
                if gcd == 0:
                    gcd = a[i + dx[k]][j + dy[k]]
                    tich = gcd
                else:
                    gcd = gcd(tich, a[i + dx[k]][j + dy[k]])
                    tich = tich // gcd * a[i + dx[k]][j + dy[k]]
            a[i][j] = tich + 1
    
    for i in range(n):
        for j in range(n):
            print(a[i][j], end=" ")
        print()
    
    
    def isSNT(x):
        for i in range(2, int(x ** 0.5) + 1):
            if x % i == 0:
                return False
        return True
    
    
    def gcd(a, b):
        return b if b == 0 else gcd(b, a % b)