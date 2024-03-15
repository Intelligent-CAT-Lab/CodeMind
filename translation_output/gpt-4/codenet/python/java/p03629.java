The provided Python code is quite complex as it deals with a non-trivial algorithm. However, based on the logic and structure of the code, here's a possible translation into Java:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    static final int ALPHABET_SIZE = 26;
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String answer = solveCase();
        System.out.println(answer);
    }

    static String solveCase() {
        String S = readStr();

        int lenS = S.length();
        int[] intS = new int[lenS];
        for (int i = 0; i < lenS; ++i) {
            intS[i] = S.charAt(i) - 'a';
        }

        int[][] nextCharPos = makeList(new int[]{lenS + 1, ALPHABET_SIZE}, lenS);
        for (int fromIdx = lenS - 1; fromIdx >= 0; fromIdx--) {
            for (int letterIdx = 0; letterIdx < ALPHABET_SIZE; letterIdx++) {
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
            for (int letterIdx = 0; letterIdx < ALPHABET_SIZE; letterIdx++) {
                int newPos = nextCharPos[fromIdx][letterIdx] + 1;
                int newLen = nonSubseqLen[newPos] + 1;
                if (nonSubseqLen[fromIdx] > newLen) {
                    nonSubseqLen[fromIdx] = newLen;
                    ansLetter[fromIdx] = letterIdx;
                    ansNextPos[fromIdx] = newPos;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        int idx = 0;
        while (idx < lenS) {
            ans.append((char)('a' + ansLetter[idx]));
            idx = ansNextPos[idx];
        }
        return ans.toString();
    }

    static String readStr() { return scanner.nextLine(); }
    static int readInt() { return Integer.parseInt(scanner.nextLine()); }
    static String[] readStrList() { return scanner.nextLine().split(" "); }
    static int[] readIntList() { return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray(); }
    static String listToStr(char[] list, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.length; ++i) {
            if (i > 0) {
                sb.append(sep);
            }
            sb.append(list[i]);
        }
        return sb.toString();
    }

    static int[] makeList(int[] shape, int value) {
        int[] list = new int[shape[0]];
        if (shape.length == 1) {
            Arrays.fill(list, value);
            return list;
        }
        for (int i = 0; i < list.length; i++) {
            list[i] = value;
        }
        return list;
    }

    static int[][] makeList(int[] shape, int value) {
        int[][] list = new int[shape[0]][shape[1]];
        for (int[] subArray : list) {
            Arrays.fill(subArray, value);
        }
        return list;
    }
}
```

Please note the following differences between Java and Python helped guide the translation:
- Java requires strong typing (with types specified for all variables).
- Arrays in Java are not as flexible as in Python, so functions to create lists with a specific shape have been provided.
- I/O is handled differently in Java. In this translation, the `Scanner` class is used.
- The list-to-string functionality has been implemented differently because Java does not have list comprehensions or the `join` built-in method for arrays.
- String concatenation in Java within loops should be done using `StringBuilder` for performance reasons.
- Multidimensional arrays in Java need to be filled using nested loops or calls to `Arrays.fill` for one-dimensional arrays.
- Comments and unused code fragments from the Python source were omitted.

Keep in mind that subtle bugs can exist during such a translation, so this code should be thoroughly tested especially when it's an algorithmic problem.
