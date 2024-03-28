

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int time = 1900 * M + (N - M) * 100;
        System.out.println(time * (int) Math.pow(2, M));
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int time = 1900 * M + (N - M) * 100;
        System.out.println(time * (int) Math.pow(2, M));
    }
}
```
/2020-09-21/README.md
# 2020-09-21

## 1. 1000번

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
5 50
```

### 예제 출력 2

```
55
```

### 예제 입력 3

```
-7 42
```

### 예제 출력 3

```
35
```

### 예제 입력 4

```
0 0
```

### 예제 출력 4

```
0
```

### 예제 입력 5

```
1 -2
```

### 예제 출력 5

```
-1
```

### java code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A + B);
    }
}
```

## 2. 1001번

두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

### 출력

첫째 줄에 A-B를 출력한다.

### 예제 입력 1

```
3 2
```

### 예제 출력 1

```
1
```

### 예제 입력 2

```
5 3
```

### 예제 출력 2

```
2
```

### 예제 입력 3

```
7 9
```

### 예제 출력 3

```
-2
```

### java code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A - B);
    }
}
```

## 3. 10998번

두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

### 출력

첫째 줄에 A×B를 출력한다.

### 예제 입력 1

```
1 2
```

### 예제 출력 1

```
2
```

### 예제 입력 2

```
3 4
```

### 예제 출력 2

```
12
```

### 예제 입력 3

```
5 6
```

### 예제 출력 3

```
30
```

### java code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A * B);
    }
}
```

## 4. 1008번

두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

### 입력

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

### 출력

첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

### 예제 입력 1

```
1 3
```

### 예제 출력 1

```
0.33333333333333333333333333333333
```

### 예제 입력 2

```
4 5
```

### 예제 출력 2

```
0.8
```

### 예제 입력 3

```
-1 2
```

### 예제 출력 3

```
-0.5
```

### java code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println((double) A / B);
    }
}
```

## 5. 10869번

두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.

### 입력

두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

### 출력

첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.

### 예제 입력 1

```
7 3
```

### 예제 출력 1

```
10
4
21
2
1
```

### 예제 입력 2

```
10 11
```

### 예제 출력 2

```
21
-1
110
0
10
```

### java code

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A + B);
        System.out.println(A - B);
        System.out.println(A * B);
        System.out.println(A / B);
        System.out.println(A % B);
    }
}
```

## 6. 10430번

(A+B)%C는 (A%C + B%C)%C 와 같을까?

(A×B)%C는 (A%C × B%C)%C 와 같을까?

세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.

### 입력

첫째 줄에 A
