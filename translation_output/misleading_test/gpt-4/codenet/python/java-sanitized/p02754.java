import java.util.Scanner;

public class p02754 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input values
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        // Calculate the value of k and p as per the python script
        int k = n / (a + b);
        int p = n % (a + b);
        
        // Calculate and print the result
        System.out.println(k * a + Math.min(p, a));
        
        scanner.close();
    }
}