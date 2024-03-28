import java.util.Scanner;

public class p03591 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        System.out.println(S.startsWith("YAKI") ? "Yes" : "No");
        scanner.close();
    }
}