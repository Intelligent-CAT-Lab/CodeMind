import java.util.*;

public class p03150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String keyence = "keyence";
        int len = S.length();
        int keyenceLen = keyence.length();

        if (len < keyenceLen) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < keyenceLen; i++) {
            if (S.charAt(i)!= keyence.charAt(i)) {
                break;
            }
            if (i == keyenceLen - 1) {
                System.out.println("YES");
                return;
            }
        }

        for (int i = 1; i <= keyenceLen; i++) {
            if (S.charAt(len - i)!= keyence.charAt(keyenceLen - i)) {
                break;
            }
            if (i == keyenceLen) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}