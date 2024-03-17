import math

class FastScanner:
    def __init__(self):
        self.br = open("input.txt", "r")
        self.st = None

    def next(self):
        while not self.st.hasMoreTokens():
            try:
                self.st = self.br.readline()
            except:
                print("Error reading input")
                return None
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
    if b * b == a:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()