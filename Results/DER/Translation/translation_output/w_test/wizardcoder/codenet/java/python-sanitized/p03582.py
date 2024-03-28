import java.util.ArrayList
import java.util.Collections
import java.util.List

def solve():
    a = na(3)
    list = ArrayList()
    for j in range(3):
        for i in range(a[j]):
            list.add(chr(ord('a') + j))

    while list.size() > 1:
        Collections.sort(list)
        last = list.size() - 1
        s = list.get(0) + list.get(last)
        list.set(0, s)
        list.remove(last)

    print(list.get(0))

def na(n):
    a = [0] * n
    for i in range(n):
        a[i] = int(input())
    return a

if __name__ == '__main__':
    solve()