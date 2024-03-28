import java.util.Scanner;

public class p02111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int quotient = input * 2 / 60;
        int remainder = input * 2 % 60;
        System.out.println(quotient + " " + remainder);
    }
}