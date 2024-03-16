import sys

def solve(n):
    perm = permutation_whose_number_of_increasing_sequence_is_k(n)
    print(len(perm) * 2)
    for i in range(1, len(perm) + 1):
        if i > 1:
            print(" ", end="")
        print(i, end="")
    for i in range(len(perm)):
        print(" ", end="")
        print(perm[i] + 1, end="")
    print()

def permutation_whose_number_of_increasing_sequence_is_k(k):
    cur = (1 << (k + 1).bit_length()) // 2 - 1
    perm_list = [i for i in range(bin(cur).count('1'))]
    p = bin(cur).count('1')
    for d in reversed(range(bin(cur).count('1'))):
        x = 1 << d
        if cur + x <= k:
            cur += x
            perm_list.insert(d, p)
            p += 1
    return perm_list

def main():
    start_time = time.time()
    n = int(input().strip())
    solve(n)
    sys.stdout.flush()
    print(f"{time.time() - start_time}ms", file=sys.stderr)

if __name__ == "__main__":
    main()