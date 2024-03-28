def solve():
    a = list(map(int, input().split()))
    list = []
    for j in range(3):
        for i in range(a[j]):
            list.append(chr(ord('a') + j))

    while len(list) > 1:
        list.sort()
        last = len(list) - 1
        s = list[0] + list[last]
        list[0] = s
        list.pop(last)
    print(''.join(list))

solve()