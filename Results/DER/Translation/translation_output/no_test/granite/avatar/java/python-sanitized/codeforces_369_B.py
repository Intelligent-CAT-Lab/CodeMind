import sys

def get_points(n, k, l, r, s_all, sk):
    ans = [l] * n
    s_all -= sk + (n - k) * l
    sk -= k * l
    while sk > 0:
        idx = n - 1
        while sk > 0 and idx >= n - k:
            ans[idx] += 1
            sk -= 1
            idx -= 1
    while s_all > 0:
        idx = 0
        while s_all > 0 and idx < n - k:
            ans[idx] += 1
            s_all -= 1
            idx += 1
    return ans

def main():
    scan = sys.stdin
    n = int(scan.readline())
    k = int(scan.readline())
    l = int(scan.readline())
    r = int(scan.readline())
    s_all = int(scan.readline())
    sk = int(scan.readline())
    ans = get_points(n, k, l, r, s_all, sk)
    print(" ".join(map(str, ans)))

if __name__ == "__main__":
    main()