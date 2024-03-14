import java.util.*;

public class p02273 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector a = new Vector(0, 0);
        Vector b = new Vector(100, 0);
        a.print();
        koch(n, a, b);
        b.print();
    }

    public static void koch(int d, Vector a, Vector b) {
        if (d == 0) {
            return;
        }
        Vector s = new Vector((a.x + b.x) / 3, (a.y + b.y) / 3);
        Vector u = new Vector(s.x + (s.x - a.x) * Math.cos(Math.toRadians(60)) - (s.y - a.y) * Math.sin(Math.toRadians(60)), s.y + (s.x - a.x) * Math.sin(Math.toRadians(60)) + (s.y - a.y) * Math.cos(Math.toRadians(60)));
        Vector t = new Vector((a.x + b.x) * 2 / 3, (a.y + b.y) * 2 / 3);
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
    int x, y;

    public Vector(int x, int y) {
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

    public Vector mul(int o) {
        return new Vector(x * o, y * o);
    }

    public Vector div(int o) {
        return new Vector(x / o, y / o);
    }

    public Vector rot(int deg) {
        double rad = Math.toRadians(deg);
        int x = (int) (this.x * Math.cos(rad) - this.y * Math.sin(rad));
        int y = (int) (this.x * Math.sin(rad) + this.y * Math.cos(rad));
        return new Vector(x, y);
    }
}