import java.util.*;

class Vector {
    private double x, y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.printf("%.2f, %.2f%n", x, y);
    }

    public Vector add(Vector o) {
        return new Vector(x + o.x, y + o.y);
    }

    public Vector sub(Vector o) {
        return new Vector(x - o.x, y - o.y);
    }

    public Vector mul(Vector o) {
        return new Vector(x * o.x, y * o.y);
    }

    public Vector truediv(Vector o) {
        return new Vector(x / o.x, y / o.y);
    }

    public Vector rot(double deg) {
        double rad = Math.toRadians(deg);
        double x = x * Math.cos(rad) - y * Math.sin(rad);
        double y = x * Math.sin(rad) + y * Math.cos(rad);
        return new Vector(x, y);
    }
}

public class p02273 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Vector a = new Vector(0, 0);
        Vector b = new Vector(100, 0);

        a.print();
        koch(N, a, b);
        b.print();
    }

    public static void koch(int d, Vector a, Vector b) {
        if (d == 0) {
            return;
        }

        double s = a.x + (b.x - a.x) / 3;
        Vector u = new Vector(s, a.y + (s - a.x).rot(60));
        double t = a.x + (b.x - a.x) * 2 / 3;

        koch(d - 1, a, u);
        u.print();
        koch(d - 1, u, new Vector(s, a.y + (s - a.x).rot(120)));
        new Vector(s, a.y + (s - a.x).rot(120)).print();
        koch(d - 1, new Vector(s, a.y + (s - a.x).rot(120)), new Vector(t, a.y + (t - a.x).rot(60)));
        new Vector(t, a.y + (t - a.x).rot(60)).print();
        koch(d - 1, new Vector(t, a.y + (t - a.x).rot(60)), b);
    }
}