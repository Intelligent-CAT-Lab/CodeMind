import java.util.Scanner;

public class p03501 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int result = Math.min(A * N, B);
        
        System.out.println(result);
        
        scanner.close();
    }
}