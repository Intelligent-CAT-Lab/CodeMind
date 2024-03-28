import java.util.Scanner;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder myStr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '1') {
                myStr.append(c);
            } else if (i + 1 < s.length() && s.charAt(i+1) == 'B' && myStr.length() != 0) {
                myStr.deleteCharAt(myStr.length() - 1);
                i += 2; // Skip the space after 'B' as well
            }
        }

        System.out.println(Integer.parseInt(myStr.toString(), 2) - 128);
        scanner.close();
    }
}