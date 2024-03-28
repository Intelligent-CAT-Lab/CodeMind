class main:
    class FastScanner:
        def __init__(self):
            self.inp = input()
    
        def next(self):
            return self.inp
    
    def main():
        sc = FastScanner()
        s = sc.next()
        t = ""
        for i in range(len(s)):
            if s[i] != 'B':
                t += s[i]
            elif t != "":
                t = t[:-1]
        print(t)
    
    if __name__ == "__main__":
        main()