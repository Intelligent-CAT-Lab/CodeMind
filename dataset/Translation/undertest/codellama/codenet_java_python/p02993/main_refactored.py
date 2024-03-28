class main:
    import sys
    
    class Scanner:
        def __init__(self, input_stream):
            self.br = BufferedReader(InputStreamReader(input_stream))
            self.st = None
    
        def next(self):
            while self.st is None or not self.st.hasMoreTokens():
                self.st = StringTokenizer(self.br.readLine())
            return self.st.nextToken()
    
        def nextInt(self):
            return int(self.next())
    
        def nextLong(self):
            return long(self.next())
    
        def nextLine(self):
            return self.br.readLine()
    
        def nextDouble(self):
            x = self.next()
            sb = StringBuilder("0")
            res = 0
            f = 1
            dec = False
            neg = False
            start = 0
            if x.charAt(0) == '-':
                neg = True
                start += 1
            for i in range(start, len(x)):
                if x.charAt(i) == '.':
                    res = long(sb.toString())
                    sb = StringBuilder("0")
                    dec = True
                else:
                    sb.append(x.charAt(i))
                    if dec:
                        f *= 10
            res += long(sb.toString()) / f
            return res * (neg and -1 or 1)
    
        def ready(self):
            return self.br.ready()
    
    
    def main():
        s = Scanner(sys.stdin)
        word = s.next()
        flag = False
        for i in range(len(word) - 1):
            if word.charAt(i) == word.charAt(i + 1):
                flag = True
                break
        if flag:
            print("Bad")
        else:
            print("Good")
    
    
    if __name__ == "__main__":
        main()