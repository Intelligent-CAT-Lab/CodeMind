Here's the Python code translated into Java:

```java
import java.text.DecimalFormat;
import java.util.Scanner;

class Vector {
    private double x, y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void print() {
        DecimalFormat df = new DecimalFormat("0.00000000");
        System.out.println(df.format(x) + " " + df.format(y));
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
        double x = this.x * Math.cos(rad) - this.y * Math.sin(rad);
        double y = this.x * Math.sin(rad) + this.y * Math.cos(rad);
        return new Vector(x, y);
    }
}

public class Main {
    public static void koch(int d, Vector a, Vector b) {
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

        scanner.close();
    }
}
```

This Java code performs the same operations as the Python code you provided. It uses the `Vector` class to represent two-dimensional vectors and defines methods for vector addition, subtraction, multiplication by a scalar, division by a scalar, and rotation. The `koch` method recursively generates the points of the Koch curve, and the `main` method runs the program, taking input from the user for the number of iterations (N).

Note: To achieve the same format for the output, I've used Java's `DecimalFormat` class to format the printed numbers with eight decimal places, matching the expected output.
