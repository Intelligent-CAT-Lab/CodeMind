import java.util.Scanner;

public class p03742 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        String result = Math.abs(a - b) > 1 ? "Alice" : "Brown";
        System.out.println(result);
    }
}