import java.util.*;
public class p01356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int ans = m;
        for(int i=Math.min(n-1,40);i>=0;i--){
            int f = p*(a^i) + q*(b^i);
            if(m<f){
                ans = Math.min(ans, f-m);
            }else{
                m -= f;
            }
            ans = Math.min(ans,m);
        }
        System.out.println(ans);
    }
}