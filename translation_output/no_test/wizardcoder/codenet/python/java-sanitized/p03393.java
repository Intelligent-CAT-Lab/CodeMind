import java.util.*;

public class p03393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char c = (char) ('a' + i);
                if (!s.contains(String.valueOf(c))) {
                    System.out.println(s + c);
                    return;
                }
            }
        } else {
            for (int i = s.length() - 1; i >= 0; i--) {
                char c = (char) ('a' + 25);
                while (c >= 'a' && s.indexOf(String.valueOf(c)) < i) {
                    c--;
                }
                if (c < 'a') {
                    System.out.println(-1);
                    return;
                }
                s = s.substring(0, i) + c + s.substring(i + 1);
                if (s.length() == 26) {
                    System.out.println(s);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}