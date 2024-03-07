import java.util.Scanner;

public class p02862 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x0 = 1;
        int y0 = 0;
        int x1 = 0;
        int y1 = 1;
        while (b != 0) {
            int q = a / b;
            int r = a % b;
            x0 = x1 - q * x0;
            y0 = y1 - q * y0;
            a = b;
            b = r;
        }
        System.out.println(x0 + " " + y0);
    }
}