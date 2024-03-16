import java.util.Scanner;
import java.lang.Math;

public class p02783 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        System.out.println((int)Math.ceil((double)H/A));
    }
}