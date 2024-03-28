class main:
    import sys
    
    def solve(n, w):
        flag = [False] * (n + 1)
        count = [0] * (n + 1)
        sum = 0
        left = 1
        right = w + 1
    
        for i in range(1, w):
            for k in range(1, int(i ** 0.5) + 1):
                if i % k == 0:
                    count[k] += 1
                    update(flag, sum, count, k)
                    if i // k != k:
                        count[i // k] += 1
                        update(flag, sum, count, i // k)
    
        for i in range(n - w + 1):
            left = i + 1
            right = i + w + 1
            for k in range(1, int(i ** 0.5) + 1):
                if i % k == 0:
                    count[k] -= 1
                    update(flag, sum, count, k)
                    if i // k != k:
                        count[i // k] -= 1
                        update(flag, sum, count, i // k)
            for k in range(1, int((i + w) ** 0.5) + 1):
                if (i + w) % k == 0:
                    count[k] += 1
                    update(flag, sum, count, k)
                    if (i + w) // k != k:
                        count[(i + w) // k] += 1
                        update(flag, sum, count, (i + w) // k)
            update(flag, sum, count, left - 1)
            update(flag, sum, count, right - 1)
            print(sum + (i < n - w) * " ", end="")
    
    def update(flag, sum, count, i):
        det = left <= i < right
        if flag[i] and not det and count[i] < 2:
            flag[i] = False
            sum -= 1
        if not flag[i] and (det or count[i] >= 2):
            flag[i] = True
            sum += 1
    
    n, w = map(int, sys.stdin.readline().split())
    solve(n, w)