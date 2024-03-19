import java.util.Scanner;

public class atcoder_ABC043_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder myStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '0' || c == '1') {
                myStr.append(c);
            } else if (c == 'B' && myStr.length() != 0) {
                myStr.setLength(myStr.length() - 1);
            }
        }
        System.out.println(myStr);
    }
}