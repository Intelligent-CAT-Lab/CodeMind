import java.util.Scanner;

public class p03797 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        int result = s + ((c-s*2)/4);
        if (s * 2 > c) {
            result = c/2;
        }

        System.out.println(result);
    }
}