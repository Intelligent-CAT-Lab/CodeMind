import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double L = sc.nextDouble();
        double ans = Math.pow(L/3.0,3);
        System.out.println(String.format("%.12f",ans));

    }
}
