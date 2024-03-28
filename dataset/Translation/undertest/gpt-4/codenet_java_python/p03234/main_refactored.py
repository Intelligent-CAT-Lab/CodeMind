class main:
    import os
    
    MOD = 10**9 + 7
    
    def ways_to_pair(x, memo_ways_to_pair):
        if memo_ways_to_pair[x] != -1:
            return memo_ways_to_pair[x]
        if x % 2 == 1:
            memo_ways_to_pair[x] = 0
        elif x == 0:
            memo_ways_to_pair[x] = 1
        else:
            memo_ways_to_pair[x] = (ways_to_pair(x - 2, memo_ways_to_pair) * (x - 1)) % MOD
        return memo_ways_to_pair[x]
    
    def inside(a, x, y):
        return x <= a <= y
    
    def caldp(x, y, n, f, k, a, b, dp, memo_ways_to_pair):
        if dp[x][y] != -1:
            return dp[x][y]
        not_paired_in_xy = (y - x + 1) - (f[y] - (f[x - 1] if x > 1 else 0))
        for i in range(1, k + 1):
            p1 = inside(a[i], x, y)
            p2 = inside(b[i], x, y)
            if p1 != p2:
                dp[x][y] = 0
                return dp[x][y]
        dp[x][y] = ways_to_pair(not_paired_in_xy, memo_ways_to_pair)
        for z in range(x + 1, y):
            not_paired_in_zy = (y - z) - (f[y] - f[z])
            dp[x][y] = (dp[x][y] - caldp(x, z, n, f, k, a, b, dp, memo_ways_to_pair) * ways_to_pair(not_paired_in_zy, memo_ways_to_pair) + MOD * MOD) % MOD
        return dp[x][y]
    
    def main(input_path, output_path):
        # Attempt to open the input file, otherwise read from standard input
        if os.path.isfile(input_path):
            with open(input_path, 'r') as file:
                data = file.read().strip().split('\n')
        else:
            data = input().strip().split('\n')
    
        # Attempt to create/open the output file, otherwise write to standard output
        if output_path:
            output = open(output_path, 'w')
        else:
            output = None
    
        n, k = map(int, data[0].split())
        n *= 2
        a = [0] * (k + 1)
        b = [0] * (k + 1)
        f = [0] * (n + 1)
        
        for i in range(1, k + 1):
            a[i], b[i] = map(int, data[i].split())
            f[a[i]] = 1
            f[b[i]] = 1
    
        for i in range(1, n + 1):
            f[i] += f[i - 1]
    
        dp = [[-1 for _ in range(n + 1)] for _ in range(n + 1)]
        memo_ways_to_pair = [-1 for _ in range(n + 1)]
    
        res = 0
        for x in range(1, n + 1):
            for y in range(x, n + 1):
                not_paired_outside_xy = (n - (y - x + 1)) - (f[n] - (f[y] - (f[x - 1] if x > 1 else 0)))
                res = (res + caldp(x, y, n, f, k, a, b, dp, memo_ways_to_pair) * ways_to_pair(not_paired_outside_xy, memo_ways_to_pair) % MOD) % MOD
    
        if output:
            output.write(str(res))
            output.close()
        else:
            print(res)
    
    if __name__ == '__main__':
        main('input.txt', 'output.txt')