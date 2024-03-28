import java.util.Scanner;

public class p02627 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        if (n.matches("[A-Z]")) {
            System.out.println("A");
        } else if (n.matches("[a-z]")) {
            System.out.println("a");
        }
    }
}