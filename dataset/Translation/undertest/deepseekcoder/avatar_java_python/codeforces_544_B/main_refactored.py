class main:
    def printIsland(n, count):
        a = (n + 1) // 2
        b = n // 2
        max = a * a + b * b
        if count > max:
            print("NO")
            return
        print("YES")
        for i in range(n):
            for j in range(n):
                if (i + j) % 2 == 0 and count > 0:
                    print('L', end='')
                    count -= 1
                else:
                    print('S', end='')
            print()
    
    n = int(input().split()[0])
    count = int(input().split()[1])
    printIsland(n, count)