import java.util.Scanner;

public class p02273 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        Vector a = new Vector(0, 0);
        Vector b = new Vector(100, 0);

        a.print();
        koch(N, a, b);
        b.print();
        
        in.close();
    }

    public static void koch(int d, Vector a, Vector b) {
        if (d == 0) {
            return;
        }

        Vector s = a.add(b.subtract(a).divide(3));
        Vector u = s.add((s.subtract(a)).rotate(60));
        Vector t = a.add(b.subtract(a).multiply(2.0 / 3));

        koch(d - 1, a, s);
        s.print();
        koch(d - 1, s, u);
        u.print();
        koch(d - 1, u, t);
        t.print();
        koch(d - 1, t, b);
    }

    static class Vector {
        double x;
        double y;

        public Vector(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void print() {
            System.out.println(this.x + " " + this.y);
        }

        public Vector add(Vector other) {
            return new Vector(this.x + other.x, this.y + other.y);
        }

        public Vector subtract(Vector other) {
            return new Vector(this.x - other.x, this.y - other.y);
        }

        public Vector multiply(double factor) {
            return new Vector(this.x * factor, this.y * factor);
        }

        public Vector divide(double divisor) {
            return new Vector(this.x / divisor, this.y / divisor);
        }

        public Vector rotate(double deg) {
            double rad = Math.toRadians(deg);
            double x = this.x * Math.cos(rad) - this.y * Math.sin(rad);
            double y = this.x * Math.sin(rad) + this.y * Math.cos(rad);
            return new Vector(x, y);
        }
    }
}