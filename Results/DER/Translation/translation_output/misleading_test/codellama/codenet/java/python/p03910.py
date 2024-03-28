<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
1
3
86

```
import java.util.*;
import java.io.*;


public class p03910{
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int N = sc.nextInt();
        int[] table = new int[N+1];
        table[0] = 0;
        int M = 0;
        for(int i=1;i<=N;i++){
            table[i] = table[i-1] + i;
            if(table[i]>=N){
                M = i;
                break;
            }
        }
        HashSet<Integer> s = new HashSet<>();
        for(int i=1;i<=M;i++){
            s.add(i);
        }
        s.remove(table[M]-N);
        for(int a : s){
            out.println(a);
        }

        // out.println(result);

        out.flush();
    }
        
}



class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
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
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}

```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class FastScanner:
    def __init__(self):
        self.in = sys.stdin
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.in.readinto(self.buffer)
            except IOError:
                pass
            if self.buflen <= 0:
                return False

    def readByte(self):
        if self.hasNextByte():
            return self.buffer[self.ptr]
        else:
            return -1

    def isPrintableChar(self, c):
        return 33 <= c <= 126

    def hasNext(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.ptr]):
            self.ptr += 1
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise NoSuchElementException()
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return "".join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.readByte()
        if b == "-":
            minus = True
            b = self.readByte()
        if b < "0" or "9" < b:
            raise NumberFormatException()
        while True:
            if "0" <= b <= "9":
                n *= 10
                n += ord(b) - ord("0")
            elif b == -1 or not self.isPrintableChar(b):
                return -n if minus else n
            else:
                raise NumberFormatException()
            b = self.readByte()

    def nextInt(self):
        nl = self.nextLong()
        if nl < sys.maxint or nl > sys.maxint:
            raise NumberFormatException()
        return int(nl)

    def nextDouble(self):
        return float(self.next())


class p03910:
    def __init__(self):
        self.sc = FastScanner()
        self.out = sys.stdout

    def main(self):
        N = self.sc.nextInt()
        table = [0] * (N + 1)
        table[0] = 0
        M = 0
        for i in range(1, N + 1):
            table[i] = table[i - 1] + i
            if table[i] >= N:
                M = i
                break
        s = set()
        for i in range(1, M + 1):
            s.add(i)
        s.remove(table[M] - N)
        for a in s:
            self.out.write(str(a) + "\n")

        self.out.flush()


if __name__ == "__main__":
    p03910().main()
```
Note that the `FastScanner` class is not included in the Python standard library, so you will need to define it yourself. Also, the `NoSuchElementException` and `NumberFormatException` classes are not included in the Python standard library, so you will need to define them yourself.</s>
