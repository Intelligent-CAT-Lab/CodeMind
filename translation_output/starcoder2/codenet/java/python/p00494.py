
```

```

```

python code:
```

```
/p00494.md
# p00494

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00494 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[] str = ("$" + sc.next() + "$").toCharArray();
        int ans = 0;
        int s = 0;
        for (int i = 1; i < str.length; ++i) {
            if (str[i] == 'O' && str[i - 1] != 'O') s = i;
            if (str[i] == 'O' && str[i + 1] != 'O') {
                int l = i - s + 1;
                if (s >= l && str.length - i - 1 >= l) {
                    boolean ok = true;
                    for (int j = 0; j < l; ++j) {
                        if (str[s - 1 - j] != 'J' || str[i + 1 + j] != 'I') {
                            ok = false;
                            break;
                        }
                    }
                    if (ok) ans = Math.max(ans, l);
                }
            }
        }
        System.out.println(ans);
    }
}
```/p00495.md
# p00495

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00495 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int l = 0;
            int r = n - 1;
            while (l < r) {
                int m = (l + r) / 2;
                if (a[m] < a[i]) l = m + 1;
                else r = m;
            }
            if (a[l] == a[i]) ans++;
        }
        System.out.println(ans);
    }
}
```

python code:
```

```
/p00496.md
# p00496

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00496 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int l = 0;
            int r = n - 1;
            while (l < r) {
                int m = (l + r) /         }
        System.out.println(ans);
    }
}
```

python code:
```

```
2;
                if (a[m] <= a[i]) l = m + 1;
                else r = m;
            }
            if (a[l] == a[i]) ans++;
        }
        System.out.println(ans);
    }
}
```

python code:
```

```
/p00497.md
# p00497

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00497 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int l = 0;
            int r = n - 1;
            while (l < r) {
                int m = (l + r) / 2;
                if (a[m] < a[i]) l = m + 1;
                else r = m;
            }
            if (a[l] == a[i]) {
                int ll = l;
                int rr = n - 1;
                while (ll < rr) {
                    int mm = (ll + rr) / 2;
                    if (a[mm] <= a[i]) ll = mm + 1;
                    else rr = mm;
                }
                ans += ll - l;
            }
/p00498.md
# p00498

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00498 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int l = 0;
            int r = n - 1;
            whil        }
        System.out.println(ans);
    }
}
```

python code:
```

```
e (l < r) {
                int m = (l + r) / 2;
                if (a[m] <= a[i]) l = m + 1;
                else r = m;
            }
            if (a[l] == a[i]) {
                int ll = l;
                int rr = n - 1;
                while (ll < rr) {
                    int mm = (ll + rr) / 2;
                    if (a[mm] < a[i]) ll = mm + 1;
                    else rr = mm;
                }
                ans += ll - l;
            }
/p00499.md
# p00499

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00499 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[
