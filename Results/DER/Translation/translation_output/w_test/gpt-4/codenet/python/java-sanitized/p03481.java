import java.util.Scanner;

public class p03481 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        scanner.close();

        int k = (int)(Math.log(Y / X) / Math.log(2)) + 1;
        System.out.println(k);
    }
}