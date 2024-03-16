import java.util.Scanner;

public class p00017 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String s = line.trim();
            for (int i = 0; i <= 'z' - 'a'; i++) {
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
        for (char c : s.toCharArray()) {
            if (c != ' ' && c != '.') {
                result.append((char) (c + 1));
            } else {
                result.append(c);
            }
        }
        return result.toString().replace((char) ('z' + 1), 'a');
    }
}