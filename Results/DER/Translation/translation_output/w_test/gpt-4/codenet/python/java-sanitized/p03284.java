import java.util.Scanner;

public class p03284 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading the input similar to the Python code
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        if (n % k == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }

        scanner.close();
    }
}