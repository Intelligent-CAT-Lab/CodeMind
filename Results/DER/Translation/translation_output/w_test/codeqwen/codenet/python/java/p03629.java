```java
import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        String ans = solveCase();
        System.out.println(ans);
    }

    public static String solveCase() {
        String S = readStr();

        int len_s = S.length();
        int[] int_s = new int[len_s];
        for (int i = 0; i < len_s; i++) {
            int_s[i] = S.charAt(i) - 'a';
        }

        // next_char_pos[from_idx][letter_idx] := the position of the next letter `letter_idx` from `from_idx`
        int[][] next_char_pos = new int[len_s + 1][26];
        for (int from_idx = len_s - 1; from_idx >= 0; from_idx--) {
            for (int letter_idx = 0; letter_idx < 26; letter_idx++) {
                if (int_s[from_idx] == letter_idx) {
                    int pos = from_idx;
                } else {
                    pos = next_char_pos[from_idx + 1][letter_idx];
                }
                next_char_pos[from_idx][letter_idx] = pos;
            }
        }

        // non_subseq_len[from_idx] := the length of the shortest "non subsequence" in S[from_idx:]
        int[] non_subseq_len = new int[len_s + 2];
        Arrays.fill(non_subseq_len, Integer.MAX_VALUE);
        non_subseq_len[len_s] = 1;
        non_subseq_len[len_s + 1] = 0;
        int[] ans_next_pos = new int[len_s + 1];
        int[] ans_letter = new int[len_s + 1];
        for (int from_idx = len_s - 1; from_idx >= 0; from_
