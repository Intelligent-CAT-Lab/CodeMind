import java.util.*;

public class p01979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < (1 << 20); i++) {
            String s = Integer.toBinaryString(i);
            s = String.format("%20s", s).replace(' ', '0');
            int sum = 0;
            int count = 0;
            for (int j = 0; j < 20; j++) {
                if (s.charAt(j) == '0') {
                    sum += 1;
                } else if (s.charAt(j) == '1') {
                    sum *= 10;
                    sum += 5;
                    sum *= 10;
                    sum += 1;
                    sum *= 10;
                    sum += 3;
                    count++;
                } else {
                    sum *= 10;
                    sum += 9;
                }
            }
            if (sum <= N) {
                if (count % 2 == 0) {
                    ans += 1;
                } else {
                    ans -= 1;
                }
            }
        }
        System.out.println(ans);
    }
}