
```
import math

def execute(scanner):
    r = math.sqrt(scanner.nextInt())
    print(r * r)

execute(input())
```


```

python code:
```
def execute(scanner):
    n = scanner.nextInt()
    print(n * (n + 1) // 2)

execute(input())
```
/p03557.md
# p03557

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03557 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            execute(scanner);
        }
    }

    private static void execute(Scanner scanner) {
        int n = scanner.nextInt();
        System.out.println(n * (n + 1) / 2);
    }
}/p03558.md
# p03558

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03558 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            execute(scanner);
        }
    }

    private static void execute(Scanner scanner) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int r = n * m - k;
        System.out.println(r);
    }
}

```

python code:
```
def execute(scan
ner):
    n = scanner.nextInt()
    m = scanner.nextInt()
    k = scanner.nextInt()
    r = n * m - k
    print(r)

execute(input())
```

Note:

```
n * m - k = n * (m - k / n)
```/p03559.md
# p03559

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03559 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            execute(scanner);
        }
    }

    private static void execute(Scanner scanner) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int r = n * m / k;
        System.out.println(r);
    }
}

```

python code:
```
def execute(scanner):
    n = scanner.nextInt()
    m = scanner.nextInt()
    k = scanner.nextInt()
    r = n * m // k
    print(r)

execute(input())
```

Note:

```
n * m / k = n * (m / k)
```
/p03555.md
# p03555

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03555 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            execute(scanner);
        }
    }

    private static void execute(Scanner scanner) {
        int n = scanner.nextInt();
        int r = n * n;
        System.out.println(r);
    }
}

```

python code:
```
def execute(scanner):
    n = scanner.nextInt()
    r = n * n
    print(r)

execute(input())
```


```
/p03554.md
# p03554

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03554 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            execute(scanner);
        }
    }

    private static void execute(Scanner scanner) {
        int n = scanner.nextInt();
        int r = n * n * n;
        System.out.println(r);
    }
}

```

python code:
```
def execute(scanner):
    n = scanner.nextInt()
    r = n * n * n
    print(r)

execute(input())
```

Note:

```
n * n * n = n * (n * n)
n * n * n = n * n * n
