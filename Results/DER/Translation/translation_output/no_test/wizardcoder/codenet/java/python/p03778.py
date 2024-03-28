Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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
        public boolean hasNext() { while(hasNextByte() &&!isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
                else if(b == -1 ||!isPrintableChar(b)) return minus? -n : n;
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

### Response:
```python
import java.util.*;
import java.io.*;

class p03778:
    def main(self):
        fsc=FastScanner()
        w=fsc.nextInt()
        a=fsc.nextInt()
        b=fsc.nextInt()
        fsc.close()
        if a<=b and b<=a+w:
            print(0)
        elif a<=b+w and b+w<=a+w:
            print(0)
        elif a+w<=b:
            print(b-a-w)
        else:
            print(a-b-w)
    class FastScanner:
        def __init__(self):
            self.instream = System.in
            self.buffer = bytearray(1024)
            self.bufferlen = 0
            self.bufferptr = 0
        def hasNextByte(self):
            if self.bufferptr<self.bufferlen:
                return True
            else:
                self.bufferptr = 0
                try:
                    self.bufferlen = self.instream.read(self.buffer)
                except:
                    pass
                if self.bufferlen<=0:
                    return False
                else:
                    return True
        def readByte(self):
            if self.hasNextByte():
                return self.buffer[self.bufferptr]
            else:
                return -1
        def isPrintableChar(self, c):
            return 33 <= c and c <= 126
        def hasNext(self):
            while self.hasNextByte() and not self.isPrintableChar(self.buffer[self.bufferptr]):
                self.bufferptr += 1
            return self.hasNextByte()
        def next(self):
            if not self.hasNext():
                raise NoSuchElementException()
            sb = StringBuilder()
            b = self.readByte()
            while self.isPrintableChar(b):
                sb.appendCodePoint(b)
                b = self.readByte()
            return sb.toString()
        def nextLong(self):
            if not self.hasNext():
                raise NoSuchElementException()
            n = 0
            minus = False
            b = self.readByte()
            if b == '-':
                minus = True
                b = self.readByte()
            if b < '0' or '9' < b:
                raise NumberFormatException()
            while True:
                if '0' <= b and b <= '9':
                    n *= 10
                    n += b - '0'
                elif b == -1 or not self.isPrintableChar(b):
                    return minus and -n or n
                else:
                    raise NumberFormatException()
                b = self.readByte()
        def nextInt(self):
            nl = self.nextLong()
            if nl < Integer.MIN_VALUE or nl > Integer.MAX_VALUE:
                raise NumberFormatException()
            return int(nl)
        def nextDouble(self):
            return float(self.next())
        def close(self):
            try:
                self.instream.close()
            except:
                pass

p03778().main()
```<|endoftext|>
