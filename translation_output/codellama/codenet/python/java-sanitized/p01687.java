import java.util.Scanner;

public class p01687 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ref = "AADINNUY";
        String aizu = "AIZUNYAN";
        String input = scanner.nextLine();
        if (input.length() < 8) {
            System.out.println(input);
        } else {
            String ans = "";
            int l = input.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8 && input.substring(i, i + 8).equals(ref)) {
                    ans += aizu;
                    i += 8;
                } else {
                    ans += input.charAt(i);
                    i += 1;
                }
            }
            System.out.println(ans);
        }
    }
}