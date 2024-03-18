import java.util.Scanner;

public class p02823 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        if ((A-B) % 2 == 0) {
            System.out.println((B-A) / 2);
        } else {
            System.out.println(Math.min(A-1, N-B) + 1 + (B-A) / 2);
        }
    }
}