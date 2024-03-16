import java.util.Scanner;

public class p02621 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a + (int)Math.pow(a, 2) + (int)Math.pow(a, 3));
    }
}