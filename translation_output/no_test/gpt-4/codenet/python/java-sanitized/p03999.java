import java.util.Scanner;

public class p03999 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        long ans = 0;
        int maxCombinations = 1 << (s.length() - 1); // same as 2 ** (len(s) - 1)
        for (int i = 0; i < maxCombinations; i++) {
            StringBuilder pat = new StringBuilder();
            pat.append(s.charAt(0));

            for (int j = 0; j < s.length() - 1; j++) {
                if (((i >> j) & 1) == 1) {
                    pat.append("+");
                }
                pat.append(s.charAt(j + 1));
            }

            ans += evaluate(pat.toString());
        }

        System.out.println(ans);
        scanner.close();
    }

    private static long evaluate(String expression) {
        // This is a simple method to evaluate the expression
        // Assumes that the expression only contains positive digits and '+' signs
        long result = 0;
        String[] numbers = expression.split("\\+");
        for (String number : numbers) {
            result += Long.parseLong(number);
        }
        return result;
    }
}