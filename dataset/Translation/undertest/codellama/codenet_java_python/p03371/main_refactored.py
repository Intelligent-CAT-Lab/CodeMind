class main:
    import sys
    
    class Scanner:
        def __init__(self, input_stream):
            self.input_stream = input_stream
            self.st = None
            self.br = None
    
        def next(self):
            while self.st is None or not self.st.hasMoreTokens():
                try:
                    self.st = StringTokenizer(self.br.readLine())
                except IOException as e:
                    e.printStackTrace()
            return self.st.nextToken()
    
        def nextInt(self):
            return int(self.next())
    
        def nextLine(self):
            str = ""
            try:
                str = self.br.readLine()
            except IOException as e:
                e.printStackTrace()
            return str
    
        def nextLong(self):
            return long(self.next())
    
        def nextDouble(self):
            return float(self.next())
    
        def nextIntArray(self, n):
            arr = [0] * n
            for i in range(n):
                arr[i] = self.nextInt()
            return arr
    
        def nextDoubleArray(self, n):
            arr = [0.0] * n
            for i in range(n):
                arr[i] = self.nextDouble()
            return arr
    
        def nextLongArray(self, n):
            arr = [0] * n
            for i in range(n):
                arr[i] = self.nextLong()
            return arr
    
        def nextCharArray(self, n):
            arr = self.nextLine().strip().replace(" ", "").toCharArray()
            return arr
    
        def nextStringArray(self, n):
            arr = [0] * n
            for i in range(n):
                arr[i] = self.next()
            return arr
    
    
    class p03371:
        def __init__(self):
            self.scanner = Scanner(sys.stdin)
            self.out = PrintWriter(OutputStreamWriter(sys.stdout))
    
        def main(self):
            a = self.scanner.nextInt()
            b = self.scanner.nextInt()
            c = self.scanner.nextInt()
            x = self.scanner.nextInt()
            y = self.scanner.nextInt()
    
            if a + b < 2 * c:
                self.out.println(x * a + y * b)
            else:
                min = min(x, y)
                max = max(x, y)
                res = 0
                res += 2 * c * min
                if max == x:
                    res += min(a, 2 * c) * (max - min)
                else:
                    res += min(b, 2 * c) * (max - min)
                self.out.println(res)
    
            self.out.close()
    
    
    if __name__ == "__main__":
        p03371().main()