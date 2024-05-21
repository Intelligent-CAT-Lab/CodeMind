import java.util.Scanner;

public class p02903 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < h; i++) {
            if (i < b) {
                for (int j = 0; j < w; j++) {
                    if (j < a) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                }
            } else {
                for (int j = 0; j < w; j++) {
                    if (j < a) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
        }
    }
}