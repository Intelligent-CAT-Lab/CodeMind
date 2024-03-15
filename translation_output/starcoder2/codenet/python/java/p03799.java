
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ans;
        if (2 * N <= M) {
            ans = N + (M - 2 * N) / 4;
        } else {
            ans = M / 2;
        }
        System.out.println(ans);
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
        int ans;
        if (2 * N <= M) {
            ans = N + (M - 2 * N) / 4;
        } else {
            ans = M / 2;
        }
        System.out.println(ans);
    }
}
```
/2020/01/20200120.md
# 20200120

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
3 4
```

### 예제 출력 2

```
7
```

### 예제 입력 3

```
5 6
```

### 예제 출력 3

```
11
```

### 예제 입력 4

```
7 8
```

### 예제 출력 4

```
15
```

### 예제 입력 5

```
9 10
```

### 예제 출력 5

```
19
```

### 풀이

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

### 문제

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

### 풀이

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

### 문제

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

### 예제 입력 4

```
7 8
```

### 예제 출력 4

```
56
```

### 예제 입력 5

```
9 10
```

### 예제 출력 5

```
90
```

### 풀이

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

### 문제

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
7 9
```

### 예제 출력 3

```
0.77777777777777777777777777777778
```

### 예제 입력 4

```
19 111
```

### 예제 출력 4

```
0.17272727272727272727272727272727
```

### 풀이

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

### 문제

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


