import java.util.Scanner;
import java.lang.Math;

public class p03781 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        
        if (Math.sqrt(8 * x + 1) == Math.floor(Math.sqrt(8 * x + 1))) {
            double a = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int)a);
        } else {
            double xFloor = Math.floor((-1 + Math.sqrt(1 + 8 * x)) / 2);
            System.out.println((int)xFloor + 1);
        }
    }
}