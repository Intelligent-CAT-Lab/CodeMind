import java.util.Scanner;

public class p02475 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(round(a, b));
        scanner.close();
    }
    
    public static int round(int a, int b) {
        if (a * b < 0) {
            return -Math.floorDiv(-a, b);
        } else {
            return Math.floorDiv(a, b);
        }
    }
}