
```

```


```
/problems/p00000.md
# Problem 00000

## Problem statement

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;
import java.util.*;


public class p00000 {

    private static Scanner sc;
    private static Printer pr;

    private static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }

        for (int x : c) {
            pr.print(x + " ");
        }
        pr.println();
    }

    // ---------------------------------------------------
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        pr = new Printer(System.out);

        solve();

        pr.close();
        sc.close();
    }

    private static class Printer extends PrintWriter {
        Printer(PrintStream out) {
            super(out);
        }
    }
}

```

python code:
```

```/problems/p00001.md
# Problem 00001

## Problem statement

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;
import java.util.*;


public class p00001 {

    private static Scanner sc;
    private static Printer pr;

    private static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }

        for (int x : c) {
            pr.print(x + " ");
        }
        pr.println();
    }

    // ---------------------------------------------------
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        pr = new Printer(System.out);

        solve();

        pr.close();
        sc.close();
    }

    private static class Printer extends PrintWriter {
        Printer(PrintStream out) {
            super(out);
        }
    }
}

```

python code:
```

```

## Problem statement

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;
import java.util.*;


public class p00001 {

    private static Scanner sc;
    private static Printer pr;

    private static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }

        for (int x : c) {
            pr.print(x + " ");
        }
        pr.println();
    }

    // ---------------------------------------------------
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        pr = new Printer(System.out);

        solve();

        pr.close();
        sc.close();
    }

    private static class Printer extends PrintWriter {
        Printer(PrintStream out) {
            super(out);
        }
    }
}

```

python code:
```

```

## Problem statement

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;
import java.util.*;


public class p00001 {

    private static Scanner sc;
    private static Printer pr;

    private static void solve() {
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (i < n) {
            c[k++] = a[i++];
        }
        while (j < m) {
            c[k++] = b[j++];
        }

        for (int x : c)
