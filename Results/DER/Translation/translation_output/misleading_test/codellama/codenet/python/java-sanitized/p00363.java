import java.util.Scanner;

public class p00363 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] dimensions = input.split(" ");
        int width = Integer.parseInt(dimensions[0]);
        int height = Integer.parseInt(dimensions[1]);
        char character = dimensions[2].charAt(0);

        System.out.print("+");
        for (int i = 0; i < width - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < height - 2; i++) {
            if (i * 2 == height - 3) {
                System.out.print("|");
                for (int j = 0; j < (width - 3) / 2; j++) {
                    System.out.print(".");
                }
                System.out.print(character);
                for (int j = 0; j < (width - 3) / 2; j++) {
                    System.out.print(".");
                }
                System.out.println("|");
            } else {
                System.out.println("|" + ".".repeat(width - 2) + "|");
            }
        }

        System.out.print("+");
        for (int i = 0; i < width - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}