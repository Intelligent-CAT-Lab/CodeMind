import java.util.Scanner;

public class p02273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
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

        Vector s = new Vector((a.x + b.x) / 3, (a.y + b.y) / 3);
        Vector u = s.rot(60).add(s.sub(a).mul(2/3));
        Vector t = new Vector((a.x + b.x) * 2 / 3, (a.y + b.y) * 2 / 3);

        koch(d-1, a, s);
        s.print();
        koch(d-1, s, u);
        u.print();
        koch(d-1, u, t);
        t.print();
        koch(d-1, t, b);
    }
}

class Vector {
    double x, y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        System.out.println(x + " " + y);
    }

    public Vector add(Vector o) {
        return new Vector(x + o.x, y + o.y);
    }

    public Vector sub(Vector o) {
        return new Vector(x - o.x, y - o.y);
    }

    public Vector mul(double o) {
        return new Vector(x * o, y * o);
    }

    public Vector div(double o) {
        return new Vector(x / o, y / o);
    }

    public Vector rot(double deg) {
        double rad = Math.toRadians(deg);
        double x = this.x * Math.cos(rad) - this.y * Math.sin(rad);
        double y = this.x * Math.sin(rad) + this.y * Math.cos(rad);
        return new Vector(x, y);
    }
}