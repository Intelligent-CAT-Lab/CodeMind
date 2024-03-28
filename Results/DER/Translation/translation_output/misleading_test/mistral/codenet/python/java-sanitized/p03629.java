import java.util.*;

public class p03629 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
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
                    next_char_pos[from_idx][letter_idx] = from_idx;
                } else {
                    next_char_pos[from_idx][letter_idx] = next_char_pos[from_idx + 1][letter_idx];
                }
            }
        }

        // non_subseq_len[from_idx] := the length of the shortest "non subsequence" in S[from_idx:]
        int[] non_subseq_len = new int[len_s + 1];
        non_subseq_len[len_s] = 1;
        non_subseq_len[len_s + 1] = 0;
        int[] ans_next_pos = new int[len_s + 1];
        int ans_letter = -1;
        for (int from_idx = len_s - 1; from_idx >= 0; from_idx--) {
            for (int letter_idx = 0; letter_idx < 26; letter_idx++) {
                int new_len = non_subseq_len[next_char_pos[from_idx][letter_idx] + 1] + 1;
                if (non_subseq_len[from_idx] > new_len) {
                    non_subseq_len[from_idx] = new_len;
                    ans_letter = letter_idx;
                    ans_next_pos[from_idx] = next_char_pos[from_idx][letter_idx] + 1;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int idx = 0; idx < len_s; idx++) {
            ans.append((char) ('a' + ans_letter));
            idx = ans_next_pos[idx];
        }
        System.out.println(ans.toString());
    }
}