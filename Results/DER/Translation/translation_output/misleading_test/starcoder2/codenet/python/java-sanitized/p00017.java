import java.util.Scanner;

public class p00017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < 26; i++) {
            if (s.contains("the") || s.contains("that") || s.contains("this")) {
                System.out.println(s);
                break;
            }
            s = decode(s);
        }
    }

    public static String decode(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                result += c;
            } else if (c == '.') {
                result += c;
            } else {
                result += (char) (c + 1);
            }
        }
        return result.replace((char) (123), 'a');
    }
}