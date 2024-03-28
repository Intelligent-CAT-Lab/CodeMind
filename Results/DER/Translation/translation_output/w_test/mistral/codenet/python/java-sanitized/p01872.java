import java.util.Scanner;

public class p01872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.substring(0, s.length() - 1);
        int ans = check(s);
        if (ans == -1) {
            System.out.println("MULTIPLE");
        } else {
            System.out.println(ans);
        }
    }

    public static int check(String s) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Integer.parseInt(s.charAt(i) + "") * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Integer.parseInt(s.charAt(i) + "") * (i - 5);
        }
        int last = 11 - score % 11;
        if (s.charAt(0) == last || (last >= 10 && s.charAt(0) == '0')) {
            return 1;
        } else {
            return -1;
        }
    }
}