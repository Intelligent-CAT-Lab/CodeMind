import java.util.*;
public class p02997 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if(k > ((n-1)*(n-2))//2) {
            System.out.println(-1);
            return;
        }
        System.out.println(n-1+((n-1)*(n-2))//2-k);
        for(int i=2;i<=n;i++) {
            System.out.println(1+" "+i);
        }
        int a = 0;
        for(int i=2;i<n;i++) {
            for(int j=i+1;j<=n;j++) {
                if(a < ((n-1)*(n-2))//2-k) {
                    System.out.println(i+" "+j);
                    a++;
                }
            }
        }
    }
}