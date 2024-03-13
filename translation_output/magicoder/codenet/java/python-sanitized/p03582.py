import sys
import time
import string

def solve():
    a = [int(i) for i in input().split()]
    list = []
    for j in range(3):
        for i in range(a[j]):
            list.append(string.ascii_lowercase[j])

    while len(list) > 1:
        list.sort()
        last = len(list) - 1
        s = list[0] + list[last]
        list[0] = s
        list.pop(last)
    print(list[0])

if __name__ == "__main__":
    start = time.time()
    solve()
    print(f"{(time.time() - start) * 1000}ms")