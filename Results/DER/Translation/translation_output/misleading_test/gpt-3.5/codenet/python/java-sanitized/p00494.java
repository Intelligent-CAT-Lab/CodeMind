import java.util.Scanner;

public class p00494 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();
        int i = 0;
        int ans = 0;

        while (i < length) {
            int lenj = 0, leno = 0, leni = 0;

            while (i < length && input.charAt(i) == 'J') {
                lenj++;
                i++;
            }

            while (i < length && input.charAt(i) == 'O') {
                leno++;
                i++;
            }

            while (i < length && input.charAt(i) == 'I') {
                leni++;
                i++;
            }

            if (lenj >= leno && leni >= leno) {
                ans = Math.max(ans, leno);
            }
        }

        System.out.println(ans);
    }
}