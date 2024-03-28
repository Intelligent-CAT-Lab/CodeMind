import java.util.Scanner;
public class p00017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        while (true) {
            s = scanner.nextLine();
            s = s.replaceAll("[^a-zA-Z0-9\\s]", "");
            s = decode(s);
            if (s.contains("the") || s.contains("that") || s.contains("this")) {
                System.out.println(s);
                break;
            }
        }
    }
    public static String decode(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ' || c == '.') {
                sb.append(c);
            } else {
                sb.append((char) (ord(c) + 1));
            }
        }
        return sb.toString().replace('z', 'a');
    }
}