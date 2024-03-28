import java.util.Scanner;

public class p00363 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int w = Integer.parseInt(parts[0]);
        int h = Integer.parseInt(parts[1]);
        char c = parts[2].charAt(0);

        printLine(w);
        for (int i = 0; i < h - 2; i++) {
            if (i * 2 == h - 3) {
                printMiddleLine(w, c);
            } else {
                printEmptyLine(w);
            }
        }
        printLine(w);

        scanner.close();
    }

    private static void printLine(int w) {
        System.out.print("+");
        for (int i = 0; i < w - 2; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    private static void printEmptyLine(int w) {
        System.out.print("|");
        for (int i = 0; i < w - 2; i++) {
            System.out.print(".");
        }
        System.out.println("|");
    }

    private static void printMiddleLine(int w, char c) {
        System.out.print("|");
        int dots = (w - 3) / 2;
        for (int i = 0; i < dots; i++) {
            System.out.print(".");
        }
        System.out.print(c);
        for (int i = 0; i < dots; i++) {
            System.out.print(".");
        }
        System.out.println("|");
    }
}