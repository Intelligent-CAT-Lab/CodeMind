Here is the Java version of the provided Python code:

```java
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        String ans = solveCase();
        System.out.println(ans);
    }

    public static String solveCase() {
        String S = readStr();

        int lenS = S.length();
        int[] intS = new int[lenS];
        for (int i = 0; i < lenS; i++) {
            intS[i] = S.charAt(i) - 'a';
        }

        int[][] nextCharPos = new int[lenS + 1][26];
        for (int fromIdx = lenS - 1; fromIdx >= 0; fromIdx--) {
            for (int letterIdx = 0; letterIdx < 26; letterIdx++) {
                if (intS[fromIdx] == letterIdx) {
                    int pos = fromIdx;
                } else {
                    pos = nextCharPos[fromIdx + 1][letterIdx];
                }
                nextCharPos[fromIdx][letterIdx] = pos;
            }
        }

        int[] nonSubseqLen = new int[lenS + 2];
        Arrays.fill(nonSubseqLen, Integer.MAX_VALUE);
        nonSubseqLen[lenS] = 1;
        nonSubseqLen[lenS + 1] = 0;
        int[] ansNextPos = new int[lenS + 1];
        int[] ansLetter = new int[lenS + 1];
        for (int fromIdx = lenS - 1; fromIdx >= 0; fromIdx--) {
            for (int letterIdx = 0; letterIdx < 26; letterIdx++) {
                int newLen = nonSubseqLen[nextCharPos[fromIdx][letterIdx] + 1] + 1;
                if (nonSubseqLen[fromIdx] > newLen) {
                    nonSubseqLen[fromIdx] = newLen;
                    ansLetter[fromIdx] = letterIdx
