def get_points(n, k, l, r, sAll, sk):
    ans = [l] * n
    sAll -= sk + (n - k) * l
    sk -= k * l
    while sk > 0:
        idx = n - 1
        while sk > 0 and idx >= n - k:
            ans[idx] += 1
            idx -= 1
            sk -= 1

    while sAll > 0:
        idx = 0
        while sAll > 0 and idx < n - k:
            ans[idx] += 1
            idx += 1
            sAll -= 1

    return ans


def main():
    n, k, l, r, sAll, sk = map(int, input().split())
    ans = get_points(n, k, l, r, sAll, sk)
    print(' '.join(map(str, ans)))


if __name__ == "__main__":
    main()