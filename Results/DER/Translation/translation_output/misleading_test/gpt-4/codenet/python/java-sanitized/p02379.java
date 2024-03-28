import java.util.Scanner;
import java.lang.Math;

public class p02379 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        
        System.out.printf("%.6f\n", distance);
        
        scanner.close();
    }
}