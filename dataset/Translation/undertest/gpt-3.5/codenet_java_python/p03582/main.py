def solve():
    a = list(map(int, input().split()))
    lst = []
    for j in range(3):
        for i in range(a[j]):
            lst.append(chr(97 + j))
    
    while len(lst) > 1:
        lst.sort()
        s = lst[0] + lst[-1]
        lst[0] = s
        lst.pop()

    print(lst[0])

# Sample test case
solve()