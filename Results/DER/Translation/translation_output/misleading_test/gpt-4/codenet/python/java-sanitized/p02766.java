import java.util.Scanner;

public class p02766 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 0;

        while (n / Math.pow(k, i) >= 1) {
            i++;
        }

        System.out.println(i - 1);
    }
}