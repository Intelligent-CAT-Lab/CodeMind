import java.util.Scanner;

public class p00017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().strip();
            for (int i = 0; i < 26; i++) { // 'z' - 'a' + 1 = 26
                if (s.contains("the") || s.contains("that") || s.contains("this")) {
                    System.out.println(s);
                    break;
                }
                s = decode(s);
            }
        }

        scanner.close();
    }

    private static String decode(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!(c == ' ' || c == '.')) {
                char shiftedChar = (char)(c + 1);
                if (shiftedChar > 'z') {
                    shiftedChar = 'a';
                }
                result.append(shiftedChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}