import java.util.*;
public class p02719 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rot = n/k;
        int x = n;
        if(k == 1 || n == k || n%k == 0)
            x = 0;
        else if(rot >= 1)
            x = n - k*rot;
        int t = x%k;
        System.out.println(Math.min(t, Math.abs(t-k)));
    }
}