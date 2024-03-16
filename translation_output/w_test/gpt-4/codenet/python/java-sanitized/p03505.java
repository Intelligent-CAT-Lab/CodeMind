import java.util.Scanner;

public class p03505 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A <= B && K > A) {
            System.out.println(-1);
        } else if (A >= K) {
            System.out.println(1);
        } else {
            // Equivalent of doing ceil division in Java for positive numbers
            int steps = (K - A + A - B - 1) / (A - B);
            
            // Subtracting steps multiplied by 2 from 1, since in the original code, steps were subtracted from negative one
            System.out.println(1 + steps * 2);
        }

        sc.close();
    }
}