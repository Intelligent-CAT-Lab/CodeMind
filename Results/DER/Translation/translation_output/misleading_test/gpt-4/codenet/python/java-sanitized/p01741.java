import java.util.Scanner;

public class p01741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        System.out.println((Math.floor(n) + 1) > n * Math.sqrt(2) ? Math.floor(n) + 1 : n * Math.sqrt(2));
    }
}