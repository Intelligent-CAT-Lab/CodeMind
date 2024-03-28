class main:
    def getPoints(n, k, l, r, sAll, sk):
        ans = [l] * n
        sAll -= sk + (n - k) * l
        sk -= k * l
        while sk > 0:
            idx = n - 1
            while sk > 0 and idx >= n - k:
                ans[idx] += 1
                sk -= 1
                idx -= 1
        while sAll > 0:
            idx = 0
            while sAll > 0 and idx < n - k:
                ans[idx] += 1
                sAll -= 1
                idx += 1
        return ans
    
    input_str = input()
    inputs = list(map(int, input_str.split()))
    n, k, l, r, sAll, sk = inputs
    ans = getPoints(n, k, l, r, sAll, sk)
    print(*ans)