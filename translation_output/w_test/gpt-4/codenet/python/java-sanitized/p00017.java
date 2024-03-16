import java.util.Scanner;

public class p00017 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Read input until there is no more input
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
        scanner.close();
    }

    private static String decode(String s) {
        StringBuilder result = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != ' ' && c != '.') {
                // Shift character by 1, wrapping around after 'z'
                if (c == 'z') {
                    result.append((char) ('a'));
                } else {
                    result.append((char) (c + 1));
                }
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}