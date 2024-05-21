import java.util.Scanner;

public class p03577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = input.substring(0, input.length() - 8);
        System.out.println(result);
    }
}