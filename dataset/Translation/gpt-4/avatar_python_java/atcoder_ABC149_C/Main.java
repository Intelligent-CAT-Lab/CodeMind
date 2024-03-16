import java.util.Scanner;

public class atcoder_ABC149_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        while (true) {
            if (hoge(N)) {
                System.out.println(N);
                System.exit(0);
            }
            N++;
        }
    }
    
    public static boolean hoge(int n) {
        if (n == 2) {
            return true;
        }
        for (int x = 2; x <= (int) Math.sqrt(n) + 1; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }
}