class main:
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
    
    if __name__ == "__main__":
        n, k, l, r, s_all, sk = map(int, sys.stdin.readline().split())
        ans = get_points(n, k, l, r, s_all, sk)
        for num in ans:
            print(num, end=" ")