import java.util.Scanner;

public class p03629 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(solve(input));
    }

    private static String solve(String input) {
        int[] ints = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            ints[i] = input.charAt(i) - 'a';
        }

        int[][] nextCharPos = new int[input.length() + 1][26];
        for (int i = input.length() - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (ints[i] == j) {
                    nextCharPos[i][j] = i;
                } else {
                    nextCharPos[i][j] = nextCharPos[i + 1][j];
                }
            }
        }

        int[] nonSubseqLen = new int[input.length() + 2];
        nonSubseqLen[input.length()] = 1;
        nonSubseqLen[input.length() + 1] = 0;
        int[] ansNextPos = new int[input.length() + 1];
        int[] ansLetter = new int[input.length() + 1];
        for (int i = input.length() - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                int newLen = nonSubseqLen[nextCharPos[i][j] + 1] + 1;
                if (nonSubseqLen[i] > newLen) {
                    nonSubseqLen[i] = newLen;
                    ansLetter[i] = j;
                    ansNextPos[i] = nextCharPos[i][j] + 1;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        int idx = 0;
        while (idx < input.length()) {
            ans.append((char) (ansLetter[idx] + 'a'));
            idx = ansNextPos[idx];
        }
        return ans.toString();
    }
}