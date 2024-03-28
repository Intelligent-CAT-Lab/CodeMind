import java.util.*;
public class p03892 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int h = Math.abs(b-d);
        int w = Math.abs(c-a);
        if(h==0 || w==0) return 0;
        int m = Math.max(h,w);
        int n = Math.min(h,w);
        while(m%n!=0) {
            int temp = m;
            m = n;
            n = temp%n;
        }
        return h+w-m;
    }
}