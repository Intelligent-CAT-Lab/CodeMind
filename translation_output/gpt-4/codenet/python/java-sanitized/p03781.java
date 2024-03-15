import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        if (Math.sqrt(8 * x + 1) == Math.floor(Math.sqrt(8 * x + 1))) {
            double a = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) a);
        } else {
            x = (int) ((-1 + Math.sqrt(1 + 8 * x)) / 2);
            System.out.println(x + 1);
        }
        
        scanner.close();
    }
}