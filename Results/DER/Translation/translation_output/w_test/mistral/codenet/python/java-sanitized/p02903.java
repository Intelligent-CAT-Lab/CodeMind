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
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < a; j++) {
                    sb.append("0");
                }
                for (int j = a; j < w; j++) {
                    sb.append("1");
                }
                System.out.println(sb.toString());
            } else {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < a; j++) {
                    sb.append("1");
                }
                for (int j = a; j < w; j++) {
                    sb.append("0");
                }
                System.out.println(sb.toString());
            }
        }
    }
}