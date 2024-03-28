class main:
    n, l = map(int, input().split())
    diff = [l + i - 1 for i in range(1, n+1)]
    diff.append(diff[0] * -1)
    diff.sort()
    removeK = diff.index(diff[0]) + 1
    print(n*l + n*(n+1)//2 - n - (l+ removeK -1))