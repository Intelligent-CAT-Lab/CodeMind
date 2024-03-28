import java.util.Scanner;

public class p03797 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int c = scanner.nextInt();

        int result = (s * 2 <= c) ? (s + ((c - s * 2) / 4)) : (c / 2);
        System.out.println(result);
    }
}