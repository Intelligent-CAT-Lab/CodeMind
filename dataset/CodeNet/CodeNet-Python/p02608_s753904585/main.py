def main():
    N = int(input())
    d = [0 for _ in range(N)]
    r = 100
    ii = 0
    for i in range(1, r):
        ii += 2* i - 1
        for j in range(1, i + 1):
            s = i + j
            c = ii + s * j
            l = 6
            if i == j:
                l = 3
            if c + 1 + s > N:
                break
            for k in range(1, j + 1):
                c += 2* k - 1 + s
                if c <= N:
                    if j == k:
                        l = 3
                        if i == k:
                            l = 1
                    d[c - 1] += l
                else:
                    break
    print(*d, sep="\n")


if __name__ == "__main__":
    main()
