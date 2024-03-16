import java.util.Scanner;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String replaced = input.replace(",", "▁");
        System.out.println(replaced);
    }
}