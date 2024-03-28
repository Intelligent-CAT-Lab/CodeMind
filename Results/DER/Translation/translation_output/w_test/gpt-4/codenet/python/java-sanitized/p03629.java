import java.util.Arrays;
import java.util.Scanner;

public class p03629 {
    public static void main(String[] args) {
        Main instance = new Main();
        String ans = instance.solveCase();
        System.out.print(ans + "\n");
    }

    public String solveCase() {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int len_s = S.length();
        int[] int_s = new int[len_s];

        for (int i = 0; i < len_s; i++) {
            int_s[i] = S.charAt(i) - 'a';
        }

        int[][] next_char_pos = makeList(new int[]{len_s + 1, 26}, len_s);
        for (int from_idx = len_s - 1; from_idx >= 0; from_idx--) {
            for (int letter_idx = 0; letter_idx < 26; letter_idx++) {
                int pos;
                if (int_s[from_idx] == letter_idx) {
                    pos = from_idx;
                } else {
                    pos = next_char_pos[from_idx + 1][letter_idx];
                }
                next_char_pos[from_idx][letter_idx] = pos;
            }
        }

        int[] non_subseq_len = makeList(new int[]{len_s + 2}, len_s + 1);
        non_subseq_len[len_s] = 1;
        non_subseq_len[len_s + 1] = 0;

        int[] ans_next_pos = makeList(new int[]{len_s + 1}, len_s);
        int[] ans_letter = makeList(new int[]{len_s + 1}, -1);

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
            ans.append((char) ('a' + ans_letter[idx]));
            idx = ans_next_pos[idx];
        }
        scanner.close();
        return ans.toString();
    }

    public int[] makeList(int[] shape, int value) {
        int[] array = new int[shape[0]];
        if (shape.length == 1) {
            Arrays.fill(array, value);
            return array;
        } else {
            throw new IllegalArgumentException("Shape must have only one dimension for 'int' type lists.");
        }
    }

    public int[][] makeList(int[] shape, int value) {
        if (shape.length != 2) {
            throw new IllegalArgumentException("Shape must be two-dimensional for 'int[][]' type lists.");
        }

        int[][] array = new int[shape[0]][];
        for (int i = 0; i < shape[0]; i++) {
            array[i] = makeList(new int[]{shape[1]}, value);
        }
        return array;
    }
}