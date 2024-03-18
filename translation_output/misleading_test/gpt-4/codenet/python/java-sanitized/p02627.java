import java.util.Scanner;

public class p02627 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        if (Character.isUpperCase(n.charAt(0))) {
            System.out.println("A");
        } else if (Character.isLowerCase(n.charAt(0))) {
            System.out.println("a");
        }
    }
}