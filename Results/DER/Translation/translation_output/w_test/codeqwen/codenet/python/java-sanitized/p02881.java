import java.util.*;
import java.lang.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(ij(n));
    }

    public static int ij(int x) {
        for (int i = x; i > 0; i--) {
            if (n / i == n / (double) i) {
                return i + n / i;
            }
        }
        return 0;
    }
}