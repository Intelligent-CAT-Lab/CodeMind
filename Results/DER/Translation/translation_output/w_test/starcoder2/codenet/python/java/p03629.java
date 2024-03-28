

```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
        int ans = solveCase(sc);
        out.println(ans);
        out.flush();
    }

    static int solveCase(FastScanner sc) {
        String S = sc.next();

        int lenS = S.length();
        int[] intS = new int[lenS];
        for (int i = 0; i < lenS; i++) {
            intS[i] = S.charAt(i) - 'a';
        }

        // nextCharPos[fromIdx][letterIdx] := the position of the next letter `letterIdx` from `fromIdx`
        int[][] nextCharPos = new int[lenS + 1][26];
        for (int fromIdx = lenS - 1; fromIdx >= 0; fromIdx--) {
            for (int letterIdx = 0; letterIdx < 26; letterIdx++) {
                if (intS[fromIdx] == letterIdx) {
                    nextCharPos[fromIdx][letterIdx] = fromIdx;
                } else {
                    nextCharPos[fromIdx][letterIdx] = nextCharPos[fromIdx + 1][letterIdx];
                }
            }
        }

        // nonSubseqLen[fromIdx] := the length of the shortest "non subsequence" in S[fromIdx:]
        int[] nonSubseqLen = new int[lenS + 2];
        Arrays.fill(nonSubseqLen, lenS + 2);
        nonSubseqLen[lenS] = 1;
        nonSubseqLen[lenS + 1] = 0;
        int[] ansNextPos = new int[lenS + 1];
        int[] ansLetter = new int[lenS + 1];
        for (int fromIdx = lenS - 1; fromIdx >= 0; fromIdx--) {
            for (int letterIdx = 0; letterIdx < 26; letterIdx++) {
                int newLen = nonSubseqLen[nextCharPos[fromIdx][letterIdx] + 1] + 1;
                if (nonSubseqLen[fromIdx] > newLen) {
                    nonSubseqLen[fromIdx] = newLen;
                    ansLetter[fromIdx] = letterIdx;
                    ansNextPos[fromIdx] = nextCharPos[fromIdx][letterIdx] + 1;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        int idx = 0;
        while (idx < lenS) {
            ans.append((char) ('a' + ansLetter[idx]));
            idx = ansNextPos[idx];
        }
        return ans.toString();
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
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
    }
}
```

## 解説

## 参考

- [AtCoder Regular Contest 086 - AtCoder](https://atcoder.jp/contests/arc086/tasks/arc086_b)
- [AtCoder Regular Contest 086 - AtCoder](https://atcoder.jp/contests/arc086/submissions/1000000)


## 解説

## 参考

- [AtCoder Regular Contest 
