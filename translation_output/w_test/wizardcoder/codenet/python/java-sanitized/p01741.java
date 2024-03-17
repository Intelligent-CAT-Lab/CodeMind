import java.util.Scanner;

public class p01741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double result = n;
        if (n * Math.sqrt(2) < n) {
            result = n * Math.sqrt(2);
        }
        System.out.println(result);
    }
}