import java.util.Scanner;

public class p03469 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "2018" + input.substring(4);
        System.out.println(output);
    }
}