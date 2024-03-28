import java.util.Scanner;

public class p00017 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine().trim();
            for (int i = 0; i < 26; i++) {
                if (s.contains("the") || s.contains("that") || s.contains("this")) {
                    System.out.println(s);
                    break;
                }
                s = decode(s);
            }
        }
    }

    public static String decode(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ' && c != '.') {
                result.append((char) (c + 1));
            } else {
                result.append(c);
            }
        }
        return result.toString().replace((char) ('z' + 1), 'a');
    }
}