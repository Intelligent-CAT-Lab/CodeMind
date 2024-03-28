
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        System.out.println(main(N, d, x));
    }

    public static double main(int N, int d, int x) {
        double ret = 0;
        while (N > 0) {
            ret += d + (N-0.5) * x;
            d = d + (d/N) + (5*x)/(2*N);
            x += 2*x/N;
            N -= 1;
        }
        return ret;
    }
}
```

## 2.

```
import sys

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

N, d, x = map(int, read().split())

def main(N, d, x):
    ret = 0
    while N:
        ret += d + (N-0.5) * x
        d = d + (d/N) + (5*x)/(2*N)
        x += 2*x/N
        N -= 1
    return ret

print(main(N, d, x))
```

java code:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        System.out.println(main(N, d, x));
    }

    public static double main(int N, int d, int x) {
        double ret = 0;
        while (N > 0) {
            ret += d + (N-0.5) * x;
            d = d + (d/N) + (5*x)/(2*N);
            x += 2*x/N;
            N -= 1;
        }
        return ret;
    }
}
```

## 3.

```
import sys

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

N, d, x = map(int, read().split())

def main(N, d, x):
    ret = 0
    while N:
        ret += d + (N-0.5) * x
        d = d + (d/N) + (5*x)/(2*N)
        x += 2*x/N
        N -= 1
    return ret

print(main(N, d, x))
```

java code:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        System.out.println(main(N, d, x));
    }

    public static double main(int N, int d, int x) {
        double ret = 0;
        while (N > 0) {
            ret += d + (N-0.5) * x;
            d = d + (d/N) + (5*x)/(2*N);
            x += 2*x/N;
            N -= 1;
        }
        return ret;
    }
}
```

## 4.

```
import sys

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

N, d, x = map(int, read().split())

def main(N, d, x):
    ret = 0
    while N:
        ret += d + (N-0.5) * x
        d = d + (d/N) + (5*x)/(2*N)
        x += 2*x/N
        N -= 1
    return ret

print(main(N, d, x))
```

java code:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        System.out.println(main(N, d, x));
    }

    public static double main(int N, int d, int x) {
        double ret = 0;
        while (N > 0) {
            ret += d + (N-0.5) * x;
            d = d + (d/N) + (5*x)/(2*N);
            x += 2*x/N;
            N -= 1;
        }
        return ret;
    }
}
```

## 5.

```
import sys

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

N, d, x = map(int, read().split())

def main(N, d, x):
    ret = 0
    while N:
        ret += d + (N-0.5) * x
        d = d + (d/N) + (5*x)/(2*N)
        x += 2*x/N
        N -= 1
    return ret

print(main(N, d, x))
```

java code:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        System.out.println(main(N, d, x));
    }

    public static double main(int N, int d, int x) {
        double ret = 0;
        while (N > 0) {
            ret += d + (N-0.5) * x;
            d = d + (d/N) + (5*x)/(2*N);
            x += 2*x/N;
            N -= 1;
        }
        return ret;
    }
}
```

## 6.

```
import sys

read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

N, d, x = map(int, read().split())

def main(N, d, x):
    ret = 0
    while N:
        ret += d + (N-0.5) * x
        d = d + (d/N) + (5*x)/(2*N)
        x += 2*x/N
        N -= 1
    return ret

print(main(N, d, x))
```

java code:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken
