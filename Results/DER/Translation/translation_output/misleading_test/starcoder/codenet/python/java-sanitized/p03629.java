import java.util.*;
import java.io.*;

public class p03629 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[] next_char_pos = new int[n+1][26];
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (s.charAt(i) == (char)('a'+j)) {
                    next_char_pos[i][j] = i;
                } else {
                    next_char_pos[i][j] = next_char_pos[i+1][j];
                }
            }
        }
        int[] non_subseq_len = new int[n+2];
        non_subseq_len[n] = 1;
        non_subseq_len[n+1] = 0;
        int[] ans_next_pos = new int[n+1];
        int[] ans_letter = new int[n+1];
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                int new_len = non_subseq_len[next_char_pos[i][j]+1] + 1;
                if (non_subseq_len[i] > new_len) {
                    non_subseq_len[i] = new_len;
                    ans_letter[i] = j;
                    ans_next_pos[i] = next_char_pos[i][j] + 1;
                }
            }
        }
        char[] ans = new char[n];
        int idx = 0;
        while (idx < n) {
            ans[idx] = (char)('a' + ans_letter[idx]);
            idx = ans_next_pos[idx];
        }
        System.out.println(new String(ans));
    }
}