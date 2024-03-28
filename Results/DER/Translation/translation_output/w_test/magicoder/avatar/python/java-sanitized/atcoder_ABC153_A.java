import java.util.Scanner;
import java.lang.Math;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        System.out.println((int) Math.ceil((double) h / a));
    }
}