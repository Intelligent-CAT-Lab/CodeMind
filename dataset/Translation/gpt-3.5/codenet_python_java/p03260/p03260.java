import java.util.Scanner;

public class p03260 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        String result = (a % 2 != 0 && b % 2 != 0) ? "Yes" : "No";
        System.out.println(result);
    }
}