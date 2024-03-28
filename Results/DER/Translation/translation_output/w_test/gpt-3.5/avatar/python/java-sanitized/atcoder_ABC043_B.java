import java.util.Scanner;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder myStr = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '0' || c == '1') {
                myStr.append(c);
            } else if (c == 'B' && myStr.length() != 0) {
                myStr.deleteCharAt(myStr.length() - 1);
            }
        }

        System.out.println(myStr.toString());
    }
}