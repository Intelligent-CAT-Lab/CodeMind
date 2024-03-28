import java.util.*;
import java.io.*;

public class p03629 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static String[] nextStringArray() throws IOException {
        return next().split("");
    }

    static int[][] nextIntArray(int n, int m) throws IOException {
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = nextInt();
            }
        }
        return a;
    }

    static int[] nextIntArray(int n) throws IOException {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    static String solve() throws IOException {
        String S = next();
        int len_s = S.length();
        int[] int_s = new int[len_s];
        for (int i = 0; i < len_s; i++) {
            int_s[i] = S.charAt(i) - 'a';
        }

        int[][] next_char_pos = new int[len_s + 1][26];
        Arrays.fill(next_char_pos[len_s], len_s);
        for (int from_idx = len_s - 1; from_idx >= 0; from_idx--) {
            for (int letter_idx = 0; letter_idx < 26; letter_idx++) {
                if (int_s[from_idx] == letter_idx) {
                    next_char_pos[from_idx][letter_idx] = from_idx;
                } else {
                    next_char_pos[from_idx][letter_idx] = next_char_pos[from_idx + 1][letter_idx];
                }
            }
        }

        int[] non_subseq_len = new int[len_s + 2];
        non_subseq_len[len_s] = 1;
        non_subseq_len[len_s + 1] = 0;
        int[] ans_next_pos = new int[len_s];
        int[] ans_letter = new int[len_s];
        Arrays.fill(ans_letter, -1);
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
            ans += (char) (ans_letter[idx] + 'a');
            idx = ans_next_pos[idx];
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(solve());
    }
}