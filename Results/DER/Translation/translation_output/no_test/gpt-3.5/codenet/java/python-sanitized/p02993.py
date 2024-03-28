import sys

class Scanner:
    def __init__(self, s):
        self.st = None
        self.br = BufferedReader(InputStreamReader(s))

    def next(self):
        while not self.st or not self.st.hasMoreTokens():
            self.st = StringTokenizer(self.br.readLine())
        return self.st.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextLine(self):
        return self.br.readLine()

    def nextDouble(self):
        x = self.next()
        sb = "0"
        res = 0
        f = 1
        dec = False
        neg = False
        start = 0
        if x[0] == '-':
            neg = True
            start += 1
        for i in range(start, len(x)):
            if x[i] == '.':
                res = int(sb)
                sb = "0"
                dec = True
            else:
                sb += x[i]
                if dec:
                    f *= 10
        res += int(sb) / f
        return res * (-1 if neg else 1)

    def ready(self):
        return self.br.ready()

class BufferedReader:
    def __init__(self, s):
        self.reader = s

    def readLine(self):
        return self.reader.readline()

class StringTokenizer:
    def __init__(self, s):
        self.tokens = s.split()
        self.index = 0

    def nextToken(self):
        token = self.tokens[self.index]
        self.index += 1
        return token

stdin = sys.stdin
sys.setrecursionlimit(10 ** 6)

word = input()
flag = False
for i in range(len(word) - 1):
    if word[i] == word[i + 1]:
        flag = True
        break

if flag:
    print("Bad")
else:
    print("Good")