import java.util.Scanner;

public class p00404 {

    public static int search(int x, int y) {
        int xMin = 0;
        int yMin = 0;
        int xMax = 0;
        int yMax = 0;
        int f = 0;
        int f1 = 1;
        int f2 = 0;
        int p = 0;

        while (true) {
            if (xMin <= x && x <= xMax && yMin <= y && y <= yMax) return p % 3 + 1;

            f = f1 + f2;

            switch (p % 4) {
                case 0: xMax += f; break; // east
                case 1: yMax += f; break; // north
                case 2: xMin -= f; break; // west
                case 3: yMin -= f; break; // south
            }

            f2 = f1;
            f1 = f;
            p++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        System.out.println(search(x, y));
    }
}