<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

class p03778{
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        int w=fsc.nextInt();
        int a=fsc.nextInt(), b=fsc.nextInt();
        fsc.close();
        if(a<=b && b<=a+w) System.out.println(0);
        else if(a<=b+w && b+w<=a+w) System.out.println(0);
        else if(a+w<=b) System.out.println((b-a-w));
        else System.out.println((a-b-w));
    }
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte(){
            if(ptr<buflen) return true;
            else{
                ptr = 0;
                try{
                    buflen = in.read(buffer);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                if(buflen<=0) return false;
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
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }
                else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
        public void close(){
            try{in.close();}
            catch(IOException e){e.printStackTrace();}
        }
    }
}

```

@@ Response
```python
import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.inp = inp
        self.buf = inp.read(1024)
        self.cur = 0
        self.has_next = True

    def next(self):
        while self.cur < len(self.buf) and not self.buf[self.cur].isprintable():
            self.cur += 1
        if self.cur == len(self.buf):
            self.cur = 0
            self.buf = self.inp.read(1024)
            if len(self.buf) == 0:
                self.has_next = False
                return ""
        res = ""
        while self.cur < len(self.buf) and self.buf[self.cur].isprintable():
            res += self.buf[self.cur]
            self.cur += 1
        return res

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_long(self):
        return long(self.next())

    def close(self):
        self.inp.close()


def main():
    fsc = FastScanner()
    w = fsc.next_int()
    a = fsc.next_int()
    b = fsc.next_int()
    fsc.close()
    if a <= b and b <= a + w:
        print(0)
    elif a <= b + w and b + w <= a + w:
        print(0)
    elif a + w <= b:
        print(b - a - w)
    else:
        print(a - b - w)


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code you provided. It reads integers from the standard input and prints the result of the comparison.<｜end▁of▁sentence｜>
