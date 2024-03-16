import java.io.*;
import java.util.*;

public class p04048 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int result = (N - gcd(N, X)) * 3;
        System.out.println(result);
    }
    
    public static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}