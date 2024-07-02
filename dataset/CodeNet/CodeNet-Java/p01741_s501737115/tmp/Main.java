import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Function;


public class Main {
    Scanner sc = new Scanner(System.in);

    double function(final double y, double a, final double dx) {
        double nx = a + dx;
        if (Math.abs(Math.floor(a) - Math.floor(nx)) < 1e-6) {
System.out.println("[INST]11;None;Math.abs(Math.floor(a) - Math.floor(nx));"+Math.abs(Math.floor(a) - Math.floor(nx)));
System.out.println("[INST]11;None;Math.floor(a);"+Math.floor(a));
System.out.println("[INST]11;None;Math.floor(nx);"+Math.floor(nx));
            double sx1 = Math.floor(a);
System.out.println("[INST]12;sx1;Math.floor(a);"+sx1);
            double sx2 = sx1 + 1;
            double rx1 = Math.floor(nx);
System.out.println("[INST]14;rx1;Math.floor(nx);"+rx1);
            double rx2 = rx1 + 1;
            double dist = Math.min(a - sx1 + nx - rx1, sx2 - a + rx2 - nx);
System.out.println("[INST]16;dist;Math.min(a - sx1 + nx - rx1, sx2 - a + rx2 - nx);"+dist);
            return y + dist;
        } else {
            return y + nx - a;
        }
    }

    void run() {
        double d = sc.nextDouble();
System.out.println("[INST]24;d;sc.nextDouble();"+d);
//        double d = Math.sqrt(1.25);
        double max = d * Math.sqrt(2);
System.out.println("[INST]26;None;Math.sqrt(2);"+Math.sqrt(2));
//        debug(max);
        for (int i = 1; i <= 10; ++i) {
            if (d < i) {
                break;
            }
            // (0, i) <-> (10, i)
            final double dx = Math.sqrt(d * d - i * i);
System.out.println("[INST]33;dx;Math.sqrt(d * d - i * i);"+dx);
//            final double y = i;
            // (0, 0) <-> (1, 0)
//            double x = goldenSectionSearch(0, 1, a -> function(y, a, dx), Comparator.comparingDouble(Double::doubleValue));
            if (Math.floor(dx) < 1) {
System.out.println("[INST]37;None;Math.floor(dx);"+Math.floor(dx));
                max = Math.max(max, i + 1);
System.out.println("[INST]38;max;Math.max(max, i + 1);"+max);
            } else {
                max = Math.max(max, i + dx);
System.out.println("[INST]40;max;Math.max(max, i + dx);"+max);
            }
//            double res = function(y, x, dx);
//            debug(y, dx, res);
//            max = Math.max(max, res);
        }
        System.out.printf("%.16f", max);
System.out.println("[INST]46;None;System.out.printf('%.16f', max);"+System.out.printf("%.16f", max));
        System.out.println();
    }

    final static double GOLDEN_RATIO = (1.0 + Math.sqrt(5)) / 2.0;
System.out.println("[INST]50;None;Math.sqrt(5);"+Math.sqrt(5));

    double goldenSectionSearch(double left, double right, Function<Double, Double> f, Comparator<Double> comp) {
        double c1 = divideInternally(left, right, 1, GOLDEN_RATIO);
        double c2 = divideInternally(left, right, GOLDEN_RATIO, 1);
        double d1 = f.apply(c1);
System.out.println("[INST]55;d1;f.apply(c1);"+d1);
        double d2 = f.apply(c2);
System.out.println("[INST]56;d2;f.apply(c2);"+d2);
        for (int i = 0; i < 10000000; ++i) {
            if (comp.compare(d1, d2) > 0) {
System.out.println("[INST]58;None;comp.compare(d1, d2);"+comp.compare(d1, d2));
                right = c2;
                c2 = c1;
                d2 = d1;
                c1 = divideInternally(left, right, 1, GOLDEN_RATIO);
                d1 = f.apply(c1);
System.out.println("[INST]63;d1;f.apply(c1);"+d1);
            } else {
                left = c1;
                c1 = c2;
                d1 = d2;
                c2 = divideInternally(left, right, GOLDEN_RATIO, 1);
                d2 = f.apply(c2);
System.out.println("[INST]69;d2;f.apply(c2);"+d2);
            }
        }
        return left;
    }

    double divideInternally(double a, double b, double m, double n) {
        return (n * a + m * b) / (m + n);
    }

    int ni() {
        return sc.nextInt();
System.out.println("[INST]80;None;sc.nextInt();"+sc.nextInt());
    }

    static public void main(String[] args) {
        new Main().run();
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }
}