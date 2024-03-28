import java.util.*;
import java.io.*;

public class p03629 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

    public static void main(String[] args) throws IOException {
        String ans = solveCase();
        pr.println(ans);
        pr.close();
    }

    static String solveCase() throws IOException {
        String S = br.readLine();

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
        int[] ansNextPos = new int[lenS];
        int[] ansLetter = new int[lenS];
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

        StringBuilder ans = new StringBuilder();
        int idx = 0;
        while (idx < lenS) {
            ans.append((char) (ansLetter[idx] + 'a'));
            idx = ansNextPos[idx];
        }
        return ans.toString();
    }
}