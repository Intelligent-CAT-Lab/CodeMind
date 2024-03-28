

```
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double k = 0;
        double t = 0;

        if (Math.sqrt(8 * x + 1) == Math.floor(Math.sqrt(8 * x + 1))) {
            double a = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) a);
        } else {
            double x1 = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) x1 + 1);
        }
    }
}

```

I am getting the following error:

```
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
    The operator / is undefined for the argument type(s) double, int

    at Main.main(Main.java:11)

```

I am not able to figure out the error.username_1: You can use `Math.floor` to round down to the nearest integer.

```
double a = Math.floor((-1 + Math.sqrt(1 + 8 * x)) / 2);

```
Upvotes: 2 username_2: You can use `Math.floor` to round down to the nearest integer.

```
double a = Math.floor((-1 + Math.sqrt(1 + 8 * x)) / 2);

```
Upvotes: 1 username_3: You can use `Math.floor` to round down to the nearest integer.

```
double a = Math.floor((-1 + Math.sqrt(1 + 8 * x)) / 2);

```
Upvotes: 0 
