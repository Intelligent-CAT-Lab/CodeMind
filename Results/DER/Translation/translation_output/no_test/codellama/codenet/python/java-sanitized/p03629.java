import java.util.Scanner;

public class p03629 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(solveCase(S));
    }

    private static String solveCase(String S) {
        int lenS = S.length();
        int[] intS = new int[lenS];
        for (int i = 0; i < lenS; i++) {
            intS[i] = S.charAt(i) - 'a';
        }

        int[][] nextCharPos = new int[lenS + 1][26];
        for (int fromIdx = lenS - 1; fromIdx >= 0; fromIdx--) {
            for (int letterIdx = 0; letterIdx < 26; letterIdx++) {
                if (intS[fromIdx] == letterIdx) {
                    nextCharPos[fromIdx][letterIdx] = fromIdx;
                } else {
                    nextCharPos[fromIdx][letterIdx] = nextCharPos[fromIdx + 1][letterIdx];
                }
            }
        }

        int[] nonSubseqLen = new int[lenS + 2];
        nonSubseqLen[lenS] = 1;
        nonSubseqLen[lenS + 1] = 0;
        int[] ansNextPos = new int[lenS + 1];
        int[] ansLetter = new int[lenS + 1];
        for (int fromIdx = lenS - 1; fromIdx >= 0; fromIdx--) {
            for (int letterIdx = 0; letterIdx < 26; letterIdx++) {
                int newLen = nonSubseqLen[nextCharPos[fromIdx][letterIdx] + 1] + 1;
                if (nonSubseqLen[fromIdx] > newLen) {
                    nonSubseqLen[fromIdx] = newLen;
                    ansLetter[fromIdx] = letterIdx;
                    ansNextPos[fromIdx] = nextCharPos[fromIdx][letterIdx] + 1;
                }
            }
        }

        String ans = "";
        int idx = 0;
        while (idx < lenS) {
            ans += (char) (ansLetter[idx] + 'a');
            idx = ansNextPos[idx];
        }
        return ans;
    }
}