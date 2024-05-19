System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoderregularcontest

Expected output:
b


```
# import sys
from sys import stdout
# from copy import copy, deepcopy
# from functools import lru_cache
# from string import ascii_lowercase
# from math import inf
# inf = float('inf')


def main():
    ans = solve_case()
    stdout.write("{}\n".format(ans))

def solve_case():
    S = read_str()

    len_s = len(S)
    int_s = [ord(c) - ord('a') for c in S]

    # next_char_pos[from_idx][letter_idx] := the position of the next letter `letter_idx` from `from_idx`
    next_char_pos = make_list((len_s + 1, 26), len_s)
    for from_idx in reversed(range(len_s)):
        for letter_idx in range(26):
            if int_s[from_idx] == letter_idx:
                pos = from_idx
            else:
                pos = next_char_pos[from_idx+1][letter_idx]
            next_char_pos[from_idx][letter_idx] = pos

    # non_subseq_len[from_idx] := the length of the shortest "non subsequence" in S[from_idx:]
    non_subseq_len = make_list([len_s + 2], len_s + 1)
    non_subseq_len[len_s] = 1
    non_subseq_len[len_s + 1] = 0
    ans_next_pos = make_list([len_s + 1], len_s)
    ans_letter = make_list([len_s + 1], -1)
    for from_idx in reversed(range(len_s)):
        for letter_idx in range(26):
            new_len = non_subseq_len[next_char_pos[from_idx][letter_idx] + 1] + 1
            if non_subseq_len[from_idx] > new_len:
                non_subseq_len[from_idx] = new_len
                ans_letter[from_idx] = letter_idx
                ans_next_pos[from_idx] = next_char_pos[from_idx][letter_idx] + 1

    ans = ''
    idx = 0
    while idx < len(S):
        ans += chr(ord('a') + ans_letter[idx])
        idx = ans_next_pos[idx]
    return ans

#################################

def read_str(): return input()
def read_int(): return int(input())
def read_str_list(): return input().split(' ')
def read_int_list(): return list(map(int, input().split(' ')))
def read_lines(n, read_func): return [read_func() for _ in range(n)]
def list_to_str(l, sep=' '): return sep.join(map(str, l))
l2s = list_to_str
# shape: tuple of ints | list of ints
def make_list(shape, value=None):
    if len(shape) == 1:
        return [value] * shape[0]
    return [make_list(shape[1:], value) for _ in range(shape[0])]

if __name__ == '__main__':
    # sys.setrecursionlimit(1000000)
    main()

```


Answer:
```java
import java.io.*;
import java.util.*;

public class Main {
    static FastScanner sc = new FastScanner(System.in);
    static PrintWriter pw = new PrintWriter(System.out);
    
    public static void main(String[] args) throws Exception {
        char[] s = sc.next().toCharArray();
        int n = s.length;
        int[][] next = new int[n][26];
        for(int i = n-1; i >= 0; i--) {
            for(int j = 0; j < 26; j++) {
                if(i == n-1) {
                    next[i][j] = (s[i] - 'a' == j)? n : i+1;
                } else {
                    next[i][j] = next[i+1][j];
                    if(s[i] - 'a' == j) {
                        next[i][j] = i;
                    }
                }
            }
        }
        int[] dp = new int[n+1];
        int[] prev = new int[n+1];
        Arrays.fill(dp,n+1);
        dp[n] = 0;
        for(int i = n-1; i >= 0; i--) {
            for(int j = 0; j < 26; j++) {
                int to = next[i][j];
                if(dp[to+1] + 1 < dp[i]) {
                    dp[i] = dp[to+1] + 1;
                    prev[i] = j;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int now = 0;
        while(now < n) {
            sb.append((char)('a' + prev[now]));
            now = next[now][prev[now]] + 1;
        }
        pw.println(sb.toString());
        pw.flush();
    }

    static void put(int[] arr, int idx, int val) {
        if(idx < 0 || idx >= arr.length) return;
        arr[idx] = val;
    }

    static void put(long[] arr, int idx, long val) {
        if(idx < 0 || idx >= arr.length) return;
        arr[idx] = val;
    }

    static void put(double[] arr, int idx, double val) {
        if(idx < 0 || idx >= arr.length) return;
        arr[idx] = val;
    }

    static void put(boolean[] arr, int idx, boolean val) {
        if(idx < 0 || idx >= arr.length) return;
        arr[idx] = val;
    }

    static void put(char[] arr, int idx, char val) {
        if(idx < 0 || idx >= arr.length) return;
        arr[idx] = val;
    }

    static void put(int[][] arr, int i, int j, int val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        arr[i][j] = val;
    }

    static void put(long[][] arr, int i, int j, long val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        arr[i][j] = val;
    }

    static void put(double[][] arr, int i, int j, double val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        arr[i][j] = val;
    }

    static void put(char[][] arr, int i, int j, char val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        arr[i][j] = val;
    }

    static void put(int[][][] arr, int i, int j, int k, int val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(k < 0 || k >= arr[0][0].length) return;
        arr[i][j][k] = val;
    }

    static void put(long[][][] arr, int i, int j, int k, long val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(k < 0 || k >= arr[0][0].length) return;
        arr[i][j][k] = val;
    }

    static void put(double[][][] arr, int i, int j, int k, double val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(k < 0 || k >= arr[0][0].length) return;
        arr[i][j][k] = val;
    }

    static void put(char[][][] arr, int i, int j, int k, char val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(k < 0 || k >= arr[0][0].length) return;
        arr[i][j][k] = val;
    }

    static void put(int[][][][] arr, int i, int j, int k, int l, int val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(k < 0 || k >= arr[0][0].length) return;
        if(l < 0 || l >= arr[0][0][0].length) return;
        arr[i][j][k][l] = val;
    }

    static void put(long[][][][] arr, int i, int j, int k, int l, long val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(k < 0 || k >= arr[0][0].length) return;
        if(l < 0 || l >= arr[0][0][0].length) return;
        arr[i][j][k][l] = val;
    }

    static void put(double[][][][] arr, int i, int j, int k, int l, double val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(k < 0 || k >= arr[0][0].length) return;
        if(l < 0 || l >= arr[0][0][0].length) return;
        arr[i][j][k][l] = val;
    }

    static void put(char[][][][] arr, int i, int j, int k, int l, char val) {
        if(i < 0 || i >= arr.length) return;
        if(j < 0 || j >= arr[0].length) return;
        if(k < 0 || k >= arr[0][0].length) return;
        if(l < 0 || l >= arr[0][0][0].length) return;
        arr[i][j][k][l] = val;
    }

    static <T> void fill(T[][] arr, T val) {
        for(int i = 0; i < arr.length; i++) Arrays.fill(arr[i], val);
    }

    static <T> void fill(T[][][] arr, T val) {
        for(int i = 0; i < arr.length; i++) fill(arr[i], val);
    }

    static <T> void fill(T[][][][] arr, T val) {
        for(int i = 0; i < arr.length; i++) fill(arr[i], val);
    }

    static <T> void fill(T[][][][][] arr, T val) {
        for(int i = 0; i < arr.length; i++) fill(arr[i], val);
    }

    static class FastScanner {
        private InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        public FastScanner(InputStream in) {this.in = in;}
        private boolean hasNextByte() {
            if(ptr < buflen) return true;
            ptr = 0;
            try {buflen = in.read(buffer);}
            catch (final IOException e) {e.printStackTrace();}
            return buflen > 0;
        }
        private int readByte() {return hasNextByte()? buffer[ptr++] : -1;}
       
