import java.util.*;
import java.io.*;

public class p03549 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int total = 1900 * m + 100 * (n - m);
        System.out.println(total * (int) Math.pow(2, m));
    }
}