import java.util.Scanner;

public class p03697 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int sum = Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
        if (sum >= 10) {
            System.out.println("error");
        } else {
            System.out.println(sum);
        }
    }
}