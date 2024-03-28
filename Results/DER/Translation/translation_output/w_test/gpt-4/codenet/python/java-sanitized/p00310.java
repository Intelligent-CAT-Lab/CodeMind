import java.util.Scanner;

public class p00310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int p = scanner.nextInt();
        int m = scanner.nextInt();
        int c = scanner.nextInt();
        
        System.out.println(p + m + c);
        
        scanner.close();
    }
}