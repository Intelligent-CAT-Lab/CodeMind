import java.util.Scanner;

public class p03109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split("/");
        int year = Integer.parseInt(split[0]);
        if (year <= 2018) {
            System.out.println("Heisei");
        } else if (year == 2019 && Integer.parseInt(split[1]) <= 4 && Integer.parseInt(split[2]) <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}