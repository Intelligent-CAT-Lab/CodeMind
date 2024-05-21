import java.util.*;
import java.io.*;

public class p02624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * (n / i) * (n / i + 1) / 2;
        }
        System.out.println(sum);
    }
}