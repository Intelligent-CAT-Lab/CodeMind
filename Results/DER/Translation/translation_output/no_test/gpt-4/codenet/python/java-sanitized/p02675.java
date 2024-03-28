import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class p02675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() % 10;
        scanner.close();
        
        if (n == 3) {
            System.out.println("bon");
        } else if (new HashSet<>(Arrays.asList(2, 4, 5, 7, 9)).contains(n)) {
            System.out.println("hon");
        } else {
            System.out.println("pon");
        }
    }
}