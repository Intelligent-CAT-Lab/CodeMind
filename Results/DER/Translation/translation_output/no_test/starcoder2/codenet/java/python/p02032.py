
```
import sys
import re

def debug(*args):
    if Debug.enabled:
        print(*args, file=sys.stderr)

class Debug:
    enabled = False
    @staticmethod
    def enable(s):
        Debug.enabled = True
        Debug.src = s
        Debug.regex = re.compile(r'^.+\.debug\((.+)\);.*$')

class LightWriter:
    def __init__(self, out):
        self.out = out
        self.autoflush = False
        self.breaked = True

    def print(self, c):
        try:
            self.out.write(c)
            self.breaked = False
        except IOError as e:
            raise UncheckedIOException(e)
        return self

    def print(self, s):
        try:
            self.out.write(s, 0, len(s))
            self.breaked = False
        except IOError as e:
            raise UncheckedIOException(e)
        return self

    def ans(self, s):
        if not self.breaked:
            self.print(' ')
        return self.print(s)

    def ans(self, l):
        return self.ans(str(l))

    def ans(self, i):
        return self.ans(str(i))

    def ln(self):
        self.print(sys.linesep)
        self.breaked = True
        if self.autoflush:
            try:
                self.out.flush()
            except IOError as e:
                raise UncheckedIOException(e)
        return self

    def close(self):
        try:
            self.out.close()
        except IOError as e:
            raise UncheckedIOException(e)

class LightScanner:
    def __init__(self, in_):
        self.reader = BufferedReader(InputStreamReader(in_))
        self.tokenizer = None

    def string(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.reader.readLine())
            except IOException as e:
                raise UncheckedIOException(e)
        return self.tokenizer.nextToken()

    def longs(self):
        return int(self.string())

class CDivisorGame:
    def solve(self, testNumber, in_, out):
        Debug.enable("src")
        n = in_.longs()
        pf = {}
        for i in range(2, int(math.sqrt(n)) + 1):
            c = 0
            while n % i == 0:
                n //= i
                c += 1
            if c > 0:
                pf[i] = c
        if n > 1:
            pf[n] = 1
        ans = 1
        for i in pf:
            ans *= (pf[i] + 1)
        out.ans(len(pf)).ans(ans - 1).ln()

if __name__ == '__main__':
    in_ = LightScanner(sys.stdin)
    out = LightWriter(sys.stdout)
    CDivisorGame().solve(1, in_, out)
    out.close()
```
/src/main/java/com/demonwav/cfgen/generators/kotlin/KotlinGenerator.kt
/*
 * cf-gen
 * Copyright (c) 2018-2019 
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
