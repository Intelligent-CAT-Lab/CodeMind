import java.util.*;

public class p02475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        if (a * b < 0) {
            result = -(-a / b);
        } else {
            result = a / b;
        }

        System.out.println(result);
    }
}