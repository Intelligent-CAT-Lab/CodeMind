import java.util.*;
public class p01872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int index = s.indexOf("?");
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            String c = String.valueOf(i);
            String fixed_number = s.substring(0, index) + c + s.substring(index + 1);
            if (isCollect(fixed_number)) {
                cnt++;
                ret = i;
            }
        }
        if (cnt == 1)
            System.out.println(ret);
        else
            System.out.println("MULTIPLE");
    }

    public static boolean isCollect(String fixed_number) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Integer.parseInt(fixed_number.charAt(i) + "");
            score *= i + 1;
        }
        for (int i = 7; i < 12; i++) {
            score += Integer.parseInt(fixed_number.charAt(i) + "");
            score *= i - 5;
        }
        int last = 11 - score % 11;
        if (last == 10)
            last = 0;
        if (last == Integer.parseInt(fixed_number.charAt(0) + ""))
            return true;
        else
            return false;
    }
}