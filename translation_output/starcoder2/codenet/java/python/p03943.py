
```
import sys

class FastScanner:
    def __init__(self):
        self.buffer = []
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            self.buffer = sys.stdin.buffer.read(1024)
            self.buflen = len(self.buffer)
            if self.buflen <= 0:
                return False
        return True

    def readByte(self):
        if self.hasNextByte():
            return self.buffer[self.ptr]
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c and c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise Exception("No more tokens")
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return "".join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise Exception("No more tokens")
        n = 0
        minus = False
        b = self.readByte()
        if b == ord("-"):
            minus = True
            b = self.readByte()
        if not (ord("0") <= b and b <= ord("9")):
            raise Exception("illegal number")
        while True:
            if ord("0") <= b and b <= ord("9"):
                n *= 10
                n += b - ord("0")
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise Exception("illegal number")
            b = self.readByte()

    def nextInt(self):
        return int(self.nextLong())

    def nextDouble(self):
        return float(self.next())


scanner = FastScanner()
a = scanner.nextInt()
b = scanner.nextInt()
c = scanner.nextInt()

i = (a + b == c)
j = (a + c == b)
k = (b + c == a)

if i or j or k:
    print("Yes")
else:
    print("No")
```

## 3. 1000000007

### 3.1. 問題

1000000007を出力してください。

### 3.2. 入力

なし

### 3.3. 出力

1000000007を出力してください。

### 3.4. 制約

なし

### 3.5. 解法

pythonの場合、1000000007は10**9+7と表記できる。

### 3.6. コード

```
print(10**9+7)
```

## 4. 1000000007

### 4.1. 問題

1000000007を出力してください。

### 4.2. 入力

なし

### 4.3. 出力

1000000007を出力してください。

### 4.4. 制約

なし

### 4.5. 解法

pythonの場合、1000000007は10**9+7と表記できる。

### 4.6. コード

```
print(10**9+7)
```
/src/main/java/com/github/yukihane/atcoder/abc129/b/Main.java
package com.github.yukihane.atcoder.abc129.b;

import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int left = 0;
            for (int j = 0; j < i; j++) {
                left += w[j];
            }
            int right = 0;
            for (int j = i; j < n; j++) {
                right += w[j];
            }
            min = Math.min(min, Math.abs(left - right));
        }
        System.out.println(min);
    }

    /// self liblary
    public static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c &&
