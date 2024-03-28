class main:
    import sys
    from math import gcd
    from sympy import isprime
    
    def get_snt(n):
        snt = []
        x = 2
        while len(snt) < n * 2:
            if isprime(x):
                snt.append(x)
            x += 1
        return snt
    
    def get_matrix(n, snt):
        a = [[0]*n for _ in range(n)]
        for i in range(n):
            for j in range(i % 2, n, 2):
                a1 = (i + j) // 2
                a2 = (j - i + n - 1) // 2 + n
                a[i][j] = snt[a1] * snt[a2]
        return a
    
    def update_matrix(n, a, snt):
        dx = [-1, 0, 1, 0]
        dy = [0, 1, 0, -1]
        for i in range(n):
            for j in range((i + 1) % 2, n, 2):
                gcd_val = 0
                lcm_val = 1
                for k in range(4):
                    if 0 <= i + dx[k] < n and 0 <= j + dy[k] < n:
                        if gcd_val == 0:
                            gcd_val = a[i + dx[k]][j + dy[k]]
                            lcm_val = gcd_val
                        else:
                            gcd_val = gcd(lcm_val, a[i + dx[k]][j + dy[k]])
                            lcm_val = lcm_val // gcd_val * a[i + dx[k]][j + dy[k]]
                a[i][j] = lcm_val + 1
        return a
    
    def solve(n):
        snt = get_snt(n)
        a = get_matrix(n, snt)
        a = update_matrix(n, a, snt)
        for row in a:
            print(' '.join(map(str, row)))
    
    def main():
        n = int(sys.stdin.readline().strip())
        solve(n)
    
    if __name__ == "__main__":
        main()