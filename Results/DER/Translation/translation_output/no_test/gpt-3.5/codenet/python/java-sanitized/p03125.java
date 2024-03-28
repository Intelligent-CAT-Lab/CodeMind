import java.util.Scanner;

public class p03125 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        if (y % x == 0) {
            System.out.println(x + y);
        } else {
            System.out.println(y - x);
        }
    }
}