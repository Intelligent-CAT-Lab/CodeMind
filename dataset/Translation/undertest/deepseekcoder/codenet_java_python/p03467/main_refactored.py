class main:
    import sys
    
    P = 998244353
    
    map = {}
    
    def go(s):
        if not s:
            return 1
        if s in map:
            return map[s]
    
        ret = (1 + int(s[0])) * go(s[1:]) % P
        x = 1
        while 2 * x <= len(s):
            buf = list(s[:x])
            for k in range(2, len(s) // x + 1):
                for i in range(x):
                    if s[k * x + i] == '0':
                        buf[i] = '0'
                ret += go("".join(buf)) * go(s[k * x:]) % P
            x += 1
    
        iret = int(ret % P)
        map[s] = iret
        return iret
    
    def submit():
        s = sys.stdin.readline().strip()
        print(go(s))
    
    def preCalc():
        pass
    
    def stress():
        pass
    
    def test():
        pass
    
    def main():
        preCalc()
        submit()
        # stress()
        # test()
    
    if __name__ == "__main__":
        main()