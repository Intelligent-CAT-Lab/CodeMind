import sys

def permutation_whose_number_of_increasing_sequence_is_k(k):
    cur = (1 << (k + 1)).bit_length() - 1
    perm = list(range(cur))
    p = cur
    for d in range(cur - 1, -1, -1):
        x = 1 << d
        if cur + x <= k:
            cur += x
            perm.insert(d, p)
            p += 1
    return perm

def solve():
    n = int(input())
    perm = permutation_whose_number_of_increasing_sequence_is_k(n)
    print(len(perm) * 2)
    print(*(i + 1 for i in range(1, len(perm) + 1)))
    print(*(perm[i] + 1 for i in range(len(perm))))

if __name__ == "__main__":
    solve()