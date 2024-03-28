import java.util.Scanner;

public class p00363 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int w = Integer.parseInt(inputs[0]);
        int h = Integer.parseInt(inputs[1]);
        String c = inputs[2];

        System.out.println("+" + "-".repeat(w - 2) + "+");
        for (int i = 0; i < h - 2; i++) {
            if (i * 2 == h - 3) {
                System.out.println("|" + ".".repeat((w - 3) / 2) + c + ".".repeat((w - 3) / 2) + "|");
            } else {
                System.out.println("|" + ".".repeat(w - 2) + "|");
            }
        }
        System.out.println("+" + "-".repeat(w - 2) + "+");
        scanner.close();
    }
}