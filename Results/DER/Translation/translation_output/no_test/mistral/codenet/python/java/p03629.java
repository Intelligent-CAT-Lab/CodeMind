<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int[] intS = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            intS[i] = S.charAt(i) - 'a';
        }

        int[][] nextCharPos = new int[S.length() + 1][26];
        for (int i = S.length() - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (intS[i] == j) {
                    nextCharPos[i][j] = i;
                } else {
                    nextCharPos[i][j] = nextCharPos[i + 1][j];
                }
            }
        }

        int[] nonSubseqLen = new int[S.length() + 1];
        Arrays.fill(nonSubseqLen, S.length() + 2);
        nonSubseqLen[S.length()] = 1;
        nonSubseqLen[S.length() + 1] = 0;
        int[] ansNextPos = new int[S.length() + 1];
        int[] ansLetter = new int[S.length() + 1];
        for (int i = S.length() - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                int newLen = nonSubseqLen[nextCharPos[i][j] + 1];
                if (nonSubseqLen[i] > newLen) {
                    nonSubseqLen[i] = newLen;
                    ansLetter[i] = j;
                    ansNextPos[i] = nextCharPos[i][j] + 1;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            ans.append((char) ('a' + ansLetter[i]));
            i = ansNextPos[i];
        }
        System.out.println(ans.toString());
    }
}
```</s>
