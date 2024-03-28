class main:
    import sys
    
    def power(a, e, modP):
        ret = 1
        for _ in range(e):
            ret = (ret * a) % modP
            a = (a * a) % modP
        return ret
    
    def main():
        input = sys.stdin.readline
        MOD = 1000000007
        m, n = map(int, input().split())
        print(power(m, n, MOD))
    
    if __name__ == '__main__':
        main()