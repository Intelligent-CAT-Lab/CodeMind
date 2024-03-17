import java.util.Scanner;

public class p02546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.endsWith("s")) {
            System.out.println(input + "es");
        } else {
            System.out.println(input + "s");
        }
    }
}