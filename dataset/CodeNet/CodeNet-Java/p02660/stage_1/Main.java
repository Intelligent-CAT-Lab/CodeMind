
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
var newVariable_0 = scan.next();        long n = Long.parseLong(newVariable_0);
        scan.close();

        if (n == 1) {
            System.out.println(0);
            return;
        }

        Map<Long, Integer> pMap = new HashMap<Long, Integer>();
var newVariable_1 = Math.sqrt(n);        for (long i = 2; i < newVariable_1; i++) {
            int count = 0;
            while (n % i == 0) {
                count++;
                n /= i;
            }
            if (count > 0) {
var newVariable_2 = pMap.put(i, count);            }
        }
        if (n != 1) {
var newVariable_3 = pMap.put(n, 1);        }

        int ans = 0;
var newVariable_4 = pMap.values();        for (int pCount : newVariable_4) {
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
