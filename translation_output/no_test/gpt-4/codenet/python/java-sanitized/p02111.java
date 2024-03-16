import java.util.Scanner;

public class p02111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int product = input * 2;
        int quotient = product / 60;
        int remainder = product % 60;

        System.out.println(quotient + " " + remainder);
    }
}