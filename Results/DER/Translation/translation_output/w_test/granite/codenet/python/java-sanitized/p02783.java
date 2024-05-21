import java.util.Scanner;

public class p02783 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        int result = (int) Math.ceil((double) H / A);
        System.out.println(result);
    }
}