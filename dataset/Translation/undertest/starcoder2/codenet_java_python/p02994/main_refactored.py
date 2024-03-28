class main:
    n, l = map(int, input().split())
    diff = []
    for i in range(1, n+1):
        value = l+i-1
        if value < 0:
            value = value * -1
        diff.append(value)
    
    removeK = diff.index(min(diff)) + 1
    print(n*l + n*(n+1)/2 - n - (l+ removeK -1))