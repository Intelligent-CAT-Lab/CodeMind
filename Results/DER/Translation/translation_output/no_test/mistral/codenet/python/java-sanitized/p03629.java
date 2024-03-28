import java.util.*;

public class p03629 {
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