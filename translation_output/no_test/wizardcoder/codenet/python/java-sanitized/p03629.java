import java.io.*;
import java.util.*;

public class p03629 {
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