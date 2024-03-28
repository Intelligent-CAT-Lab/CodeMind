import sys

def permutationWhoseNumberOfIncreasingSequenceIsK(K):
    cur = (1 << (K.bit_length())) - 1
    list = []
    for i in range(cur.bit_length()):
        list.append(i)
    p = cur.bit_length()
    for d in range(cur.bit_length() - 1, -1, -1):
        x = 1 << d
        if cur + x <= K:
            cur += x
            list.insert(d, p)
            p += 1
    return list

def solve():
    n = int(input())
    perm = permutationWhoseNumberOfIncreasingSequenceIsK(n)
    print(len(perm) * 2)
    for i in range(len(perm)):
        if i > 0:
            print(" ", end="")
        print(i + 1, end="")
    for i in range(len(perm)):
        print(" ", end="")
        print(perm[i] + 1, end="")
    print()

solve()