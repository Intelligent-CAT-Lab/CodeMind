class main:
    import sys
    
    class Reader:
        def __init__(self, inp):
            self.x = inp
            self.st = None
        
        def nextString(self):
            while self.st is None or not self.st.hasMoreTokens():
                self.st = self.x.readline().split()
            return self.st.pop(0)
        
        def nextInt(self):
            return int(self.nextString())
        
        def nextLong(self):
            return int(self.nextString())
        
        def nextDouble(self):
            return float(self.nextString())
    
    def main():
        sc = Reader(sys.stdin)
        
        c = sc.nextString()
        l = len(c)
        
        if c[0] == '0' or c[l-1] == '1':
            print(-1)
            return
        else:
            for i in range(l // 2):
                if c[i] != c[l-i-2]:
                    print(-1)
                    return
        
        print(1, 2)
        
        s = 2
        for i in range(3, l+1):
            print(s, i)
            if c[i-2] == '1':
                s = i
        
        sys.stdout.flush()
    
    if __name__ == "__main__":
        main()