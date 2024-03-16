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
        return Integer.parseInt(self.next())

    def readArray(self, n):
        a = [0] * n
        for i in range(n):
            a[i] = self.nextInt()
        return a

    def nextLong(self):
        return Long.parseLong(self.next())

fs = FastScanner()
x = fs.nextInt()
if x >= 30:
    print("Yes")
else:
    print("No")