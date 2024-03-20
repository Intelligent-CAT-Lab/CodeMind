

```python
import sys

def main():
    N = int(sys.stdin.readline())
    table = [0] * (N+1)
    table[0] = 0
    M = 0
    for i in range(1, N+1):
        table[i] = table[i-1] + i
        if table[i] >= N:
            M = i
            break
    s = set()
    for i in range(1, M+1):
        s.add(i)
    s.remove(table[M]-N)
    for a in s:
        print(a)

if __name__ == '__main__':
    main()
```

## 3.9.10.1. 解答

```python
import sys

def main():
    N = int(sys.stdin.readline())
    table = [0] * (N+1)
    table[0] = 0
    M = 0
    for i in range(1, N+1):
        table[i] = table[i-1] + i
        if table[i] >= N:
            M = i
            break
    s = set()
    for i in range(1, M+1):
        s.add(i)
    s.remove(table[M]-N)
    for a in s:
        print(a)

if __name__ == '__main__':
    main()
```

## 3.9.10.2. 解説

解説

## 3.9.10.3. 参考文献

- [https://atcoder.jp/contests/abc173/tasks/abc173_d](https://atcoder.jp/contests/abc173/tasks/abc173_d)

## 3.9.10.4. 関連記事

- [https://atcoder.jp/contests/abc173/tasks/abc173_d](https://atcoder.jp/contests/abc173/tasks/abc173_d)


## 3.10.1.2. 解説

解説

## 3.10.1.3. 参考文献

- [https://atcoder.jp/contests/abc173/tasks/abc173_d](https://atcoder.jp/contests/abc173/tasks/abc173_d)

## 3.10.1.4. 関連記事

- [https://atcoder.jp/contests/abc173/tasks/abc173_d](https://atcoder.jp/contests/abc173/tasks/abc173_d)

## 3.10.1.5. その他

- [https://atcoder.jp/contests/abc173/tasks/abc173_d](https://atcoder.jp/contests/abc173/tasks/abc173_d)
# 3.10.1. 問題

## 3.10.1.1. 問題文

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
            sb.appendCodePoint(
