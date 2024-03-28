import java.util.Scanner;

public class p01872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        s = new StringBuilder(s).reverse().toString();
        Integer ans = check(s);
        if (ans != null) {
            System.out.println(ans);
        } else {
            System.out.println("MULTIPLE");
        }
    }

    private static boolean isCollect(String fixedNumber) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Integer.parseInt(String.valueOf(fixedNumber.charAt(i))) * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Integer.parseInt(String.valueOf(fixedNumber.charAt(i))) * (i - 5);
        }
        int last = 11 - score % 11;
        if (String.valueOf(fixedNumber.charAt(0)).equals(String.valueOf(last)) || (last >= 10 && fixedNumber.charAt(0) == '0')) {
            return true;
        }
        return false;
    }

    private static Integer check(String s) {
        int index = s.indexOf("?");
        int cnt = 0;
        Integer ret = null;
        for (int i = 0; i < 10; i++) {
            String c = String.valueOf(i);
            String fixedNumber = s.substring(0, index) + c + s.substring(index + 1);
            if (isCollect(fixedNumber)) {
                cnt++;
                ret = i;
            }
        }
        if (cnt == 1) {
            return ret;
        }
        return null;
    }
}