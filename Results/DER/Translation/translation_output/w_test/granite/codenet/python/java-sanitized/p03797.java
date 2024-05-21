import java.util.Scanner;

public class p03797 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int c = scanner.nextInt();
        int result;

        if (s * 2 <= c) {
            result = s + ((c - s * 2) / 4);
        } else {
            result = c / 2;
        }

        System.out.println(result);
    }
}