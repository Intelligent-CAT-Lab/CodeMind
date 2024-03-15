import java.util.Scanner;

public class p03001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double w = scanner.nextDouble();
        double h = scanner.nextDouble();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        
        double mx = w / 2;
        double my = h / 2;
        
        double[] res = new double[2];
        res[0] = w * h / 2;
        res[1] = (x == mx && y == my) ? 1 : 0;
        
        System.out.println(res[0] + " " + res[1]);
    }
}