
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = 0;
        int h = 0;
        int w = 0;

        for (int i = 1; i < 3501; i++) {
            for (int j = 1; j < 3501; j++) {
                int tmp1 = N * i * j;
                int tmp2 = (4 * i * j) - (N * j) - (N * i);
                if (tmp2 != 0) {
                    int s = tmp1 / tmp2;
                    int m = tmp1 % tmp2;
                    if (m == 0 && s >= 0) {
                        n = i;
                        h = j;
                        w = s;
                        System.out.println(n + " " + h + " " + w);
                        System.exit(0);
                    }
                }
            }
        }
    }
}
```
/2019/01/20190121.md
# 20190121

## 1. 1000번

### 문제

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

### 출력

첫째 줄에 A+B를 출력한다.

### 예제 입력 1

```
1 2
```

### 예제 출력 1

```
3
```

### 예제 입력 2

```
-7 4
```

### 예제 출력 2

```
-3
```

### 예제 입력 3

```
0 0
```

### 예제 출력 3

```
0
```

### 예제 입력 4

```
1 -2
```

### 예제 출력 4

```
-1
```

### 풀이

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 2. 2557번

### 문제

Hello World!를 출력하시오.

### 입력

없음

### 출력

Hello World!를 출력하시오.

### 예제 입력 1

```

```

### 예제 출력 1

```
Hello World!
```

### 풀이

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```

## 3. 2558번

### 문제

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)

### 출력

첫째 줄에 A+B를 출력한다.

### 예제 입력 1

```
1
2
```

### 예제 출력 1

```
3
```

### 예제 입력 2

```
-7
4
```

### 예제 출력 2

```
-3
```

### 예제 입력 3

```
0
0
```

### 예제 출력 3

```
0
```

### 예제 입력 4

```
1
-2
```

### 예제 출력 4

```
-1
```

### 풀이

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

## 4. 10950번

### 문제

두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

### 출력

각 테스트 케이스마다 A+B를 출력한다.

### 예제 입력 1

```
5
1 1
2 3
3 4
9 8
5 2
```

### 예제 출력 1

```
2
5
7
17
7
```

### 풀이

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
```

## 5. 8393번

### 문제

n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.

### 입력

첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

### 출력

1부터 n까지 합을 출력한다.

### 예제 입력 1

```
3
```

### 예제 출력 1

```
6
```

### 예제 입력 2

```
5
```

### 예제 출력 2

```
15
```

### 예제 입력 3

```
10
```

### 예제 출력 3

```
55
```

### 예제 입력 4

```
1000
```

### 예제 출력 4

```
500500
```

### 풀이

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 6. 15552번

### 문제

본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.

C++을 사용하고 있고 cin/cout을 사용하고자 한다면, cin.tie(NULL)과 sync_with_stdio(false)를 둘 다 적용해 주고, endl 대신 개행문자(\n)를 쓰자. 단, 이렇게 하면 더 이상 scanf/printf/puts/getchar/putchar 등 C의 입출력 방식을 사용하면 안 된다.

Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

Python
