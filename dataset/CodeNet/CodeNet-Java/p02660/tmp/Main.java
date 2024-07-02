
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = Long.parseLong(scan.next());
System.out.println("[INST]9;n;Long.parseLong(scan.next());"+n);
System.out.println("[INST]9;None;scan.next();"+scan.next());
        scan.close();

        if (n == 1) {
            System.out.println(0);
            return;
        }

        Map<Long, Integer> pMap = new HashMap<Long, Integer>();
        for (long i = 2; i < Math.sqrt(n); i++) {
System.out.println("[INST]18;None;Math.sqrt(n);"+Math.sqrt(n));
            int count = 0;
            while (n % i == 0) {
                count++;
                n /= i;
            }
            if (count > 0) {
                pMap.put(i, count);
System.out.println("[INST]25;None;pMap.put(i, count);"+pMap.put(i, count));
            }
        }
        if (n != 1) {
            pMap.put(n, 1);
System.out.println("[INST]29;None;pMap.put(n, 1);"+pMap.put(n, 1));
        }

        int ans = 0;
        for (int pCount : pMap.values()) {
System.out.println("[INST]33;None;pMap.values();"+pMap.values());
            int i = 1;
            while (pCount >= i) {
                pCount -= i;
                ans++;
                i++;
            }
        }

        System.out.println(ans);
    }

}
