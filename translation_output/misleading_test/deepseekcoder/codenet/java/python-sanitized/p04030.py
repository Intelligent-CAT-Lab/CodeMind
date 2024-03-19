class FastScanner:
    def __init__(self):
        self.inp = input()

    def next(self):
        return self.inp

    def nextInt(self):
        return int(self.inp)

    def nextLong(self):
        return long(self.inp)

    def nextDouble(self):
        return float(self.inp)


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


if __