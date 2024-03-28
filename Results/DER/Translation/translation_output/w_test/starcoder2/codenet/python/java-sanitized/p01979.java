import java.util.*;

public class p01979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int ans = 0;
        for (int i = 0; i < 20; i++) {
            if (N.charAt(i) != '?') {
                continue;
            }
            for (int j = 0; j < 10; j++) {
                String S = N.substring(0, i) + j + N.substring(i + 1);
                if (Integer.parseInt(S.replace("?", "9")) > Integer.parseInt(N)) {
                    break;
                } else {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}