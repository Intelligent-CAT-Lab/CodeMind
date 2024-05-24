import java.util.Scanner;

public class codeforces_32_B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                str += 0;
            } else {
                if (s.charAt(i) == '-' && s.charAt(i + 1) == '.') {
                    str += 1;
                } else {
                    str += 2;
                    i++;
                }
            }
        }

        System.out.println(str);
    }
}