import java.util.Scanner;

public class p00312 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int L = scanner.nextInt();
        
        int ans = (int)(D/L) + (D - L * (int)(D/L));
        System.out.println(ans);
    }
}