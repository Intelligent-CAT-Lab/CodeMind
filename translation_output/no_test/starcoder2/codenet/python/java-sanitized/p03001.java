import java.util.Scanner;

public class p03001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double mx = w/2;
        double my = h/2;
        double[] res = new double[2];
        res[0] = w*h/2;
        if (x==mx && y==my) {
            res[1] = 1;
        } else {
            res[1] = 0;
        }
        System.out.println(res[0] + " " + res[1]);
    }
}