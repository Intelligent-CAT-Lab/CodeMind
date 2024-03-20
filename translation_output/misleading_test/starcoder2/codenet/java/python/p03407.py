

```python
a,b,c = map(int,input().split())
print("Yes" if a+b>=c else "No")
```


```

python code:

```python
a,b,c = map(int,input().split())
print("Yes" if a+b>=c else "No")
```

## 03408

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 100 100

Expected output:
100

```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class p03408 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AThreeIntegers solver = new AThreeIntegers();
        solver.solve(1, in, out);
        out.close();
    }

    static class AThreeIntegers {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            out.println(Math.min(a, Math.min(b, c)));
        }

    }
}


```

python code:

```python
a,b,c = map(int,input().split())
print(min(a,b,c))
```

## 03409

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 100 100

Expected output:
100

```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class p03409 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AThreeIntegers solver = new AThreeIntegers();
        solver.solve(1, in, out);
        out.close();
    }

    static class AThreeIntegers {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            out.println(Math.max(a, Math.max(b, c)));
        }

    }
}


```

python code:

```python
a,b,c = map(int,input().split())
print(max(a,b,c))
```

## 03410

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 100 100

Expected output:
100

```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class p03410 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AThreeIntegers solver = new AThreeIntegers();
        solver.solve(1, in, out);
        out.close();
    }

    static class AThreeIntegers {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            out.println(a + b + c - Math.min(a, Math.min(b, c)) - Math.max(a, Math.max(b, c)));
        }

    }
}


```

python code:

```python
a,b,c = map(int,input().split())
print(a+b+c-min(a,b,c)-max(a,b,c))
```

## 03411

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 100 100

Expected output:
100

```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class p03411 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AThreeIntegers solver = new AThreeIntegers();
        solver.solve(1, in, out);
        out.close();
    }

    static class AThreeIntegers {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            out.println(a + b + c - Math.max(a, Math.max(b, c)));
        }

    }
}


```

python code:

```python
a,b,c = map(int,input().split())
print(a+b+c-max(a,b,c))
```

## 03412

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100 100 100

Expected output:
100

```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class p03412 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AThreeIntegers solver = new AThreeIntegers();
        solver.solve(1, in, out);
        out.close();
    }

    static class AThreeIntegers {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            out.println(a + b + c - Math.min(a, Math.min(b, c)));
       
