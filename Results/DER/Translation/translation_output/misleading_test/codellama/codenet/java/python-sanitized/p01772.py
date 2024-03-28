import sys

class MyScanner:
    def __init__(self):
        self.input = sys.stdin.readline()
        self.index = 0

    def read(self):
        if self.index < len(self.input):
            c = self.input[self.index]
            self.index += 1
            return c
        else:
            return -1

    def is_space_char(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

    def is_endline(self, c):
        return c == '\n' or c == '\r' or c == -1

    def next_int(self):
        return int(self.next())

    def next_int_array(self, n):
        array = []
        for i in range(n):
            array.append(self.next_int())
        return array

    def next_long(self):
        return long(self.next())

    def next_long_array(self, n):
        array = []
        for i in range(n):
            array.append(self.next_long())
        return array

    def next_double(self):
        return float(self.next())

    def next_double_array(self, n):
        array = []
        for i in range(n):
            array.append(self.next_double())
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
        array = []
        for i in range(n):
            array.append(self.next())
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

def run():
    sc = MyScanner()

    c = sc.next().to_char_array()
    n = len(c)
    s = ''
    for i in range(n):
        if c[i] == 'A' or c[i] == 'Z':
            s += c[i]
    c = s.to_char_array()
    n = len(c)
    s = ''
    for i in range(n):
        if s.length() ==