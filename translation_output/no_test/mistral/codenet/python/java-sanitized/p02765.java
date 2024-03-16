import java.util.Scanner;

public class p02765 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n and r separated by space: ");
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int n = Integer.parseInt(split[0]);
        int r = Integer.parseInt(split[1]);

        if (n < 10) {
            System.out.println(r + (100 * (10 - n)));
        } else {
            System.out.println(r);
        }
    }
}