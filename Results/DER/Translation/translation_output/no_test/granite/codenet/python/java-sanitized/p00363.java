import java.util.Scanner;

public class p00363 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int width = Integer.parseInt(input[0]);
        int height = Integer.parseInt(input[1]);
        char center = input[2].charAt(0);

        System.out.println("+" + "-".repeat(width - 2) + "+");
        for (int i = 0; i < height - 2; i++) {
            if (i * 2 == height - 3) {
                System.out.println("|" + ".".repeat((width - 3) / 2) + center + "."
                       .repeat((width - 3) / 2) + "|");
            } else {
                System.out.println("|" + ".".repeat(width - 2) + "|");
            }
        }
        System.out.println("+" + "-".repeat(width - 2) + "+");
    }
}