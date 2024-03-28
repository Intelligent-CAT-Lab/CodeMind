import java.io.*;
import java.util.*;

public class p03629 {

    public static void main(String[] args) {
        String ans = solveCase();
        System.out.println(ans);
    }

    public static String solveCase() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        int len_s = S.length();
        int[] int_s = new int[len_s];
        for (int i = 0; i < len_s; i++) {
            int_s[i] = S.charAt(i) - 'a';
        }

        int[][] next_char_pos = new int[len_s + 1][26];
        for (int[] row : next_char_pos) {
            Arrays.fill(row, len_s);
        }

        for (int from_idx = len_s - 1; from_idx >= 0; from_idx--) {
            for (int letter_idx = 0; letter_idx < 26; letter_idx++) {
                int pos;
                if (int_s[from_idx] == letter_idx) {
                    pos = from_idx;
                } else {
                    pos = next_char_pos[from_idx+1][letter_idx];
                }
                next_char_pos[from_idx][letter_idx] = pos;
            }
        }

        int[] non_subseq_len = new int[len_s + 2];
        int[] ans_next_pos = new int[len_s + 1];
        int[] ans_letter = new int[len_s + 1];
        Arrays.fill(non_subseq_len, len_s + 1);
        non_subseq_len[len_s] = 1;
        non_subseq_len[len_s + 1] = 0;

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

        StringBuilder ans = new StringBuilder();
        int idx = 0;
        while (idx < len_s) {
            ans.append((char)(ans_letter[idx] + 'a'));
            idx = ans_next_pos[idx];
        }

        return ans.toString();
    }
}