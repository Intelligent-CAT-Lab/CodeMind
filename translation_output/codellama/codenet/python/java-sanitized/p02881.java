import java.util.Scanner;

public class p02881 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int i = (int) Math.sqrt(n);
        int j = n / i;

        System.out.println(i + " " + j);
    }
}