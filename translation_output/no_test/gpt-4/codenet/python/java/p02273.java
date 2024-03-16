Here is the translated Java code for your Python program:

```java
import java.util.Scanner;

public class Main {
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
```

Please note a couple of adjustments in the above translation:

1. In Java, the standard practice for printing to the console is to use `System.out.println()` instead of `print()` which is used in Python.

2. Java uses `Math.toRadians()` and `Math.cos()/Math.sin()` equivalent to Python's `math.radians()`, `math.cos()`, and `math.sin()` functions.

3. Java does not have operator overloading. Therefore, the methods `add`, `subtract`, `multiply`, and `divide` are explicitly defined to perform vector operations.

4. The input is read using a `Scanner` object.

5. Java classes generally start with an uppercase letter, but to match your Python class name, I kept it as `Vector`.

6. The "main" method is the entry point of the Java program, from which your Koch curve is initiated.

Remember to import the necessary `java.util.Scanner` package for reading console input if you're running this in a new file.
