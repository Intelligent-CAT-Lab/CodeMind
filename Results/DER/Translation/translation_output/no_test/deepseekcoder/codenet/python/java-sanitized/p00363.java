import java.util.Scanner;

public class p00363 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int w = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);
        char c = input[2].charAt(0);

        System.out.print("+" + "-".repeat(w - 2) + "+\n");
        for (int i = 0; i < h - 2; i++) {
            if (i * 2 == h - 3) {
                System.out.print("|" + ".".repeat((w - 3) / 2) + c + ".".repeat((w - 3) / 2) + "|\n");
            } else {
                System.out.print("|" + ".".repeat(w - 2) + "|\n");
            }
        }
        System.out.print("+" + "-".repeat(w - 2) + "+\n");
    }
}