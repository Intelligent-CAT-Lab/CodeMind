def permutation_whose_number_of_increasing_sequence_is_k(k):
    cur = (1 << (k + 1).bit_length()) >> 1 - 1
    lst = [i for i in range(cur.bit_count())]
    p = cur.bit_count()
    for d in range(cur.bit_count() - 1, -1, -1):
        x = 1 << d
        if cur + x <= k:
            cur += x
            lst.insert(d, p)
            p += 1
    return lst

def solve(n):
    perm = permutation_whose_number_of_increasing_sequence_is_k(n)
    print(len(perm) * 2)
    for i in range(1, len(perm) + 1):
        print(i, end=' ')
    for i in perm:
        print(i + 1, end=' ')
    print()

if __name__ == '__main__':
    n = int(input())
    solve(n)