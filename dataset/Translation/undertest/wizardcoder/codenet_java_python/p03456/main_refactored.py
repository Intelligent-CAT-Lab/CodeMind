class main:
    import math
    
    class FastScanner:
        def __init__(self):
            self.br = BufferedReader(InputStreamReader(System.in))
            self.st = StringTokenizer("")
    
        def next(self):
            while not self.st.hasMoreTokens():
                try:
                    self.st = StringTokenizer(self.br.readLine())
                except IOException as e:
                    e.printStackTrace()
            return self.st.nextToken()
    
        def nextInt(self):
            return int(self.next())
    
        def readArray(self, n):
            a = [0] * n
            for i in range(n):
                a[i] = self.nextInt()
            return a
    
        def nextLong(self):
            return long(self.next())
    
        def nextline(self):
            return None
    
    def main():
        sc = FastScanner()
        s = sc.next()
        t = sc.next()
        mah = s + t
        a = int(mah)
        b = int(math.sqrt(a))
        if b*b == a:
            print("Yes")
        else:
            print("No")
    
    if __name__ == '__main__':
        main()