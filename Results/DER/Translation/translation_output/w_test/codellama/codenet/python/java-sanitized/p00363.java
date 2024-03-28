import java.util.Scanner;

public class p00363 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        char c = sc.next().charAt(0);
        sc.close();

        System.out.println("+" + "-".repeat(w - 2) + "+");
        for (int i = 0; i < h - 2; i++) {
            if (i * 2 == h - 3) {
                System.out.println("|" + ".".repeat((w - 3) / 2) + c + ".".repeat((w - 3) / 2) + "|");
            } else {
                System.out.println("|" + ".".repeat(w - 2) + "|");
            }
        }
        System.out.println("+" + "-".repeat(w - 2) + "+");
    }
}