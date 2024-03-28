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
                for (int j = c + 1; j <= 'z'; j++) {
                    if (!s.contains(String.valueOf((char) j))) {
                        System.out.println(s.substring(0, i) + (char) j);
                        return;
                    }
                }
            }
            System.out.println(-1);
        }
    }
}