import java.util.Scanner;

public class p00363 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int w = Integer.parseInt(input[0]);
        int h = Integer.parseInt(input[1]);
        char c = input[2].charAt(0);

        System.out.print("+");
        for (int i = 0; i < w - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        for (int i = 0; i < h - 2; i++) {
            if (i * 2 == h - 3) {
                System.out.print("|");
                for (int j = 0; j < (w - 3) / 2; j++) {
                    System.out.print(".");
                }
                System.out.print(c);
                for (int j = 0; j < (w - 3) / 2; j++) {
                    System.out.print(".");
                }
                System.out.println("|");
            } else {
                System.out.print("|");
                for (int j = 0; j < w - 2; j++) {
                    System.out.print(".");
                }
                System.out.println("|");
            }
        }

        System.out.print("+");
        for (int i = 0; i < w - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}