import java.util.Scanner;

public class p00331 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int H = scanner.nextInt();
        int R = scanner.nextInt();
        
        if (H >= 0) {
            System.out.println(1);
        } else {
            if (H + R > 0) {
                System.out.println(1);
            } else if (H + R == 0) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
        
        scanner.close();
    }
}