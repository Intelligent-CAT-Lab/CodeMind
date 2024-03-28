class main:
    import sys
    
    def debug(s):
        print(s, file=sys.stderr)
    
    def solve():
        n, w = map(int, input().split())
        flag = [False] * (n + 1)
        count = [0] * (n + 1)
        sum = 0
        left = 1
        right = w + 1
    
        for i in range(1, w):
            for k in range(1, int(i ** 0.5) + 1):
                if i % k == 0:
                    count[k] += 1
                    update(flag, sum, k)
                    if i // k != k:
                        count[i // k] += 1
                        update(flag, sum, i // k)
    
        for i in range(n - w + 1):
            left = i + 1
            right = i + w + 1
            for k in range(1, int(i ** 0.5) + 1):
                if i % k == 0:
                    count[k] -= 1
                    update(flag, sum, k)
                    if i // k != k:
                        count[i // k] -= 1
                        update(flag, sum, i // k)
    
            for k in range(1, int((i + w) ** 0.5) + 1):
                if (i + w) % k == 0:
                    count[k] += 1
                    update(flag, sum, k)
                    if (i + w) // k != k:
                        count[(i + w) // k] += 1
                        update(flag, sum, (i + w) // k)
    
            update(flag, sum, left - 1)
            update(flag, sum, right - 1)
            print(sum + (i < n - w) * " ", end="")
    
        print()
    
    def update(flag, sum, i):
        if flag[i] and not (left <= i < right) and count[i] < 2:
            flag[i] = False
            sum -= 1
        elif not flag[i] and (left <= i < right or count[i] >= 2):
            flag[i] = True
            sum += 1
    
    if __name__ == "__main__":
        solve()