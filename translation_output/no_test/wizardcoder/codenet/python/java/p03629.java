Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            String S = br.readLine();
            int len_s = S.length();
            int[] int_s = new int[len_s];
            for (int j = 0; j < len_s; j++) {
                int_s[j] = S.charAt(j) - 'a';
            }

            int[][] next_char_pos = new int[len_s + 1][26];
            for (int j = len_s - 1; j >= 0; j--) {
                for (int k = 0; k < 26; k++) {
                    if (int_s[j] == k) {
                        next_char_pos[j][k] = j;
                    } else {
                        next_char_pos[j][k] = next_char_pos[j+1][k];
                    }
                }
            }

            int[] non_subseq_len = new int[len_s + 2];
            non_subseq_len[len_s] = 1;
            non_subseq_len[len_s + 1] = 0;
            int[] ans_next_pos = new int[len_s + 1];
            int[] ans_letter = new int[len_s + 1];
            for (int j = len_s - 1; j >= 0; j--) {
                for (int k = 0; k < 26; k++) {
                    int new_len = non_subseq_len[next_char_pos[j][k] + 1] + 1;
                    if (non_subseq_len[j] > new_len) {
                        non_subseq_len[j] = new_len;
                        ans_letter[j] = k;
                        ans_next_pos[j] = next_char_pos[j][k] + 1;
                    }
                }
            }

            StringBuilder ans = new StringBuilder();
            int idx = 0;
            while (idx < len_s) {
                ans.append((char)('a' + ans_letter[idx]));
                idx = ans_next_pos[idx];
            }

            bw.write("Case #" + i + ": " + ans.toString() + "\n");
        }

        bw.close();
        br.close();
    }
}
```<|endoftext|>
