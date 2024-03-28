class main:
    import sys
    
    def solve(n, k, x0):
        if x0 == 0:
            print(0)
            return
    
        x = x0
        s = 10000
        count = [0] * s
        offset = 2 ** 63
        M = s / (2 ** 64)
        for i in range(n):
            at = int((x + offset) * M)
            if at < 0:
                at = 0
            if at >= s:
                at = s - 1
            count[at] += 1
            x ^= x << 13
            x ^= x >> 7
            x ^= x << 17
    
        sum = 0
        length = -1
        target = -1
        for i in range(s):
            if sum <= k and k < sum + count[i]:
                target = i
                length = count[i]
                break
            sum += count[i]
    
        now = 0
        is_ = [0] * length
        x = x0
        for i in range(n):
            at = int((x + offset) * M)
            if at < 0:
                at = 0
            if at >= s:
                at = s - 1
            if at == target:
                is_[now] = x
                now += 1
            x ^= x << 13
            x ^= x >> 7
            x ^= x << 17
    
        is_.sort()
        print(is_[k - sum])
    
    def main():
        n, k, x0 = map(int, sys.stdin.readline().split())
        solve(n, k, x0)
    
    if __name__ == "__main__":
        main()