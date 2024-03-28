import java.util.Scanner;

public class p02859 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int r = scanner.nextInt();
        int area = r * r;

        System.out.println(area);

        scanner.close();
    }
}