import java.util.*;

public class p00017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            while (!s.contains("the") &&!s.contains("that") &&!s.contains("this")) {
                s = decode(s);
            }
            System.out.println(s);
        }
    }

    public static String decode(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c!='' && c!= '.') {
                result.append((char) (c + 1));
            } else {
                result.append(c);
            }
        }
        return result.toString().replace("b", "a");
    }
}