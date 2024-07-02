import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, t;
        n = sc.nextInt();
System.out.println("[INST]6;n;sc.nextInt();"+n);
        x = sc.nextInt();
System.out.println("[INST]7;x;sc.nextInt();"+x);
        t = sc.nextInt();
System.out.println("[INST]8;t;sc.nextInt();"+t);
        long ans = 0, tako = 0;
        while (n > tako) {
            ans += t;
            tako += x;
        }
        System.out.println(ans);
        sc.close();
    }
}