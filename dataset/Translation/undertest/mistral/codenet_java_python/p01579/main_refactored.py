class main:
    import sys
    
    def run():
        s = input()
        solve(s)
    
    def solve(s):
        n = len(s)
        count = [0] * (2 * n + 1)
        now = 0
        for i in range(n):
            if s[i] == '(':
                now += 1
            else:
                now -= 1
            count[now + n] += 1
        # debug(count)
        now = 0
        ans = 0
        for i in range(n):
            if s[i] == '(':
                now += 1
            else:
                now -= 1
            count[now + n] -= 1
            # debug(now, count[now + n])
            ans += count[now + n]
        print(ans)
    
    def debug(count):
        print(count)
    
    if __name__ == '__main__':
        run()