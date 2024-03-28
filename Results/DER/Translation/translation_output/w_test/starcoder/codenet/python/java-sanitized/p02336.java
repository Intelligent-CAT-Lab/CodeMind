import java.util.*;
public class p02336 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(k>n) {
            System.out.println(0);
            return;
        }
        int ans = 1;
        for(int i=1;i<k;i++) {
            ans = (ans*(n-i))%1000000007;
            ans = (ans/i)%1000000007;
        }
        System.out.println(ans);
    }
}