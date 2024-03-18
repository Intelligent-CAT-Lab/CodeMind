import java.util.Scanner;
import java.lang.Math;

public class p03264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int result = (int)Math.ceil((double)k/2) * (k/2);
        System.out.println(result);
    }
}