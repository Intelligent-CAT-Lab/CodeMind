import java.util.Scanner;

public class p02766 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 0;

        while (n / (int) Math.pow(k, i) != 0) {
            i += 1;
        }

        System.out.println(i);
    }
}