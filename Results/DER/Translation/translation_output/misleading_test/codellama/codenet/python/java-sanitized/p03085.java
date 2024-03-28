import java.util.Scanner;

public class p03085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("A")) {
            System.out.println("T");
        } else if (input.equals("C")) {
            System.out.println("G");
        } else if (input.equals("G")) {
            System.out.println("C");
        } else {
            System.out.println("A");
        }
    }
}