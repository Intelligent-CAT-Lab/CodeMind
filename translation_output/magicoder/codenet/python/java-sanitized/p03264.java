import java.util.Scanner;
import java.lang.Math;

public class p03264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println((int)Math.ceil(k/2.0) * (k/2));
    }
}