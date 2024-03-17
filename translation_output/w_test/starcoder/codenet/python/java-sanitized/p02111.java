import java.util.*;
public class p02111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int t = h*3600 + m*60 + s;
        int h1 = t/3600;
        int m1 = (t%3600)/60;
        int s1 = t%60;
        System.out.println(h1+" "+m1+" "+s1);
    }
}