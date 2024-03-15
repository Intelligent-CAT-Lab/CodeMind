import java.util.Scanner;

public class p02472 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        System.out.println(A + B);
        scanner.close();
    }
}