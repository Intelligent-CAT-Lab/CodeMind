import java.util.Scanner;

public class p03264 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println((int) Math.ceil((double) k / 2) * (k / 2));
    }
}