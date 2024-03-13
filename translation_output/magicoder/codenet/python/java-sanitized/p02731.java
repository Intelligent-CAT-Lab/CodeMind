import java.util.Scanner;

public class p02731 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int hen = L / 3;
        System.out.println(Math.pow(hen, 3));
    }
}