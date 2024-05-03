import java.util.*;

public class p02331 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println((int) Math.pow(k, n) % 1000000007);
    }
}