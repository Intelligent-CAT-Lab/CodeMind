import java.util.Scanner;

public class p00017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim();
            for (int i = 0; i < 26; i++) {
                String decoded = decode(s, i);
                if (decoded.contains("the") || decoded.contains("that") || decoded.contains("this")) {
                    System.out.println(decoded);
                    break;
                }
            }
        }
    }

    public static String decode(String s, int shift) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c!='' && c!= '.') {
                result.append((char) (c - shift));
            } else {
                result.append(c);
            }
        }
        return result.toString().replace("" + (char) (shift + 'a'), "a");
    }
}