import java.util.Scanner;

public class p03206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        scanner.close();

        String[] days = {"", "Christmas", "Christmas Eve", "Christmas Eve Eve", "Christmas Eve Eve Eve"};
        String result = days[D];

        System.out.println(result);
    }
}