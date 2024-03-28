import java.util.Scanner;

public class p02124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);
        String output = "ai" + num * "3";
        System.out.println(output);
    }
}