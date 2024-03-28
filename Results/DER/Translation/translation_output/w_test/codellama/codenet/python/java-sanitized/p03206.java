import java.util.Scanner;

public class p03206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        String[] days = {"Christmas", "Christmas Eve", "Christmas Eve Eve", "Christmas Eve Eve Eve"};
        System.out.println(days[D - 25]);
    }
}