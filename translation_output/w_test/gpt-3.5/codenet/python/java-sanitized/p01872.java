import java.util.Scanner;

public class p01872 {

    public static boolean isCollect (String fixedNumber) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Character.getNumericValue(fixedNumber.charAt(i)) * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Character.getNumericValue(fixedNumber.charAt(i)) * (i - 5);
        }
        int last = 11 - score % 11;
        if (String.valueOf(last).equals(String.valueOf(fixedNumber.charAt(0))) || (last >= 10 && fixedNumber.charAt(0) == '0')) {
            return true;
        } else {
            return false;
        }
    }

    public static Integer check(String s) {
        int index = s.indexOf("?");
        int cnt = 0;
        Integer ret = null;
        for (int i = 0; i < 10; i++) {
            String c = String.valueOf(i);
            StringBuilder builder = new StringBuilder(s);
            builder.setCharAt(index, c.charAt(0));
            String fixedNumber = builder.toString();
            if (isCollect(fixedNumber)) {
                cnt++;
                ret = i;
            }
        }
        if (cnt == 1) {
            return ret;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String reversedInput = new StringBuilder(input).reverse().toString();
        Integer ans = check(reversedInput);
        System.out.println(ans != null ? ans : "MULTIPLE");
    }
}