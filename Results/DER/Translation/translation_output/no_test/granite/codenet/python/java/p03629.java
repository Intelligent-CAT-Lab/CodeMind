System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
    static FastScanner in;
    static PrintWriter out;
    static final int MOD = 100000007;

    public static void main(String[] args) throws IOException {
        //        Scanner in = new Scanner(new File("input.txt"));
        //        Scanner in = new Scanner(System.in);
        //        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("output.txt")), true));
        out = new PrintWriter(System.out);
        in = new FastScanner(System.in);
        //        in = new FastScanner("input.txt");
        int t = 1;
        while (t-- > 0) {
            solve();
        }
        out.close();
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(InputStream i) {
            br = new BufferedReader(new InputStreamReader(i));
            st = new StringTokenizer("");
        }

        public FastScanner(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
            st = new StringTokenizer("");
        }

        public String next() throws IOException {
            if (st.hasMoreTokens())
                return st.nextToken();
            else
                st = new StringTokenizer(br.readLine());
            return next();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }

    static char[] s;
    static int[][] next;
    static int[] ansNext;
    static int[] ansLetter;
    static int[] nonSubseqLen;

    static void solve() throws IOException {
        s = in.next().toCharArray();
        int n = s.length;
        next = new int[n][26];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (i == n - 1) {
                    next[i][j] = s[i] - 'a' == j? n : i + 1;
                } else {
                    next[i][j] = next[i + 1][j];
                    if (s[i] - 'a' == j) {
                        next[i][j] = i;
                    }
                }
            }
        }
        nonSubseqLen = new int[n + 1];
        ansNext = new int[n + 1];
        ansLetter = new int[n + 1];
        nonSubseqLen[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                int nextPos = next[i][j];
                int newLen = nonSubseqLen[nextPos + 1] + 1;
                if (newLen < nonSubseqLen[i]) {
                    nonSubseqLen[i] = newLen;
                    ansLetter[i] = j;
                    ansNext[i] = nextPos + 1;
                }
            }
        }
        int cur = 0;
        StringBuilder sb = new StringBuilder();
        while (cur < n) {
            sb.append((char) (ansLetter[cur] + 'a'));
            cur = ansNext[cur];
        }
        out.println(sb.toString());
    }
}
```<|endoftext|>
