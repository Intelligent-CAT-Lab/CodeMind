```python
from sys import stdin, stdout
import array
import operator
import math
import io

class INumberOfSubstrings:
    def solve(self, s):
        n = len(s)
        lcp = StringUtil.lcpArray(array.array('i', s))
        answer = n * (n + 1) // 2 - IntMath.sum(lcp)
        return answer

class StringUtil:
    SA_THRESHOLD_NAIVE = 10
    SA_THRESHOLD_DOUBLING = 40

    @staticmethod
    def saNaive(s):
        n = len(s)
        sa = [i for i in range(n)]
        sa.sort(key=lambda x: s[x:])
        return sa

    @staticmethod
    def saDoubling(s):
        n = len(s)
        sa = [i for i in range(n)]
        rnk = s.copy()
        tmp = [0] * n

        k = 1
        while k < n:
            _k = k
            _rnk = rnk
            cmp_func = lambda x, y: _rnk[x] - _rnk[y] if _rnk[x] != _rnk[y] else (_rnk[x + _k] - _rnk[y + _k] if y + _k < n and x + _k < n else -1)
            sa.sort(key=cmp_func)
            for i in range(1, n):
                tmp[sa[i]] = tmp[sa[i - 1]] + (1 if cmp_func(sa[i - 1], sa[i]) < 0 else 0)
            tmp, rnk = rnk, tmp
            k *= 2

        return sa

    @staticmethod
    def sais(s, upper):
        n = len(s)
        if n == 0:
            return array.array('i')
        if n == 1:
            return array.array('i', [0])
        if n == 2:
            return array.array('i', [0, 1]) if s[0] < s[1] else array.array('i', [1, 0])
        if n < StringUtil.SA_THRESHOLD_NAIVE:
            return StringUtil.saNaive(s)
        if n < StringUtil.SA_THRESHOLD_DOUBLING:
            return StringUtil.saDoubling(s)

        sa = [0] * n
        ls = [s[i] < s[i + 1] or (s[i] == s[i + 1] and ls[i + 1]) for i in range(n - 2, -1, -1)]

        sumL = [0] * (upper + 1)
        sumS = [0] * (upper + 1)

        for i in range(n):
            if ls[i]:
                sumL[s[i] + 1] += 1
            else:
                sumS[s[i]] += 1

        for i in range(upper):
            sumS[i] += sumL[i]
            if i < upper:
                sumL[i + 1] += sumS[i]

        buf = [0] * (upper + 1)
        lms = [i for i in range(n) if not ls[i - 1] and ls[i]]
        
        def induce(lms):
            nonlocal sa
            nonlocal buf
            sa = [-1] * n
            buf = sumS.copy()
            for d in lms:
                if d == n:
                    continue
                sa[buf[s[d]]] = d
                buf[s[d]] += 1
            buf = sumL.copy()
            sa[buf[s[n - 1]]] = n - 1
            buf[s[n - 1]] += 1
            for i in range(n):
                v = sa[i]
                if v >= 1 and not ls[v - 1]:
                    sa[buf[s[v - 1]]] = v - 1
                    buf[s[v - 1]] += 1
            buf = sumL.copy()
            for i in range(n - 1, -1, -1):
                v = sa[i]
                if v >= 1 and ls[v - 1]:
                    buf[s[v - 1] + 1] -= 1
                    sa[buf[s[v - 1] + 1]] = v - 1

        lmsMap = [-1] * (n + 1)
        m = 0
        for i in range(1, n):
            if not ls[i - 1] and ls[i]:
                lmsMap[i] = m
                m += 1

        lms = [i for i in range(1, n) if not ls[i - 1] and ls[i]]
        induce(lms)

        if m == 0:
            return sa
        
        sortedLms = [v for v in sa if lmsMap[v] != -1]
        recS = [0] * m
        recUpper = 0
        recS[lmsMap[sortedLms[0]]] = 0
        for i in range(1, m):
            l = sortedLms[i - 1]
            r = sortedLms[i]
            endL = lms[lmsMap[l] + 1] if lmsMap[l] + 1 < m else n
            endR = lms[lmsMap[r] + 1] if lmsMap[r] + 1 < m else n
            same = True
            if endL - l != endR - r:
                same = False
            else:
                while l < endL and s[l] == s[r]:
                    l += 1
                    r += 1
                if l == n or s[l] != s[r]:
                    same = False
            if not same:
                recUpper += 1
            recS[lmsMap[sortedLms[i]]] = recUpper

        recSA = StringUtil.sais(recS, recUpper)
        sortedLms = [lms[recSA[i]] for i in range(m)]
        induce(sortedLms)
        return sa

    @staticmethod
    def suffixArray(s, upper):
        return StringUtil.sais(s, upper)

    @staticmethod
    def lcpArray(s, sa):
        n = len(s)
        rnk = [0] * n
        lcp = [0] * (n - 1)
        h = 0
        for i in range(n):
            if h > 0:
                h -= 1
            if rnk[i] == 0:
                continue
            j = sa[rnk[i] - 1]
            while j + h < n and i + h < n and s[j + h] == s[i + h]:
                h += 1
            lcp[rnk[i] - 1] = h
        return lcp

    @staticmethod
    def lcpArrayChar(s):
        n = len(s)
        return StringUtil.lcpArray(array.array('i', [ord(c) for c in s]), StringUtil.suffixArray(array.array('i', [ord(c) for c in s]), 255))

class LightWriter2:
    def __init__(self, out):
        self.out = out
        self.buf = bytearray()
        self.ptr = 0

    def printChar(self, c):
        self.buf.append(c)

    def printString(self, s):
        self.buf += s.encode()

    def ans(self, l):
        if len(self.buf) > 0 and self.buf[-1] != ord(' '):
            self.printChar(ord(' '))
        if l == 0:
            self.printChar(ord('0'))
            return
        if l < 0:
            self.printChar(ord('-'))
            l = -l
        n = len(str(l))
        self.buf.extend(map(lambda x: ord(x), str(l)))

    def ln(self):
        self.printString('\n')
        self.flush()

    def flush(self):
        self.out.write(self.buf.decode())
        self.buf = bytearray()

class LightScanner2:
    BUF_SIZE = 1024 * 1024

    def __init__(self, stream):
        self.stream = stream
        self.builder = []
        self.buf = bytearray()
        self.ptr = 0
        self.len = 0

    def read(self):
        if self.ptr < self.len:
            return self.buf[self.ptr]
        self.ptr = 0
        self.buf = self.stream.read(self.BUF_SIZE)
        if self.buf == b"":
            return -1
        self.len = len(self.buf)
        return self.buf[self.ptr]

    def skip(self):
        b = self.read()
        while self.isTokenSeparator(b) and b != -1:
            b = self.read()
        if b == -1:
            raise Exception("EOF")
        self.ptr -= 1

    def loadToken(self):
        self.builder = []
        self.skip()
        b = self.read()
        while not self.isTokenSeparator(b):
            self.builder.append(b)
            b = self.read()

    def chars(self):
        self.loadToken()
        return array.array('b', self.builder)

    def isTokenSeparator(self, b):
        return b < 33 or b > 126

class IntMath:
    @staticmethod
    def sum(*v):
        return sum(v)

# Main function
def main():
    s = LightScanner2(stdin.buffer).chars()
    solver = INumberOfSubstrings()
    result = solver.solve(s)
    out = LightWriter2(stdout.buffer)
    out.ans(result).ln()

if __name__ == "__main__":
    main()
```  
