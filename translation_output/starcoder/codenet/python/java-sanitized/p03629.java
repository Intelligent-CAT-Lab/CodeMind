import java.util.*;
import java.io.*;

public class p03629 {
    public static void main(String[] args) {
        new Main().run();
    }

    class Node {
        int len;
        int letter;
        int nextPos;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int len_s = S.length();
        int[] int_s = new int[len_s];
        for (int i = 0; i < len_s; i++) {
            int_s[i] = (int) S.charAt(i) - (int) 'a';
        }

        Node[][] next_char_pos = new Node[len_s + 1][26];
        for (int from_idx = len_s - 1; from_idx >= 0; from_idx--) {
            for (int letter_idx = 0; letter_idx < 26; letter_idx++) {
                if (int_s[from_idx] == letter_idx) {
                    int pos = from_idx;
                } else {
                    int pos = next_char_pos[from_idx + 1][letter_idx].nextPos;
                }
                next_char_pos[from_idx][letter_idx] = new Node();
                next_char_pos[from_idx][letter_idx].len = pos - from_idx;
                next_char_pos[from_idx][letter_idx].letter = letter_idx;
                next_char_pos[from_idx][letter_idx].nextPos = pos;
            }
        }

        int[] non_subseq_len = new int[len_s + 2];
        non_subseq_len[len_s] = 1;
        non_subseq_len[len_s + 1] = 0;
        int[] ans_next_pos = new int[len_s + 1];
        int[] ans_letter = new int[len_s + 1];
        for (int from_idx = len_s - 1; from_idx >= 0; from_idx--) {
            for (int letter_idx = 0; letter_idx < 26; letter_idx++) {
                int new_len = non_subseq_len[next_char_pos[from_idx][letter_idx].nextPos + 1] + 1;
                if (non_subseq_len[from_idx] > new_len) {
                    non_subseq_len[from_idx] = new_len;
                    ans_letter[from_idx] = letter_idx;
                    ans_next_pos[from_idx] = next_char_pos[from_idx][letter_idx].nextPos + 1;
                }
            }
        }

        String ans = "";
        int idx = 0;
        while (idx < len_s) {
            ans += (char) ('a' + ans_letter[idx]);
            idx = ans_next_pos[idx];
        }
        System.out.println(ans);
    }
}