import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p00252 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<String> options = Arrays.asList("1 1 0", "0 0 1");

        if (options.contains(input)) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}