import java.util.Scanner;

public class p03001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = scanner.nextDouble();
        double h = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        scanner.close();

        double mx = w / 2;
        double my = h / 2;
        double area = w * h / 2;
        int correct = 0;

        if (x == mx && y == my) {
            correct = 1;
        }

        System.out.printf("%.6f %d\n", area, correct);
    }
}