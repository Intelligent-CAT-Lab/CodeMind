import java.util.*;

public class p01979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int ans = 0;
        for (int i = 0; i < (1 << 20); i++) {
            String s = Integer.toBinaryString(i);
            while (s.length() < 20) {
                s = "0" + s;
            }
            String s2 = "";
            int cnt = 0;
            for (int j = 0; j < 20; j++) {
                if (s.charAt(j) == '0') {
                    s2 += "9";
                } else if (s.charAt(j) == '1') {
                    s2 += "5";
                    s2 += "1";
                    s2 += "3";
                    cnt++;
                } else {
                    s2 += "?";
                }
            }
            if (cnt % 2 == 0) {
                if (Long.parseLong(s2.replaceAll("\\\\?", "9")) <= Long.parseLong(N)) {
                    ans++;
                }
            } else {
                if (Long.parseLong(s2.replaceAll("\\\\?", "9")) > Long.parseLong(N)) {
                    ans--;
                }
            }
        }
        System.out.println(ans);
    }
}