import java.util.*;

public class p01872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int ans = check(new StringBuilder(s).reverse().toString());
        System.out.println(ans != -1 ? ans : "MULTIPLE");
    }

    public static int check(String s) {
        int index = s.indexOf("?");
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            String c = String.valueOf(i);
            String fixedNumber = s.substring(0, index) + c + s.substring(index + 1);
            if (isCollect(fixedNumber)) {
                cnt++;
                ret = i;
            }
        }
        return cnt == 1 ? ret : -1;
    }

    public static boolean isCollect(String fixedNumber) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Integer.parseInt(String.valueOf(fixedNumber.charAt(i))) * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Integer.parseInt(String.valueOf(fixedNumber.charAt(i))) * (i - 5);
        }
        int last = 11 - score % 11;
        return String.valueOf(last).equals(String.valueOf(fixedNumber.charAt(0))) || (last >= 10 && fixedNumber.charAt(0) == '0');
    }
}