import java.util.Scanner;

public class p03001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        double w = Double.parseDouble(inputs[0]);
        double h = Double.parseDouble(inputs[1]);
        double x = Double.parseDouble(inputs[2]);
        double y = Double.parseDouble(inputs[3]);
        double mx = w / 2;
        double my = h / 2;
        double[] res = new double[2];
        res[0] = w * h / 2;
        if (x == mx && y == my) {
            res[1] = 1;
        } else {
            res[1] = 0;
        }
        System.out.println(res[0] + " " + res[1]);
    }
}