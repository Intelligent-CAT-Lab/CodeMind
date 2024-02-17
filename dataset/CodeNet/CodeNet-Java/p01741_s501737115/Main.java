import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;


public class Main {
    Scanner sc = new Scanner(System.in);

    double function(final double y, double a, final double dx) {
        double nx = a + dx;
        if (Math.abs(Math.floor(a) - Math.floor(nx)) < 1e-6) {
            double sx1 = Math.floor(a);
            double sx2 = sx1 + 1;
            double rx1 = Math.floor(nx);
            double rx2 = rx1 + 1;
            double dist = Math.min(a - sx1 + nx - rx1, sx2 - a + rx2 - nx);
            return y + dist;
        } else {
            return y + nx - a;
        }
    }

    void run() {
        double d = sc.nextDouble();
//        double d = Math.sqrt(1.25);
        double max = d * Math.sqrt(2);
//        debug(max);
        for (int i = 1; i <= 10; ++i) {
            if (d < i) {
                break;
            }
            // (0, i) <-> (10, i)
            final double dx = Math.sqrt(d * d - i * i);
//            final double y = i;
            // (0, 0) <-> (1, 0)
//            double x = goldenSectionSearch(0, 1, a -> function(y, a, dx), Comparator.comparingDouble(Double::doubleValue));
            if (Math.floor(dx) < 1) {
                max = Math.max(max, i + 1);
            } else {
                max = Math.max(max, i + dx);
            }
//            double res = function(y, x, dx);
//            debug(y, dx, res);
//            max = Math.max(max, res);
        }
        System.out.printf("%.16f", max);
        System.out.println();
    }

    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;

    double goldenSectionSearch(double left, double right, Function<Double, Double> f, Comparator<Double> comp) {
        double c1 = divideInternally(left, right, 1, GOLDEN_RATIO);
        double c2 = divideInternally(left, right, GOLDEN_RATIO, 1);
        double d1 = f.apply(c1);
        double d2 = f.apply(c2);
        for (int i = 0; i < 10000000; ++i) {
            if (comp.compare(d1, d2) > 0) {
                right = c2;
                c2 = c1;
                d2 = d1;
                c1 = divideInternally(left, right, 1, GOLDEN_RATIO);
                d1 = f.apply(c1);
            } else {
                left = c1;
                c1 = c2;
                d1 = d2;
                c2 = divideInternally(left, right, GOLDEN_RATIO, 1);
                d2 = f.apply(c2);
            }
        }
        return left;
    }

    double divideInternally(double a, double b, double m, double n) {
        return (n * a + m * b) / (m + n);
    }

    int ni() {
        return sc.nextInt();
    }

    static public void main(String[] args) {
        new Main().run();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }
}