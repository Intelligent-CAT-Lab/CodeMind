def permutation_whose_number_of_increasing_sequence_is_k(k):
    n = 0
    while (1 << n) <= k:
        n += 1
    a = [i for i in range(1, n + 1)]
    for d in range(n - 1, -1, -1):
        x = 1 << d
        if k >= x:
            k -= x
            a.insert(d, n + 1)
            n += 1
    return a

def solve():
    k = int(input())
    a = permutation_whose_number_of_increasing_sequence_is_k(k)
    print(len(a) * 2)
    print(*a, *reversed(a))

solve()