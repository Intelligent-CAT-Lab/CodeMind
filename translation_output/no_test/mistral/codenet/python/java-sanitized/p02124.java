import java.util.Scanner;

public class p02124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num = Integer.parseInt(input) / 100;
        String output = "ai1333" + "3" * num;
        System.out.println(output);
    }
}