import java.util.Scanner;

class Vector {
    double x, y;

    Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        System.out.println(this.x + " " + this.y);
    }

    Vector add(Vector o) {
        return new Vector(this.x + o.x, this.y + o.y);
    }

    Vector sub(Vector o) {
        return new Vector(this.x - o.x, this.y - o.y);
    }

    Vector mul(double o) {
        return new Vector(this.x * o, this.y * o);
    }

    Vector div(double o) {
        return new Vector(this.x / o, this.y / o);
    }

    Vector rot(double deg) {
        double rad = Math.toRadians(deg);
        double x = this.x * Math.cos(rad) - this.y * Math.sin(rad);
        double y = this.x * Math.sin(rad) + this.y * Math.cos(rad);
        return new Vector(x, y);
    }
}

public class p02273 {
    static void koch(int d, Vector a, Vector b) {
        if (d == 0)
            return;

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        Vector a = new Vector(0, 0);
        Vector b = new Vector(100, 0);

        a.print();
        koch(N, a, b);
        b.print();
    }
}