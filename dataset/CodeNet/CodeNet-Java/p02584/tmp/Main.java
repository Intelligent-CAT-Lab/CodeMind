
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long x = Long.parseLong(scan.next());
System.out.println("[INST]7;x;Long.parseLong(scan.next());"+x);
System.out.println("[INST]7;None;scan.next();"+scan.next());
        long k = Long.parseLong(scan.next());
System.out.println("[INST]8;k;Long.parseLong(scan.next());"+k);
System.out.println("[INST]8;None;scan.next();"+scan.next());
        long d = Long.parseLong(scan.next());
System.out.println("[INST]9;d;Long.parseLong(scan.next());"+d);
System.out.println("[INST]9;None;scan.next();"+scan.next());
        scan.close();

        long ans = 0;
        long absX = Math.abs(x);
System.out.println("[INST]13;absX;Math.abs(x);"+absX);
        if (absX / d >= k) {
            ans = absX - k * d;
        } else {
            long sho = absX / d;
            long amari = absX % d;
            if ((k - sho) % 2 == 0) {
                ans = amari;
            } else {
                ans = d - amari;
            }
        }

        System.out.println(ans);
    }
}
