import sys


def main():
    n = int(input())
    if (n & -n) == n:
        print("No")
        return
    print("Yes")
    if n == 3:
        print("1 2\n2 3\n3 4\n4 5\n5 6")
        return
    k = bsr(n)
    for i in range(1, (1 << k) - 1):
        print(f"{i} {i + 1}")
    print(f"{(1 << k) - 1} {n + 1}")
    for i in range(1, (1 << k) - 1):
        print(f"{n + i} {n + i + 1}")
    print(f"{(1 << k) + 1} {n + (1 << k)}")
    print(f"{n + (1 << k)} {n + 1}")
    print(f"{n + 1} {n + (1 << k) + 1}")
    print(f"{n + (1 << k) + 1} {1 << k}")
    for j in range(2, n + 1 - (1 << k)):
        print(f"{n + j} {n + (1 << k) + j}")
        print(f"{n + (1 << k) + j - 1} {1 << k} + j")


def bsr(n):
    return n.bit_length() - 1


if __name__ == "__main__":
    main()