if __name__ == "__main__":
    n, k = [int(x) for x in input().split()]
    a = [1, 0]
    for i in range(n):
        a = [0] + [a[i - 1] + i * a[i] for i in range(1, len(a))] + [0]
    print((sum(a[:k + 1]) % (10 ** 9 + 7)))

