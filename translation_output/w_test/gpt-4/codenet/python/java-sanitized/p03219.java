import java.util.Scanner;

public class p03219 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ab = scanner.nextInt();
        int bc = scanner.nextInt();
        scanner.close();

        int fare = ab + (bc / 2);
        System.out.println(fare);
    }
}