import java.util.Scanner;

public class p03813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a < 1200 ? "ABC" : "ARC");
        scanner.close();
    }
}