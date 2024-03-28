import java.util.Scanner;

public class p03861 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        
        int result = b / x - (a - 1) / x;
        
        System.out.println(result);
        
        scanner.close();
    }
}