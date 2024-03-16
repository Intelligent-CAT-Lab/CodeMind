import java.util.Scanner;

public class p03109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("/");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        if (year < 2019 || (year == 2019 && month == 4 && day <= 30)) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}