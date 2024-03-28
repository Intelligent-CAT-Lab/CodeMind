import java.util.Scanner;

public class p03779 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        // Solving quadratic equation to find the minimum time
        int t = (int)(-1 + Math.sqrt(1 + 8 * (long)x)) / 2;

        if (t * (t + 1) / 2 >= x) {
            System.out.println(t);
        } else {
            System.out.println(t + 1);
        }

        scanner.close();
    }
}