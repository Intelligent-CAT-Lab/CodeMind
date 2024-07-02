import java.util.*;
 
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
System.out.println("[INST]6;X;sc.nextInt();"+X);
        int Y = sc.nextInt();
System.out.println("[INST]7;Y;sc.nextInt();"+Y);
        int ans = 0;
        if (X == 1 && Y == 1) {
            ans = 1000000;
        } else {
            if (X == 1) {
                ans += 300000;
            }
            if (Y == 1) {
                ans += 300000;
            }
            if (X == 2) {
                ans += 200000;
            }
            if (Y == 2) {
                ans += 200000;
            }
            if (X == 3) {
                ans += 100000;
            }
            if (Y == 3) {
                ans += 100000;
            }
        }
        System.out.println(ans);
    }
}
