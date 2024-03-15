```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Solution {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter pw = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String ans = solveCase();
        pw.println(ans);
        pw.close();
    }

    private static String solveCase() throws IOException {
        String S = readStr();

        int lenS = S.length();
        int[] intS = new int[lenS];
        for (int i = 0; i < lenS; i++) {
            intS[i] = S.charAt(i) - 'a';
        }

        int[][] nextCharPos = makeList(new int[]{lenS + 1, 26}, lenS);
        for (int fromIdx = lenS - 1; fromIdx >= 0; fromIdx--) {
            for (int letterIdx = 0; letterIdx < 26; letterIdx++) {
                int pos;
                if (intS[fromIdx] == letterIdx) {
                    pos = fromIdx;
                } else {
                    pos = nextCharPos[fromIdx + 1][letterIdx];
                }
                nextCharPos[fromIdx][letterIdx] = pos;
            }
        }

        int[] nonSubseqLen = makeList(new int[]{lenS + 2}, lenS + 1);
        nonSubseqLen[lenS] = 1;
        nonSubseqLen[lenS + 1] = 0;
        int[] ansNextPos = makeList(new int[]{lenS + 1}, lenS);
        int[] ansLetter = makeList(new int[]{lenS + 1}, -1);
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
            ans.append((char) ('a' + ansLetter[idx]));
            idx = ansNextPos[idx];
        }
        return ans.toString();
    }

    private static String readStr() throws IOException {
        return br.readLine();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    private static String[] readStrList() throws IOException {
        return br.readLine().split(" ");
    }

    private static int[] readIntList() throws IOException {
        String[] parts = br.readLine().split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        return arr;
    }

    private static String[] readLines(int n) throws IOException {
        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            lines[i] = br.readLine();
        }
        return lines;
    }

    private static int[][] makeList(int[] shape, int value) {
        if (shape.length == 1) {
            int[] arr = new int[shape[0]];
            for (int i = 0; i < shape[0]; i++) {
                arr[i] = value;
            }
            return arr;
        } else {
            int[][] arr = new int[shape[0]][];
            for (int i = 0; i < shape[0]; i++) {
                arr[i] = makeList(slice(shape, 1), value);
            }
            return arr;
        }
    }

    private static int[] slice(int[] arr, int start) {
        int[] newArr = new int[arr.length - start];
        for (int i = start; i < arr.length; i++) {
            newArr[i - start] = arr[i];
        }
        return newArr;
    }
}
```
