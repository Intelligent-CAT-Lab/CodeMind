
```
s = input()
arr = list(s)

for i in range(len(s)//2):
    if arr[i] != arr[len(s)-1-i]:
        print("No")
        break
else:
    for i in range(len(s)//2-1):
        if arr[i] != arr[(len(s)//2)-1-i]:
            print("No")
            break
    else:
        print("Yes")
```

## 2731

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.PrintWriter;
import java.util.*;

public class p02731 {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new p02731().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i=1; i<n; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
        }

        out.print(max-min);
        out.flush();
    }

}

```

python code:
```
n = int(input())
arr = [int(input()) for _ in range(n)]

max_val = arr[0]
min_val = arr[0]

for i in range(1, n):
    if arr[i] > max_val:
        max_val = arr[i]
    if arr[i] < min_val:
        min_val = arr[i]

print(max_val-min_val)
```

## 2732

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.PrintWriter;
import java.util.*;

public class p02732 {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new p02732().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i=1; i<n; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
        }

        out.print(max-min);
        out.flush();
    }

}

```

python code:
```
n = int(input())
arr = [int(input()) for _ in range(n)]

max_val = arr[0]
min_val = arr[0]

for i in range(1, n):
    if arr[i] > max_val:
        max_val = arr[i]
    if arr[i] < min_val:
        min_val = arr[i]

print(max_val-min_val)
```

## 2733

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.PrintWriter;
import java.util.*;

public class p02733 {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new p02733().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i=1; i<n; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
        }

        out.print(max-min);
        out.flush();
    }

}

```

python code:
```
n = int(input())
arr = [int(input()) for _ in range(n)]

max_val = arr[0]
min_val = arr[0]

for i in range(1, n):
    if arr[i] > max_val:
        max_val = arr[i]
    if arr[i] < min_val:
        min_val = arr[i]

print(max_val-min_val)
```

## 2734

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.PrintWriter;
import java.util.*;

public class p02734 {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new p02734().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i=1; i<n; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
        }

        out.print(max-min);
        out.flush();
    }

}

```

python code:
```
n = int(input())
arr = [int(input()) for _ in range(n)]

max_val = arr[0]
min_val = arr[0]

for i in range(1, n):
    if arr[i] > max_val:
        max_val = arr[i]
    if arr[i] < min_val:
        min_val = arr[i]

print(max_val-min_val)
```

## 2735

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.PrintWriter;
import java.util.*;

public class p02735 {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new p02735().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i=1; i<n; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
        }

        out.print(max-min);
        out.flush();
    }

}

```

python code:
```
n = int(input())
arr = [
