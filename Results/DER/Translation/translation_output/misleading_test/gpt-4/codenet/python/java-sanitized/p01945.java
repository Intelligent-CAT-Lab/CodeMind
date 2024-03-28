import java.util.Scanner;

public class p01945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] S = input.toCharArray();

        int N = input.indexOf('*');
        int P = Math.abs(countChar(S, '(', 0, N) - countChar(S, ')', 0, N));
        int Q = Math.abs(countChar(S, '(', N + 1, S.length) - countChar(S, ')', N + 1, S.length));

        System.out.println(Math.min(P, Q));
    }

    // Helper method to count occurrences of a specific character within a range of an array
    private static int countChar(char[] array, char character, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (array[i] == character) {
                count++;
            }
        }
        return count;
    }
}