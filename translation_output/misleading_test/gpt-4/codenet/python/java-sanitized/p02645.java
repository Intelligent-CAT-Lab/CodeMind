import java.util.Scanner;

public class p02645 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.length() >= 3 ? input.substring(0, 3) : input;
        System.out.println(output);
        scanner.close();
    }
}