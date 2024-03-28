class MyScanner:
    def read(self):
        return ord(input().strip())

    def is_space_char(self, c):
        return c == ord(' ') or c == ord('\n') or c == ord('\r') or c == ord('\t') or c == -1

    def is_endline(self, c):
        return c == ord('\n') or c == ord('\r') or c == -1

    def next_int(self):
        return int(self.next())

    def next_array(self, n):
        array = [int(x) for x in input().split()][:n]
        return array

    def next_long(self):
        return int(self.next())

    def next_long_array(self, n):
        array = [int(x) for x in input().split()][:n]
        return array

    def next_double(self):
        return float(self.next())

    def next_double_array(self, n):
        array = [float(x) for x in input().split()][:n]
        return array

    def next(self):
        c = self.read()
        while self.is_space_char(c):
            c = self.read()
        res = ''
        while not self.is_space_char(c):
            res += chr(c)
            c = self.read()
        return res

    def next_string_array(self, n):
        array = [self.next() for _ in range(n)]
        return array

    def next_line(self):
        c = self.read()
        while self.is_endline(c):
            c = self.read()
        res = ''
        while not self.is_endline(c):
            res += chr(c)
            c = self.read()
        return res

if __name__ == "__main__":
    sc = MyScanner()

    c = list(input())
    n = len(c)
    s = ''
    for i in range(n):
        if c[i] == 'A' or c[i] == 'Z':
            s += c[i]
    c = list(s)
    n = len(c)
    s = ''
    for i in range(n):
        if len(s) == 0 or s[-1] != c[i]:
            s += c[i]
    if len(s) > 0 and s[0] == 'Z':
        s = s[1:]
    if len(s) > 0 and s[-1] == 'A':
        s = s[:-1]
    if len(s) > 0:
        print(s)
    else:
        print(-1)