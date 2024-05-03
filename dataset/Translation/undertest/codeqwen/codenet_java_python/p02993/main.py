class Scanner:
    def __init__(self, s):
        self.st = None
        self.br = s

    def next(self):
        while self.st is None or not self.st.has_more_tokens():
            self.st = self.br.readline().split()
        return self.st.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_line(self):
        return self.br.readline().strip()

    def next_double(self):
        x = self.next()
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
                res = int(res)
                res = res * 10 + int(x[i+1])
                dec = True
            else:
                res = res * 10 + int(x[i])
                if dec:
                    f *= 10
        res += res / f
        return res * (neg*-1)

    def ready(self):
        return True


def main():
    s = Scanner(input())
    word = s.next()
    flag = False
    for i in range(len(word)-1):
        if word[i] == word[i+1]:
            flag = True
            break
    if flag:
        print("Bad")
    else:
        print("Good")


if __name__ == "__main__":
    main()