import java.util.Scanner;

public class p00252 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] options = {"1 1 0", "0 0 1"};

        boolean found = false;
        for (String option : options) {
            if (input.equals(option)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}