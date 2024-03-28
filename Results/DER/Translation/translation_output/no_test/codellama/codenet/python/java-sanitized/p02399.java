import java.util.Scanner;

public class p02399 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a / b + " " + a % b + " " + (float) a / b);
    }
}