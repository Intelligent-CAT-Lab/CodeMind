import sys

def permutation_whose_number_of_increasing_sequence_is_k(k):
    cur = (1 << (k + 1).bit_length()) // 2 - 1
    perm = [i for i in range(bin(cur).count('1'))]
    p = len(perm)
    for d in reversed(range(p)):
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
    print(' '.join(str(i+1) for i in range(len(perm))) + ' ' + ' '.join(str(val + 1) for val in perm))

if __name__ == "__main__":
    solve()