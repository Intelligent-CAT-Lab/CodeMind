Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2 1

Expected output:
6


```
import java.io.*;
        import java.math.*;
        import java.util.*;
        import java.lang.*;

public class p02685 implements Runnable {
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        public int nextInt() {
            int c = read();

            while (isSpaceChar(c))
                c = read();

            int sgn = 1;

            if (c == '-') {
                sgn = -1;
                c = read();
            }

            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;

            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
            return res * sgn;
        }

        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c!= '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            }
            while (!isSpaceChar(c));

            return res.toString();
        }

        public boolean isSpaceChar(int c) {
            if (filter!= null)
                return filter.isSpaceChar(c);
            return c =='' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }

    public static void main(String args[]) throws Exception {
        new Thread(null, new p02685(), "p02685", 1 << 26).start();
    }

    long modPow(long a, long p, long m) {
        if (a == 1) return 1;
        long ans = 1;
        while (p > 0) {
            if (p % 2 == 1) ans = (ans * a) % m;
            a = (a * a) % m;
            p >>= 1;
        }
        return ans;
    }

    long modInv(long a, long m) {
        return modPow(a, m - 2, m);
    }



    PrintWriter out;
    InputReader sc;

    public void run() {
        sc = new InputReader(System.in);
        // Scanner sc=new Scanner(System.in);
        //  Random sc=new Random();
        out = new PrintWriter(System.out);

        // credit goes to Stefan Dascalescu
        // https://www.youtube.com/watch?v=iYS8l9_A-vY

        int n=sc.nextInt();
        long m=sc.nextLong();
        long k=sc.nextLong();
        long ans=0;
        fact=new long[n+1];
        ifact=new long[n+1];
        fact[0]=fact[1]=ifact[0]=ifact[1]=1;
        for (int i = 1; i <=n ; i++) {
            fact[i]=mul(fact[i-1],i);
            ifact[i]=modInv(fact[i],mod);
        }
        for (int i = 0; i <=k ; i++) {
            ans=add(ans,mul(m,mul(modPow(m-1,n-(i+1),mod),NcR(n-1,i))));
        }
        out.println(ans);


        out.close();
    }
    long NcR(int n,int r){
        return mul(fact[n],mul(ifact[r],ifact[n-r]));
    }
    long fact[],ifact[];
    long mod=998244353;

    long sub(long a,long b){
        a%=mod;
        b%=mod;
        return ((a-b)%mod+mod)%mod;
    }

    long mul(long a,long b){
        a%=mod;
        b%=mod;
        return (a*b)%mod;
    }

    long add(long a,long b){
        a%=mod;
        b%=mod;
        return (a+b)%mod;
    }

}
```

### Response:
```python
import sys
import math

class InputReader:
    def __init__(self):
        self.buffer = sys.stdin.readline().strip()
        self.pos = 0

    def read(self):
        if self.pos == len(self.buffer):
            self.buffer = sys.stdin.readline().strip()
            self.pos = 0
        c = self.buffer[self.pos]
        self.pos += 1
        return c

    def nextInt(self):
        num = 0
        sign = 1
        c = self.read()
        while c =='':
            c = self.read()
        if c == '-':
            sign = -1
            c = self.read()
        while c.isdigit():
            num = num * 10 + int(c)
            c = self.read()
        return sign * num

    def nextLong(self):
        num = 0
        sign = 1
        c = self.read()
        while c =='':
            c = self.read()
        if c == '-':
            sign = -1
            c = self.read()
        while c.isdigit():
            num = num * 10 + int(c)
            c = self.read()
        return sign * num

    def nextDouble(self):
        num = 0
        sign = 1
        decimal = False
        c = self.read()
        while c =='':
            c = self.read()
        if c == '-':
            sign = -1
            c = self.read()
        while c.isdigit():
            num = num * 10 + int(c)
            c = self.read()
        if c == '.':
            decimal = True
            c = self.read()
            while c.isdigit():
                num = num * 10 + int(c)
                c = self.read()
        if not decimal:
            return sign * num
        else:
            return sign * num / math.pow(10, len(str(num)))

    def readString(self):
