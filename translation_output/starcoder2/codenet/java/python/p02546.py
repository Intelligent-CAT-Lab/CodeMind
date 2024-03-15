
```

```


```
/p02546.md
# p02546

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02546 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
       String s = sc.next();
       if (s.endsWith("s")) {
           System.out.println(s + "es");
       } else {
           System.out.println(s + "s");
       }



    }

}

```

python code:
```
s = input()
if s[-1] == 's':
    print(s + 'es')
else:
    print(s + 's')
```

# p02547

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02547 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i % 2 == 1) {
                    if (j % 2 == 1) {
                        count++;
                    }
                } else {
                    if (j % 2 == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count * k);
    }

}

```

python code:
```
n, m, k = map(int, input().split())
count = 0
for i in range(1, n + 1):
    for j in range(1, m + 1):
        if i % 2 == 1:
            if j % 2 == 1:
                count += 1
        else:
            if j % 2 == 0:
                count += 1
print(count * k)
```

# p02548

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02548 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }

}

```

python code:
```
n = int(input())
a = list(map(int, input().split()))
max = a[0]
for i in range(1, n):
    if max < a[i]:
        max = a[i]
print(max)
```

# p02549

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02549 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }

}

```

python code:
```
n = int(input())
a = list(map(int, input().split()))
min = a[0]
for i in range(1, n):
    if min > a[i]:
        min = a[i]
print(min)
```

# p02550

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02550 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }

}

```

python code:
```
n = int(input())
a = list(map(int, input().split()))
sum = 0
for i in range(n):
    sum += a[i]
print(sum)
```

# p02551

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02551 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum / n);
    }

}

```

python code:
```
n = int(input())
a = list(map(int, input().split()))
sum = 0
for i in range(n):
    sum += a[i]
print(sum // n)
```

# p02552

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02552 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum / n);
        System.out.println(sum % n);
    }

}

```

python code:
```
n = int(input())
a = list(map(int, input().split()))
sum = 0
for i in range(n):
    sum += a[i]
print(sum // n)
print(sum % n)
```

# p02553

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02553 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum / n);
        System.out.println(sum % n);
        System.out.println(sum);
    }

}

```
