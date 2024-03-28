
```

```


```
/p02018.md
# p02018

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02018 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
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
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            c[k] = b[j];
            j++;
            k++;
        }
        for (int l = 0; l < n + m; l++) {
            System.out.println(c[l]);
        }
    }
}


```

python code:
```/p02016.md
# p02016

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02016 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(c[i]);
        }
    }
}


```

python code:
```

```
/p02015.md
# p02015

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02015 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();        }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}


```

python code:
```

```

        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
    /p02014.md
# p02014

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02014 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] * b[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(c[i]);
        }
    }
}


```

python code:
```

```
/p02013.md
# p02013

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02013 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] - b[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(c[i]);
        }
    }
}


```

python code:
```

```
/p02012.md
# p02012

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02012 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] / b[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.println(c[i]);
        }
    }
}


```

python code:
```

```
/p02011.md
# p02011

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02011 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0
