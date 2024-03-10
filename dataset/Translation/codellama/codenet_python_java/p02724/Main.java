import java.util.Scanner;

public class p02724 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int num500 = total / 500;
        int remain = total - num500 * 500;
        int num5 = remain / 5;
        System.out.println(num500 * 1000 + num5 * 5);
    }
}