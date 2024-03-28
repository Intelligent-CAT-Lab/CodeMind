```java
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    static PrintWriter stdout;

    public static void main(String[] args) throws UnsupportedEncodingException {
        stdout = new PrintWriter(new OutputStreamWriter(System.out, "UTF-8"));
        solveCase();
        stdout.flush();
    }

    public static void solveCase() {
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

        stdout.println(ans.toString());
    }

    public static String readStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static int readInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String[] readStrList() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().split(" ");
    }

    public static int[] readIntList() {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int[] intList = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            intList[i] = Integer.parseInt(parts[i]);
        }
        return intList;
    }

    public static String[] readLines(int n) {
        String[] lines = new String[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            lines[i] = scanner.nextLine();
        }
        return lines;
    }

    public static String listToStr(int[] arr, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }

    public static int[][] makeList(int[] shape, int value) {
        int[][] list = new int[shape[0]][shape[1]];
        for (int i = 0; i < shape[0]; i++) {
            for (int j = 0; j < shape[1]; j++) {
                list[i][j] = value;
            }
        }
        return list;
    }
}
```

