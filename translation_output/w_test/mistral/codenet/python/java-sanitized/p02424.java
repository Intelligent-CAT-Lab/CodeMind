import java.util.Scanner;

public class p02424 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("{:032b}".format(a & b));
        System.out.println("{:032b}".format(a | b));
        System.out.println("{:032b}".format(a ^ b));
    }
}