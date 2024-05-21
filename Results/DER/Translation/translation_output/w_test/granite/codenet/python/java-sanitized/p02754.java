import java.util.*;

public class p02754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = n/(a+b);
        int p = n%(a+b);
        int result = k*a + Math.min(p,a);
        System.out.println(result);
    }
}