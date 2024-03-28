import java.util.Scanner;

public class p01636 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int ans = 0;
        for (int i = 1; i < a.length(); i++) {
            String dfStr = a.substring(0, i);
            String smStr = a.substring(i);
            if (smStr.charAt(0) == '0') continue;
            int df = Integer.parseInt(dfStr);
            int sm = Integer.parseInt(smStr);
            if ((df + sm) % 2 == 0 && sm >= df && (sm - df) % 2 == 0) {
                ans++;
            }
        }
        
        if (Integer.parseInt(a) % 2 == 0) ans++;
        System.out.println(ans);
        
        scanner.close();
    }
}