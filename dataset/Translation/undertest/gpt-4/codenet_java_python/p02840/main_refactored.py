class main:
    from collections import defaultdict
    import sys
    
    MOD = 998244353
    
    def solve():
        n, x, d = map(int, input().split())
        if d == 0:
            if x == 0:
                print(1)
                return
            else:
                print(n + 1)
                return
    
        if x == 0:
            print(1 + n * (n - 1) // 2)
            return
    
        m = defaultdict(list)
    
        for take in range(n + 1):
            b = take * x
            sum_ = take * (take - 1) // 2
            rsum = (n - take) * take + sum_
            c = b // d
            m[b % d].append((c + sum_, c + rsum))
    
        ans = 0
        for k, v in m.items():
            v.sort()
            l, r = 0, -1
            for p in v:
                if p[0] > r:
                    ans += r - l + 1 if r >= l else 0
                    l, r = p
                else:
                    r = max(r, p[1])
            ans += r - l + 1
    
        print(ans)
    
    
    def main():
        solve()
    
    if __name__ == "__main__":
        main()