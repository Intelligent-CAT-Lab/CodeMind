import java.util.*;
public class p02663 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h1 = in.nextInt();
        int m1 = in.nextInt();
        int h2 = in.nextInt();
        int m2 = in.nextInt();
        int k = in.nextInt();
        int t1 = 60*h1 + m1;
        int t2 = 60*h2 + m2;
        System.out.println(t2-t1-k);
    }
}