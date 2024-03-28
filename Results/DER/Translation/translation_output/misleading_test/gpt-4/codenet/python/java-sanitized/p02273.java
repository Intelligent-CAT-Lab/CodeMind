import java.util.Scanner;

public class p02273 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

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

        Vector s = a.add(b.subtract(a).divide(3));
        Vector u = s.add(s.subtract(a).rot(60));
        Vector t = a.add(b.subtract(a).multiply(2.0 / 3));

        koch(d - 1, a, s);
        s.print();
        koch(d - 1, s, u);
        u.print();
        koch(d - 1, u, t);
        t.print();
        koch(d - 1, t, b);
    }
}

class Vector {
    double x, y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.printf("%.8f %.8f\n", x, y);
    }

    public Vector add(Vector o) {
        return new Vector(this.x + o.x, this.y + o.y);
    }

    public Vector subtract(Vector o) {
        return new Vector(this.x - o.x, this.y - o.y);
    }

    public Vector multiply(double o) {
        return new Vector(this.x * o, this.y * o);
    }

    public Vector divide(double o) {
        return new Vector(this.x / o, this.y / o);
    }

    public Vector rot(double deg) {
        double rad = Math.toRadians(deg);
        double x = this.x * Math.cos(rad) - this.y * Math.sin(rad);
        double y = this.x * Math.sin(rad) + this.y * Math.cos(rad);
        return new Vector(x, y);
    }
}