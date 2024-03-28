import java.util.*;
public class p02881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i * i <= n) {
            if (n % i == 0) {
                System.out.println(i);
                System.out.println(n / i);
            }
            i++;
        }
    }
}