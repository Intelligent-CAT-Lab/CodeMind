import sys
from typing import List

def solve(n: int) -> None:
    perm = permutation_whose_number_of_increasing_sequence_is_k(n)
    print(len(perm)*2)
    for i in range(1, len(perm)+1):
        print(i, end=" ")
    for num in perm:
        print(num+1, end=" ")
    print()

def permutation_whose_number_of_increasing_sequence_is_k(k: int) -> List[int]:
    cur = 1 << (k+1).bit_length() - 1
    perm = [i for i in range(cur.bit_count())]
    p = cur.bit_count()
    for d in range(cur.bit_count()-1, -1, -1):
        x = 1 << d
        if cur + x <= k:
            cur += x
            perm.insert(d, p)
            p += 1
    return perm

def main() -> None:
    n = int(sys.stdin.readline())
    solve(n)

if __name__ == "__main__":
    main()