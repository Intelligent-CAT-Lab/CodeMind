import java.util.Scanner;

public class p02016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "square1001";
        if (!input.equals("ani")) {
            output = "e869120";
        }
        System.out.println(output);
    }
}