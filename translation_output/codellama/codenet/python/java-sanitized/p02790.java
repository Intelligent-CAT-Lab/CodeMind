import java.util.Scanner;

public class p02790 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a <= b) {
            System.out.println(String.valueOf(a).repeat(b));
        } else {
            System.out.println(String.valueOf(b).repeat(a));
        }
    }
}