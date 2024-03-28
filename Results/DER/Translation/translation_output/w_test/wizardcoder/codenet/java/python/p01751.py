Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10 5

Expected output:
5


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

### Response:

```python
import sys

class Reader:
    def __init__(self):
        self.buf = sys.stdin.buffer
        self.tokenizer = None

    def close(self):
        pass

    def readline(self):
        return self.buf.readline().decode()

    def read(self):
        return self.readline().strip()

    def readint(self):
        return int(self.read())

    def readints(self):
        return list(map(int, self.read().split()))

    def readlong(self):
        return int(self.read())

    def readlongs(self):
        return list(map(int, self.read().split()))

    def readfloat(self):
        return float(self.read())

    def readfloats(self):
        return list(map(float, self.read().split()))

    def readchar(self):
        return self.read()

    def readchars(self):
        return list(self.read())

    def readtokens(self):
        if self.tokenizer is None:
            self.tokenizer = self.read().split()
        if not self.tokenizer:
            return None
        return self.tokenizer.pop(0)

    def hasnext(self):
        return bool(self.read())

    def hasnexttoken(self):
        return bool(self.readtokens())

def main():
    reader = Reader()
    a, b, c = reader.readints()
    d = a + b
    e = -1
    for i in range(1000):
        if 0 <= (60 * i + c) % d <= a:
            e = i
            break
    if e == -1:
        print(-1)
    else:
        print(60 * e + c)
    reader.close()

if __name__ == '__main__':
    main()
```<|endoftext|>
