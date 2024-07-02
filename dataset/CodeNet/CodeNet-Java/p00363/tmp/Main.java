
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int W = scanner.nextInt();
System.out.println("[INST]8;W;scanner.nextInt();"+W);
        int H = scanner.nextInt();
System.out.println("[INST]9;H;scanner.nextInt();"+H);
        String c = scanner.next();
System.out.println("[INST]10;c;scanner.next();"+c);
        int x = (W - 1) / 2;
        int y = (H - 1) / 2;

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (j == 0 && i == 0 || j == 0 && i == H - 1 || j == W - 1 && i == 0 || j == W - 1 && i == H - 1) {
                    System.out.print("+");
                } else if (j != 0 && j != W - 1 && i == 0 || j != 0 && j != W - 1 && i == H - 1) {
                    System.out.print("-");
                } else if (i != 0 && i != H - 1 && j == 0 || i != 0 && i != H - 1 && j == W - 1) {
                    System.out.print("|");
                } else if (j == x && i == y) {
                    System.out.print(c);
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}

