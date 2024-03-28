
```

```


```
/p03146.md
# p03146

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p03146 {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int s = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        set.add(s);
        int i = 1;
        while (true) {
            i++;
            if (s % 2 == 0) {
                s = s / 2;
            } else {
                s = 3 * s + 1;
            }
            if (set.contains(s)) {
                System.out.println(i);
                return;
            } else {
                set.add(s);
            }
        }
    }
}

```

python code:
```

```/p03147.md
# p03147

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p03147 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0;
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
            System.out.print(x + " ");
        }
    }
}

```

python code:
```

```

```

```
/p03148.md
# p03148

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p03148 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for   }
        }
        for (int x : c) {
            System.out.print(x + " ");
        }
    }
}

```

python code:
```

```

```

```
 (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0;
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
        for (int x = 0; x < c.length - 1; x++) {
            if (c[x] == c[x + 1]) {
                for (int y = x + 1; y < c.length - 1; y++) {
                    c[y] = c[y + 1];
                }
                c[c.length - 1] = 0;
                x--;
            }
        }
        for (int x = 0; x < c.length - 1; x++) {
            if (c[x] == 0) {
                for (int y = x; y < c.length - 1; y++) {
                    c[y] = c[y + 1];
                }
         /p03149.md
# p03149

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p03149 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0;
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
        for (int x = 0; x < c.length - 1; x++) {
            if (c[x] == c[x + 1]) {
                for (int y = x + 1; y < c.length - 1; y++) {
                    c[y] = c[y + 1];
                }
                c[c.length - 1] = 0;
                x--;
            }
        }
        for (int x = 0; x < c.length - 1; x++) {
            if (c[x] == 0) {
                for (int y = x; y < c.length - 1; y++) {
                    c[y] = c[y + 1];
                }
            }
        }
        for (int x : c) {
            System.out.print(x + " ");
        }
    }
}

```

python code:
```

```

```

```
/p03150.md
# p03150

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p03150 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[
