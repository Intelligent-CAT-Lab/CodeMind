import java.util.*;
public class p01636 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int ans = 0;
        for (int i = 1; i < a.length(); i++) {
            String df = a.substring(0, i);
            String sm = a.substring(i);
            if (sm.charAt(0) == '0') continue;
            int df_int = Integer.parseInt(df);
            int sm_int = Integer.parseInt(sm);
            if ((df_int + sm_int) % 2 == 0 && sm_int >= df_int && (sm_int - df_int) % 2 == 0) {
                ans += 1;
            }
        }
        if (Integer.parseInt(a) % 2 == 0) ans += 1;
        System.out.println(ans);
    }
}