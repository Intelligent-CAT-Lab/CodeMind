import java.util.Scanner;

public class p00252 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String B = scanner.nextLine();

        String[] O = {"1 1 0", "0 0 1"};

        boolean isOpen = false;
        for (String s : O) {
            if (s.equals(B)) {
                isOpen = true;
                break;
            }
        }

        if (isOpen) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}