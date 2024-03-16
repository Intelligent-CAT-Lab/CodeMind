import java.util.Scanner;

public class p02111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = input * 2;
        int quotient = result / 60;
        int remainder = result % 60;
        System.out.println(quotient + " " + remainder);
    }
}