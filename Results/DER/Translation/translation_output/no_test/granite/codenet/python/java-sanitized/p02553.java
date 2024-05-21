import java.util.*;

public class p02553 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        long c = Long.parseLong(input[2]);
        long d = Long.parseLong(input[3]);
        long ans = -1000000000000000000L;
        ans = Math.max(ans, a * c);
        ans = Math.max(ans, a * d);
        ans = Math.max(ans, b * c);
        ans = Math.max(ans, b * d);
        System.out.println(ans);
    }
}