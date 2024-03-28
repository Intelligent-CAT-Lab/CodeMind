import java.util.Scanner;

public class atcoder_ABC125_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int T = scanner.nextInt();
        
        int ans = (T / A) * B;
        
        System.out.println(ans);
        
        scanner.close();
    }
}