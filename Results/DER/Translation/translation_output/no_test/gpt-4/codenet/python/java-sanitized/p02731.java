import java.util.Scanner;

public class p02731 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        double hen = L / 3.0;
        System.out.println(Math.pow(hen, 3));
        scanner.close();
    }
}