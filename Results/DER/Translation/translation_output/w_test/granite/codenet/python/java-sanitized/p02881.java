import java.util.*;

public class p02881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = (int)Math.sqrt(n); i > 0; i--) {
            if (n % i == 0) {
                sum += i + n/i;
            }
        }
        System.out.println(sum - 2);
    }
}