import sys

class Reader:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.st = None

    def next_string(self):
        while self.st is None or not self.st.hasMoreTokens():
            self.st = StringTokenizer(self.inp.readLine())
        return self.st.nextToken()

    def next_int(self):
        return int(self.next_string())

    def next_long(self):
        return long(self.next_string())

    def next_double(self):
        return float(self.next_string())


class Main:
    mod = 1000000007

    @staticmethod
    def main():
        reader = Reader()
        c = list(reader.next_string())
        l = len(c)

        if c[0] == '0' or c[-1] == '1':
            print(-1)
            return
        else:
            for i in range(l // 2):
                if c[i] != c[l - i - 2]:
                    print(-1)
                    return

        print(1 + 1)

        for i in range(3, l + 1):
            print(2, i)
            if c[i - 2] == '1':
                print(1, i)


if __name__ == '__main__':
    Main.main()