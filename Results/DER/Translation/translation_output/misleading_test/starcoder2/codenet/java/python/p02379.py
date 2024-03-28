
```python
import math

x1, y1, x2, y2 = map(float, input().split())

print(math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2))
```

## p02380

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4

Expected output:
14

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02380 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int[] list = new int[4];
        int n = 4;
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        System.out.println(list[0] + list[1] + list[2] + list[3]);
    }
}
```

python code:
```python
a, b, c, d = map(int, input().split())

print(a + b + c + d)
```

## p02381

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4

Expected output:
10

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02381 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int[] list = new int[4];
        int n = 4;
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        System.out.println(list[0] * list[1] + list[2] * list[3]);
    }
}
```

python code:
```python
a, b, c, d = map(int, input().split())

print(a * b + c * d)
```

## p02382

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4

Expected output:
21

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02382 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int[] list = new int[4];
        int n = 4;
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        System.out.println(list[0] * list[1] * list[2] * list[3]);
    }
}
```

python code:
```python
a, b, c, d = map(int, input().split())

print(a * b * c * d)
```

## p02383

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4

Expected output:
2

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02383 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int[] list = new int[4];
        int n = 4;
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        System.out.println(list[0] * list[1] / list[2] / list[3]);
    }
}
```

python code:
```python
a, b, c, d = map(int, input().split())

print(a * b // c // d)
```

## p02384

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4

Expected output:
2

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02384 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int[] list = new int[4];
        int n = 4;
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        System.out.println(list[0] * list[1] % list[2] % list[3]);
    }
}
```

python code:
```python
a, b, c, d = map(int, input().split())

print(a * b % c % d)
```

## p02385

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4

Expected output:
2

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02385 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int[] list = new int[4];
        int n = 4;
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        System.out.println(list[0] * list[1] % list[2] / list[3]);
    }
}
```

python code:
```python
a, b, c, d = map(int, input().split())

print(a * b % c // d)
```

## p02386

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4

Expected output:
2

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02386 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lines = br.readLine().split(" ");
        int[] list = new int[4];
        int n = 4;
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        System.out.println(list[0] * list[1] / list[2] % list[3]);
    }
}
```

python code:
```python
a, b, c, d = map(int, input().split())

print(a * b // c % d)
```

