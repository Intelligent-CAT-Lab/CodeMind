import java.io.*;
import java.util.*;

public class p03629 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();

        int len_s = S.length();
        int[] int_s = new int[len_s];
        for (int i = 0; i < len_s; i++) {
            int_s[i] = S.charAt(i) - 'a';
        }

        int[][] next_char_pos = new int[len_s + 1][26];
        for (int from_idx = len_s - 1; from_idx >= 0; from_idx--) {
            for (int letter_idx = 0; letter_idx < 26; letter_idx++) {
                if (int_s[from_idx] == letter_idx) {
                    int pos = from_idx;
                } else {
                    int pos = next_char_pos[from_idx+1][letter_idx];
                }
                next_char_pos[from_idx][letter_idx] = pos;
            }
        }

        int[] non_subseq_len = new int[len_s + 2];
        non_subseq_len[len_s] = 1;
        non_subseq_len[len_s + 1] = 0;
        int[] ans_next_pos = new int[len_s + 1];
        int[] ans_letter = new int[len_s + 1];
        for (int from_idx = len_s - 1; from_idx >= 0; from_idx--) {
            for (int letter_idx = 0; letter_idx < 26; letter_idx++) {
                int new_len = non_subseq_len[next_char_pos[from_idx][letter_idx] + 1] + 1;
                if (non_subseq_len[from_idx] > new_len) {
                    non_subseq_len[from_idx] = new_len;
                    ans_letter[from_idx] = letter_idx;
                    ans_next_pos[from_idx] = next_char_pos[from_idx][letter_idx] + 1;
                }
            }
        }

        String ans = "";
        int idx = 0;
        while (idx < len_s) {
            ans += (char) ('a' + ans_letter[idx]);
            idx = ans_next_pos[idx];
        }

        bw.write(ans + "\n");
        bw.close();
    }
}