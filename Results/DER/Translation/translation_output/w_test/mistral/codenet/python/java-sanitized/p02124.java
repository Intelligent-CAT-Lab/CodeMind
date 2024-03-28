import java.util.Scanner;

public class p02124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "ai1333" + "3" * (int.parseInt(input) / 100);
        System.out.println(output);
    }
}