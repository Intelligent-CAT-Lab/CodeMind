
```
import sys

def main():
    K = int(sys.stdin.readline())
    A = K // 50
    B = K % 50
    a = [i + A for i in range(50)]
    for i in range(49, 49 - B, -1):
        a[i] += 1
    print(50)
    for i in range(50):
        print(a[i], end=' ')
    print()

if __name__ == '__main__':
    main()
```


```

python code:
```
import sys

def main():
    N = int(sys.stdin.readline())
    a = [int(sys.stdin.readline()) for _ in range(N)]
    a.sort()
    print(a[N // 2])

if __name__ == '__main__':
    main()
```
/problems/p00001.md
# p00001

## 問題文

N個の整数が与えられます。

N個の整数の中央値を求めてください。

## 制約

- 1 <= N <= 100000
- 1 <= a[i] <= 1000000000

## 入力

```
N
a[0]
a[1]
...
a[N-1]
```

## 出力

```
中央値
```

## 入出力例

### 例1

```
5
1
2
3
4
5
```

```
3
```

### 例2

```
5
1
2
3
4
6
```

```
3
```

### 例3

```
5
1
2
3
4
5
```

```
3
```

### 例4

```
5
1
2
3
4
6
```

```
3
```

### 例5

```
5
1
2
3
4
6
```

```
3
```

### 例6

```
5
1
2
3
4
6
```

```
3
```

### 例7

```
5
1
2
3
4
6
```

```
3
```

### 例8

```
5
1
2
3
4
6
```

```
3
```

### 例9

```
5
1
2
3
4
6
```

```
3
```

### 例10

```
5
1
2
3
4
6
```

```
3
```

## 解答

```
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
 
public class p00001 {
    private static FastScanner sc = new FastScanner();
    
    public static void main(String[] args) {
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[N/2]);
    }
    
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
                    return false;
                }
            }
            return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
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
            return Long.parseLong(next());
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}/problems/p00002.md
# p00002

## 問題文

N個の整数が与えられます。

N個の整数の中央値を求めてください。

## 制約

- 1 <= N <= 100000
- 1 <= a[i] <= 1000000000

## 入力

```
N
a[0]
a[1]
...
a[N-1]
```

## 出力

```
中央値
```

## 入出力例

### 例1

```
5
1
2
3
4
5
```

```
3
```

### 例2

```
5
1
2
3
4
6
```

```
3
```

### 例3

```
5
1
2
3
4
5
```

```
3
```

### 例4

```
5
1
2
3
4
6
```

```
3
```

### 例5


