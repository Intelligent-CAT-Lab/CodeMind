import java.util.Scanner;
public class p00017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        while (true) {
            s = scanner.nextLine();
            s = s.replaceAll("[^a-zA-Z ]", "");
            s = decode(s);
            if (s.contains("the") || s.contains("that") || s.contains("this")) {
                System.out.println(s);
                break;
            }
        }
    }
    public static String decode(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ' || c == '.') {
                result.append(c);
            } else {
                result.append((char) (ord(c) + 1));
            }
        }
        result.replace(result.charAt(result.length() - 1), (char) (ord("z") + 1), "a");
        return result.toString();
    }
}