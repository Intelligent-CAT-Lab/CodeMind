import java.util.Scanner;
import java.lang.Math;

public class p02677 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Reading input from the user
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();
        
        // Calculating the angle of the hour hand
        double l = H * 360.0 / 12 + M * 30.0 / 60;
        // Calculating the angle of the minute hand
        double s = M * 360.0 / 60;
        // Finding the absolute difference between the two angles
        double ang = Math.abs(l - s);
        // Cosine law to calculate the distance between the two ends of the hands
        double c = Math.pow(A, 2) + Math.pow(B, 2) - 2 * B * A * Math.cos(Math.toRadians(ang));
        // Printing out the result
        System.out.println(Math.sqrt(c));
    }
}