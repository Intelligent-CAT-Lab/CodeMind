import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k = input.nextInt();
        long n = input.nextInt();
        int w = input.nextInt();
        long sum = 0;

        for (int i = 1; i <= w; i++) {
            sum += (long)k * i;
        }
        
        if (sum <= n) {
            System.out.println(0);
        } else {
            System.out.println(sum - n);
        }
        
        input.close();
    }
}