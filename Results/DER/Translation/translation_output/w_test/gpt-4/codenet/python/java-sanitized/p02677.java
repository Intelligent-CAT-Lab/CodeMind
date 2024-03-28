import java.util.Scanner;
import java.lang.Math;

public class p02677 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // Length of hour hand
        int B = scanner.nextInt(); // Length of minute hand
        int H = scanner.nextInt(); // Hour
        int M = scanner.nextInt(); // Minute
        scanner.close();
        
        double longHandPosition = H * 360 / 12 + (M * 360 / 12) / 60;
        double shortHandPosition = M * 360 / 60;
        double angle = Math.abs(longHandPosition - shortHandPosition);
        
        double c = Math.pow(A, 2) + Math.pow(B, 2)
                    - 2 * A * B * Math.cos(Math.toRadians(angle));
        
        System.out.printf("%.20f%n", Math.sqrt(c));
    }
}