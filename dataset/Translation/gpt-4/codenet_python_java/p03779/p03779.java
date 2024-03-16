import java.util.Scanner;

public class p03779 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input value for x
        int x = sc.nextInt();
        
        // Solve the quadratic equation
        int t = (int)(-1 + Math.sqrt(1 + 8 * (long)x)) / 2;
        
        // Check and print the result based on the condition
        if (t * (t+1) / 2 >= x) {
            System.out.println(t);
        } else {
            System.out.println(t+1);
        }
        
        sc.close();
    }
}