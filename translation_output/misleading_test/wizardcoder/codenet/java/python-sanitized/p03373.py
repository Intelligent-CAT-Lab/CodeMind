import java.io.*;
import java.util.*;

class p03373:
    def __init__(self):
        self.sc = Scanner(System.in)
        self.pr = Printer(System.out)

    def solve(self):
        a = self.sc.nextInt()
        b = self.sc.nextInt()
        c = self.sc.nextInt()
        x = self.sc.nextInt()
        y = self.sc.nextInt()

        min = float('inf')
        for i in range(max(x, y) + 1):
            tmp = a * max(0, x - i) + b * max(0, y - i) + c * i * 2
            min = min(min, tmp)

        self.pr.println(min)

    def __del__(self):
        self.sc.close()
        self.pr.close()

class Scanner:
    def __init__(self, in_stream):
        self.br = BufferedReader(InputStreamReader(in_stream))

    def is_printable(self, ch):
        return ch >= '!' and ch <= '~'

    def is_crlf(self, ch):
        return ch == '\n' or ch == '\r' or ch == -1

    def next_printable(self):
        try:
            ch = self.br.read()
            while not self.is_printable(ch):
                if ch == -1:
                    raise NoSuchElementException()
                ch = self.br.read()
            return ch
        except IOException as e:
            raise NoSuchElementException()

    def next(self):
        try:
            ch = self.next_printable()
            sb = StringBuilder()
            while self.is_printable(ch):
                sb.appendCodePoint(ch)
                ch = self.br.read()
            return sb.toString()
        except IOException as e:
            raise NoSuchElementException()

    def next_int(self):
        try:
            # parseInt from Integer.parseInt()
            negative = False
            res = 0
            limit = -Integer.MAX_VALUE
            radix = 10

            fc = self.next_printable()
            if fc < '0':
                if fc == '-':
                    negative = True
                    limit = Integer.MIN_VALUE
                elif fc!= '+':
                    raise NumberFormatException()
                fc = self.br.read()
            multmin = limit // radix

            ch = fc
            while self.is_printable(ch):
                digit = ch - '0'
                if digit < 0 or digit >= radix:
                    raise NumberFormatException()
                if res < multmin:
                    raise NumberFormatException()
                res *= radix
                if res < limit