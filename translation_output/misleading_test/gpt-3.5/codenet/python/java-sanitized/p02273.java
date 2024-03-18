import java.util.Scanner;

class Vector {
    double x;
    double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println(this.x + " " + this.y);
    }

    public Vector add(Vector o) {
        return new Vector(this.x + o.x, this.y + o.y);
    }

    public Vector sub(Vector o) {
        return new Vector(this.x - o.x, this.y - o.y);
    }

    public Vector mul(double o) {
        return new Vector(this.x * o, this.y * o);
    }

    public Vector div(double o) {
        return new Vector(this.x / o, this.y / o);
    }

    public Vector rot(double deg) {
        double rad = Math.toRadians(deg);
        double newX = this.x * Math.cos(rad) - this.y * Math.sin(rad);
        double newY = this.x * Math.sin(rad) + this.y * Math.cos(rad);
        return new Vector(newX, newY);
    }
}

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

        Vector s = a.add(b.sub(a).div(3));
        Vector u = s.add(s.sub(a).rot(60));
        Vector t = a.add(b.sub(a).mul(2).div(3));

        koch(d - 1, a, s);
        s.print();
        koch(d - 1, s, u);
        u.print();
        koch(d - 1, u, t);
        t.print();
        koch(d - 1, t, b);
    }
}