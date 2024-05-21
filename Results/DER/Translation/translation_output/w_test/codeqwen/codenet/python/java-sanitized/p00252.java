import java.util.Scanner;

public class p00252 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String B = scanner.nextLine();
        String[] O = {"1 1 0", "0 0 1"};

        for (String s : O) {
            if (B.equals(s)) {
                System.out.println("Open");
                return;
            }
        }
        System.out.println("Close");
    }
}