import java.util.Scanner;

public class p02880 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (i * j == N) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        
        System.out.println("No");
    }
}