import java.util.*;

public class p03086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int ans = 0;
        int length = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'A' || S.charAt(i) == 'C' || S.charAt(i) == 'G' || S.charAt(i) == 'T') {
                length++;
                ans = Math.max(ans, length);
            } else {
                length = 0;
            }
        }
        System.out.println(ans);
    }
}