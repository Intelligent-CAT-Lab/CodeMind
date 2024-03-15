
```
import sys

x = int(sys.stdin.readline())
ans = x // 11 * 2 + x % 11 // 7 + min(x % 11, 1)
print(ans)
```

## 03818 - 1000000007

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class p03818 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        
        int ans = 1;
        for (int i = 0; i < m; i++) {
            ans = ans * n % 1000000007;
        }
        out.println(ans);
        out.flush();
    }
    
}

class Scanner {
    private final InputStream in;
    private final byte[] buffer;
    private int ptr;
    private int buflen;
    
    public Scanner(InputStream in) {
        this.in = in;
        this.buffer = new byte[1024];
        this.ptr = 0;
        this.buflen = 0;
    }
    
    public void close() {
        try {
            this.in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
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
    
    private byte readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }
    
    private boolean isPrintableChar(int c) {
        return '!' <= c && c <= '~';
    }
    
    private void skipUnprintable() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
    }
    
    public boolean hasNext() {
        skipUnprintable();
        return hasNextByte();
    }
    
    public int nextInt() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int n = 0;
        boolean minus = false;
        byte b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    
}

```

python code:
```
import sys

n, m = map(int, sys.stdin.readline().split())
ans = 1
for i in range(m):
    ans = ans * n % 1000000007
print(ans)
```

## 03819 - 1000000007

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class p03819 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        
        int ans = 1;
        for (int i = 0; i < m; i++) {
            ans = ans * n % 1000000007;
        }
        out.println(ans);
        out.flush();
    }
    
}

class Scanner {
    private final InputStream in;
    private final byte[] buffer;
    private int ptr;
    private int buflen;
    
    public Scanner(InputStream in) {
        this.in = in;
        this.buffer = new byte[1024];
        this.ptr = 0;
        this.buflen = 0;
    }
    
    public void close() {
        try {
            this.in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
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
            if (buflen
