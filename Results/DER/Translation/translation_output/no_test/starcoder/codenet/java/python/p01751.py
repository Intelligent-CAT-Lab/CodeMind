<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.*;
import java.io.*;

public class p01751{
    static final Reader sc = new Reader();
    static final PrintWriter out = new PrintWriter(System.out,false);

    public static void main(String[] args) throws Exception {
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int d = a + b;
    	int e = -1;
    	for(int i=0;i<1000;i++){
    		if(0<=(60*i+c)%d && (60*i+c)%d<=a){
    			e = i;
    			break;
    		}
    	}
    	if(e==-1){
    		out.println(-1);
    	}
    	else{
    		out.println(60*e+c);
    	}
    	out.flush();
        sc.close();
        out.close();
    }

    static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}

class Reader {

    private final InputStream in;
    private final byte[] buf = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    public Reader() { this(System.in);}
    public Reader(InputStream source) { this.in = source;}

    private boolean hasNextByte() {
        if (ptr < buflen) return true;
        ptr = 0;
        try{
            buflen = in.read(buf);
        }catch (IOException e) {e.printStackTrace();}
        if (buflen <= 0) return false;
        return true;
    }

    private int readByte() { if (hasNextByte()) return buf[ptr++]; else return -1;}

    private boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}

    private void skip() { while(hasNextByte() &&!isPrintableChar(buf[ptr])) ptr++;}

    public boolean hasNext() {skip(); return hasNextByte();}

    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        boolean minus = false;
        long num = readByte();

        if(num == '-'){
            num = 0;
            minus = true;
        }else if (num < '0' || '9' < num){
            throw new NumberFormatException();
        }else{
            num -= '0';
        }

        while(true){
            int b = readByte();
            if('0' <= b && b <= '9')
                num = num * 10 + (b - '0');
            else if(b == -1 ||!isPrintableChar(b))
                return minus? -num : num;
            else
                throw new NoSuchElementException();
        }
    }

    public int nextInt() {
        long num = nextLong();
        if (num < Integer.MIN_VALUE || Integer.MAX_VALUE < num)
            throw new NumberFormatException();
        return (int)num;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }

    public char nextChar() {
        if (!hasNext()) throw new NoSuchElementException();
        return (char)readByte();
    }

    public String nextLine() {
        while (hasNextByte() && (buf[ptr] == '\n' || buf[ptr] == '\r')) ptr++;
        if (!hasNextByte()) throw new NoSuchElementException();

        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (b!= '\n' && b!= '\r') {
            sb.appendCodePoint(b);
            b = readByte();
        }

        return sb.toString();
    }

    public int[] nextIntArray(int n) {
        int[] res = new int[n];
        for (int i=0; i<n; i++) res[i] = nextInt();
        return res;
    }

    public char[] nextCharArray(int n) {
        char[] res = new char[n];
        for (int i=0; i<n; i++) res[i] = nextChar();
        return res;
    }

    public void close() {try{ in.close();}catch(IOException e){ e.printStackTrace();}};
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

class Reader:
    def __init__(self):
        self.buf = []
        self.ptr = 0
        self.buflen = 0
        self.in = sys.stdin

    def hasNextByte(self):
        if self.ptr < self.buflen:
            return True
        self.ptr = 0
        try:
            self.buf = self.in.read(1024)
            self.buflen = len(self.buf)
        except:
            return False
        if self.buflen <= 0:
            return False
        return True

    def readByte(self):
        if self.hasNextByte():
            return self.buf[self.ptr]
        return -1

    def isPrintableChar(self, c):
        return 33 <= c and c <= 126

    def skip(self):
        while self.hasNextByte() and not self.isPrintableChar(self.buf[self.ptr]):
            self.ptr += 1

    def hasNext(self):
        self.skip()
        return self.hasNextByte()

    def next(self):
        if not self.hasNext():
            raise Exception("no next")
        sb = []
        b = self.readByte()
        while self.isPrintableChar(b):
            sb.append(chr(b))
            b = self.readByte()
        return "".join(sb)

    def nextLong(self):
        if not self.hasNext():
            raise Exception("no next")
        minus = False
        num = self.readByte()
        if num == '-':
            num = 0
            minus = True
        elif num < '0' or '9' < num:
            raise Exception("not a number")
        else:
            num -= '0'
        while True:
            b = self.readByte()
            if '0' <= b and b <= '9':
                num = num * 10 + (b - '0')
            elif b == -1 or not self.isPrintableChar(b):
                return minus? -num : num
            else:
                raise Exception("not a number")

    def nextInt(self):
        num = self.nextLong()
        if num < -2147483648 or 2147483647 < num:
            raise Exception("out of range")
        return num

    def nextDouble(self):
        return float(self.next())

    def nextChar(self):
        if not self.hasNext():
            raise Exception("no next")
        return chr(self.readByte())

    def nextLine(self):
        while self.hasNextByte() and (self.buf[self.ptr] == '\n' or self.buf[self.ptr] == '\r'):
            self.ptr += 1
        if not self.hasNextByte():
            raise Exception("no next")
        sb = []
        b = self.readByte()
        while b!= '\n' and b!= '\r':
            sb.append(chr(b))
            b = self.readByte()
        return "".join(sb)

    def nextIntArray(self, n):
        res = []
        for i in range(n):
            res.append(self.nextInt())
        return res

    def nextCharArray(self, n):
        res = []
        for i in range(n):
            res.append(self.nextChar())
        return res

    def close(self):
        try:
            self.in.close()
        except:
            pass

def main():
    reader = Reader()
    a = reader.nextInt()
    b = reader.nextInt()
    c = reader.nextInt()
    d = a + b
    e = -1
    for i in range(1000):
        if 0 <= (60 * i + c) % d and (60 * i + c) % d <= a:
            e = i
            break
    if e == -1:
        print(-1)
    else:
        print(60 * e + c)
    reader.close()

if __name__ == '__main__':
    main()
```

'''
<|endoftext|>
