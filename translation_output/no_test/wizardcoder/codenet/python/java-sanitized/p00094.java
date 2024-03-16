import java.util.Scanner;

public class p00094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        if (a <= 100 && b <= 100) {
            double result = (double) a * b / 3.305785;
            System.out.printf("%.4f", result);
        }
    }
}