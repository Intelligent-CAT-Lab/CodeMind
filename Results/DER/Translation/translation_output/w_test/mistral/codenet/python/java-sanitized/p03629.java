import java.util.*;

public class p03629 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int[] intS = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            intS[i] = S.charAt(i) - 'a';
        }

        // next_char_pos[from_idx][letter_idx] := the position of the next letter `letter_idx` from `from_idx`
        int[][] nextCharPos = new int[S.length() + 1][26];
        for (int fromIdx = S.length() - 1; fromIdx >= 0; fromIdx--) {
            for (int letterIdx = 0; letterIdx < 26; letterIdx++) {
                if (intS[fromIdx] == letterIdx) {
                    nextCharPos[fromIdx][letterIdx] = fromIdx;
                } else {
                    nextCharPos[fromIdx][letterIdx] = nextCharPos[fromIdx + 1][letterIdx];
                }
            }
        }

        // non_subseq_len[from_idx] := the length of the shortest "non subsequence" in S[from_idx:]
        int[] nonSubseqLen = new int[S.length() + 2];
        nonSubseqLen[S.length()] = 1;
        nonSubseqLen[S.length() + 1] = 0;
        int[] ansNextPos = new int[S.length() + 1];
        int ansLetter = -1;
        for (int fromIdx = S.length() - 1; fromIdx >= 0; fromIdx--) {
            for (int letterIdx = 0; letterIdx < 26; letterIdx++) {
                int newLen = nonSubseqLen[nextCharPos[fromIdx][letterIdx] + 1];
                if (nonSubseqLen[fromIdx] > newLen) {
                    nonSubseqLen[fromIdx] = newLen;
                    ansLetter = letterIdx;
                    ansNextPos[fromIdx] = nextCharPos[fromIdx][letterIdx] + 1;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int idx = 0; idx < S.length(); idx++) {
            ans.append((char) (ansLetter + 'a'));
            idx = ansNextPos[idx];
        }
        System.out.println(ans.toString());
    }
}