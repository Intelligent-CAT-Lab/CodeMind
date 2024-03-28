class main:
    import sys
    
    def solve(N, d):
        if d == 1:
            return N * (N - 1) / 2
        elif d == 2:
            return N * (N - 1) / 2 - 1
        else:
            m = N - d
            ans = m * (m - 1) / 2 + 2 * m + (d - 2)
            return ans
    
    def main():
        N, d = map(int, raw_input().split())
        print solve(N, d)
    
    if __name__ == '__main__':
        main()