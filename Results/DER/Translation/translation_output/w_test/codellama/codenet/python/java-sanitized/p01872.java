import java.util.Scanner;

public class p01872 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String reversedInput = new StringBuilder(input).reverse().toString();
        int index = reversedInput.indexOf("?");
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            String fixedNumber = reversedInput.substring(0, index) + i + reversedInput.substring(index + 1);
            if (isCollect(fixedNumber)) {
                cnt++;
                int ret = i;
            }
        }
        if (cnt == 1) {
            System.out.println(ret);
        } else {
            System.out.println("MULTIPLE");
        }
    }

    public static boolean isCollect(String fixedNumber) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Integer.parseInt(fixedNumber.charAt(i)) * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Integer.parseInt(fixedNumber.charAt(i)) * (i - 5);
        }
        int last = 11 - score % 11;
        if (String.valueOf(last).equals(fixedNumber.charAt(0)) || (last >= 10 && fixedNumber.charAt(0) == '0')) {
            return true;
        } else {
            return false;
        }
    }
}