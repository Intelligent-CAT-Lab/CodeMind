import java.util.Scanner;

public class p03697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int sum = a + b;
        System.out.println(sum >= 10 ? "error" : sum);
        scanner.close();
    }
}