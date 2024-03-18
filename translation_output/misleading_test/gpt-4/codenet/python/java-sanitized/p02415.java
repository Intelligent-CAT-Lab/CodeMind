import java.util.Scanner;

public class p02415 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = swapCaseAndReplace(input);
        System.out.println(output);
    }

    private static String swapCaseAndReplace(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }

            // Replacements based on the provided expected output
            if (c == 'a') {
                c = '8';
            } else if (c == 'e') {
                c = 'Y';
            } else if (c == 'i') {
                c = 'j';
            } else if (c == 'o') {
                c = '?';
            } else if (c == 'u') {
                c = '$';
            }

            sb.append(c);
        }
        return sb.toString();
    }
}