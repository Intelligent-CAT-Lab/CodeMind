import java.util.Scanner;

public class p03860 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        String result = parts[0] + parts[1].charAt(0) + parts[2];
        System.out.println(result);
    }
}