import java.util.*;

public class p03393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() < 26) {
            for (char c = 'a'; c <= 'z'; c++) {
                if (!s.contains(String.valueOf(c))) {
                    System.out.println(s + c);
                    return;
                }
            }
        } else {
            for (int i = s.length() - 1; i >= 0; i--) {
                char c = s.charAt(i);
                for (char d = (char) (c + 1); d <= 'z'; d++) {
                    if (!s.substring(0, i).contains(String.valueOf(d))) {
                        System.out.println(s.substring(0, i) + d);
                        return;
                    }
                }
            }
            System.out.println(-1);
        }
    }
}