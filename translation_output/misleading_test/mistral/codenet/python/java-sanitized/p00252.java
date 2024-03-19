import java.util.Arrays;
import java.util.Scanner;

public class p00252 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String B = scanner.nextLine();
        String[] O = {"1 1 0", "0 0 1"};
        if (Arrays.asList(O).contains(B)) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}