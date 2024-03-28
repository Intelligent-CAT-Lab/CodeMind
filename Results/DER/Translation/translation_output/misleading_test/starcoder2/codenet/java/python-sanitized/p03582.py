import sys

def solve():
    a = [int(x) for x in sys.stdin.readline().split()]
    list = []
    for j in range(3):
        for i in range(a[j]):
            list.append(chr(ord('a') + j))

    while len(list) > 1:
        list.sort()
        last = len(list) - 1
        s = list[0] + list[last]
        list[0] = s
        del list[last]
    print(list[0])

solve()


Upvotes: 0