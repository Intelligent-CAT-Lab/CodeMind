
```
import sys

class FasterScanner:
    def __init__(self, file):
        self.file = file
        self.buf = []
        self.curChar = 0
        self.numChars = 0

    def read(self):
        if self.numChars == 0:
            self.buf = self.file.read(1024)
            self.numChars = len(self.buf)
            self.curChar = 0
        if self.numChars == 0:
            return -1
        else:
            self.numChars -= 1
            return self.buf[self.curChar]

    def isSpaceChar(self, c):
        return c == ' ' or c == '\n' or c == '\r' or c == '\t' or c == -1

    def isEndOfLine(self, c):
        return c == '\n' or c == '\r' or c == -1

    def nextLine(self):
        res = ''
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        while not self.isEndOfLine(c):
            res += chr(c)
            c = self.read()
        return res

    def nextString(self):
        res = ''
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        while not self.isSpaceChar(c):
            res += chr(c)
            c = self.read()
        return res

    def nextLong(self):
        res = 0
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        while not self.isSpaceChar(c):
            res *= 10
            res += int(c)
            c = self.read()
        return res * sgn

    def nextInt(self):
        res = 0
        c = self.read()
        while self.isSpaceChar(c):
            c = self.read()
        sgn = 1
        if c == '-':
            sgn = -1
            c = self.read()
        while not self.isSpaceChar(c):
            res *= 10
            res += int(c)
            c = self.read()
        return res * sgn

    def close(self):
        self.file.close()

def main():
    sc = FasterScanner(sys.stdin)

    k = sc.nextInt()
    list = []
    for i in range(1, 10):
        list.append(i)
    val = -1
    while k > 0:
        val = list[0]
        list.pop(0)
        if val % 10 != 0:
            list.append(10*val + val%10 - 1)
        list.append(10*val + val%10)
        if val % 10 != 9:
            list.append(10*val + val%10 + 1)
        k -= 1
    print(val)

    sc.close()

if __name__ == '__main__':
    main()
```

## 2721. 1, 2, 3 더하기 3

### 문제

정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.

- 1+1+1+1
- 1+1+2
- 1+2+1
- 2+1+1
- 2+2
- 1+3
- 3+1

정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.

### 입력

첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은
