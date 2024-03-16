import java.util.Scanner;

public class p02747 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.equals("hi") || input.equals("hihi") || input.equals("hihihi") || input.equals("hihihihi") || input.equals("hihihihihi")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}