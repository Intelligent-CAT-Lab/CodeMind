import java.util.Scanner;

public class p00353 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, f, b;
        m = sc.nextInt();
        f = sc.nextInt();
        b = sc.nextInt();
        if (m + f < b) {
            System.out.println("NA");
        } else if (m >= b) {
            System.out.println("0");
        } else {
            System.out.println(b - m);
        }
    }
}