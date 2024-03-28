import java.util.Scanner;

public class p02016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.equals("ani") ? "square1001" : "e869120";
        System.out.println(output);
    }
}