<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buf = inp.readline().split()

    def next(self):
        if len(self.buf) == 0:
            self.buf = self.inp.readline().split()
        return self.buf.pop(0)

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_long(self):
        return long(self.next())


def main():
    sc = FastScanner()
    N = sc.next_int()
    table = [0] * (N + 1)
    M = 0
    for i in range(1, N + 1):
        table[i] = table[i - 1] + i
        if table[i] >= N:
            M = i
            break
    s = set(range(1, M + 1))
    s.remove(table[M] - N)
    for a in s:
        print(a)


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the sum of the first `N` natural numbers, and then removes the number that makes the sum equal to `N` from a set of numbers from 1 to `M` (where `M` is the largest number such that the sum of the first `M` natural numbers is less than or equal to `N`). Finally, it prints the remaining numbers in the set.<｜end▁of▁sentence｜>
