import java.util.Scanner;

public class p03623 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (Math.abs(x - a) < Math.abs(x - b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}