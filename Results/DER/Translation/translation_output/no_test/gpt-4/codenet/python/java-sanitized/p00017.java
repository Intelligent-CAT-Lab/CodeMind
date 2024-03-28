import java.util.Scanner;

public class p00017 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().trim();
            for (int i = 0; i < 'z' - 'a' + 1; i++) {
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
            if (c != ' ' && c != '.') {
                char shifted = (char) (c + 1);
                if (shifted == ('z' + 1)) {
                    shifted = 'a';
                }
                result.append(shifted);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}