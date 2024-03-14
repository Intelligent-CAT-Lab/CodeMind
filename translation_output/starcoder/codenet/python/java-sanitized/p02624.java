import java.util.*;
import java.io.*;

public class p02624 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int d = divCount(i);
            sum += d * i;
        }
        System.out.println(sum);
    }

    public static int divCount(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}