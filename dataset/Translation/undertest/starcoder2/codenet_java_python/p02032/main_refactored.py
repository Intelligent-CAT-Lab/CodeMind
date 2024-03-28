class main:
    import re
    
    def debug(s):
        if re.match(r"^.+\.debug\((.+)\\);.*$", s):
            print(s)
    
    def main():
        n = int(input())
        pf = {}
        for i in range(2, int(n ** 0.5) + 1):
            c = 0
            while n % i == 0:
                n //= i
                c += 1
            if c > 0:
                pf[i] = c
        if n > 1:
            pf[n] = 1
        ans = 1
        for k, v in pf.items():
            ans *= (v + 1)
        print(len(pf), ans - 1)
    
    if __name__ == '__main__':
        main()