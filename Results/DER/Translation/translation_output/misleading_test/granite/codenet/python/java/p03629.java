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
    
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        char[] s = sc.next().toCharArray();
        int n = s.length;
        int[][] next = new int[n][26];
        for(int i = n-1; i >= 0; i--) {
            for(int j = 0; j < 26; j++) {
                if(i == n-1) {
                    next[i][j] = s[i] - 'a' == j? n : -1;
                } else {
                    next[i][j] = next[i+1][j];
                    if(next[i][j]!= -1 && s[next[i][j]] - 'a'!= j) {
                        next[i][j] = -1;
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
                if(next[i][j] == -1) continue;
                int cost = dp[next[i][j]+1]+1;
                if(cost < dp[i]) {
                    dp[i] = cost;
                    prev[i] = j;
                }
            }
        }
        int idx = 0;
        while(idx < n) {
            sb.append((char)('a'+prev[idx]));
            idx = next[idx][prev[idx]]+1;
        }
        pw.println(sb.toString());
        pw.flush();
    }

    static void put(int idx, int val) {
        sb.append(idx).append(":").append(val).append(" ");
    }

    static void put(int[] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(i,ar[i]);
        }
        pw.println();
    }

    static void put(Object[] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(i+"",ar[i]);
        }
        pw.println();
    }

    static void put(long[] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(i+"",ar[i]);
        }
        pw.println();
    }

    static void put(double[] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(i+"",ar[i]);
        }
        pw.println();
    }

    static void put(Object[][] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(ar[i]);
        }
        pw.println();
    }

    static void put(Object[][][] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(ar[i]+"");
        }
        pw.println();
    }

    static void put(boolean[] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(i+"",ar[i]);
        }
        pw.println();
    }

    static void put(boolean[][] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(ar[i]);
        }
        pw.println();
    }

    static void put(char[] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(i+"",ar[i]);
        }
        pw.println();
    }

    static void put(char[][] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(ar[i]);
        }
    }

    static void put(String[] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(i+"",ar[i]);
        }
        pw.println();
    }

    static void put(String[][] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(ar[i]);
        }
        pw.println();
    }

    static void put(String[][][] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(ar[i]+"");
        }
        pw.println();
    }

    static void put(int[][] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(ar[i]);
        }
    }

    static void put(long[][] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(ar[i]);
        }
    }

    static void put(double[][] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(ar[i]);
        }
    }

    static void put(boolean[][] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(ar[i]);
        }
    }

    static void put(char[][] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(ar[i]);
        }
    }

    static void put(String[][] ar) {
        for(int i = 0; i < ar.length; i++) {
            put(ar[i]);
        }
    }

    // array util
    static void reverse(int[] ar) {
        int len = ar.length;
        for (int i = 0; i < len / 2; i++) {
            int t = ar[i];
            ar[i] = ar[len - 1 - i];
            ar[len - 1 - i] = t;
        }
    }

    static void reverse(long[] ar) {
        int len = ar.length;
        for (int i = 0; i < len / 2; i++) {
            long t = ar[i];
            ar[i] = ar[len - 1 - i];
            ar[len - 1 - i] = t;
        }
    }

    static void reverse(double[] ar) {
        int len = ar.length;
        for (int i = 0; i < len / 2; i++) {
            double t = ar[i];
            ar[i] = ar[len - 1 - i];
            ar[len - 1 - i] = t;
        }
    }

    static void reverse(char[] ar) {
        int len = ar.length;
        for (int i = 0; i < len / 2; i++) {
            char t = ar[i];
            ar[i] = ar[len - 1 - i];
            ar[len - 1 - i] = t;
        }
    }

    static void reverse(String[] ar) {
        int len = ar.length;
        for (int i = 0; i < len / 2; i++) {
            String t = ar[i];
            ar[i] = ar[len - 1 - i];
            ar[len - 1 - i] = t;
        }
    }

    static void reverse(boolean[] ar) {
        int len = ar.length;
        for (int i = 0; i < len / 2; i++) {
            boolean t = ar[i];
            ar[i] = ar[len - 1 - i];
            ar[len - 1 - i] = t;
        }
    }

    static <T> void reverse(T[] ar) {
        int len = ar.length;
        for (int i = 0; i < len / 2; i++) {
            T t = ar[i];
            ar[i] = ar[len - 1 - i];
            ar[len - 1 - i] = t;
        }
    }

    static void fill(int arr[], int x) {
        Arrays.fill(arr, x);
    }

    static void fill(long arr[], long x) {
        Arrays.fill(arr, x);
    }

    static void fill(boolean arr[], boolean x) {
        Arrays.fill(arr, x);
    }

    static void fill(double arr[], double x) {
        Arrays.fill(arr, x);
    }

    static void fill(int arr[][], int x) {
        for (int i = 0; i < arr.length; i++)
            Arrays.fill(arr[i], x);
    }

    static void fill(long arr[][], long x) {
        for (int i = 0; i < arr.length; i++)
            Arrays.fill(arr[i], x);
    }

    static void fill(double arr[][], double x) {
        for (int i = 0; i < arr
