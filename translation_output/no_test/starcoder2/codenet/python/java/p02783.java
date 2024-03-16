
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int A = sc.nextInt();
        System.out.println(Math.ceil(H/A));
    }
}
```

## 1000번

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

### 힌트

### 출처
- 문제를 만든 사람: baekjoon
- 잘못된 데이터를 찾은 사람: djm03178
- 문제의 오타를 찾은 사람: djm03178

### 알고리즘 분류
- 수학
- 사칙연산

### 풀이

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A+B);
    }
}
```

## 1001번

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
5 50
```

### 예제 출력 2
```
-45
```

### 예제 입력 3
```
-7 42
```

### 예제 출력 3
```
-49
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
3
```

### 힌트

### 출처
- 문제를 만든 사람: baekjoon
- 잘못된 데이터를 찾은 사람: djm03178
- 문제의 오타를 찾은 사람: djm03178

### 알고리즘 분류
- 수학
- 사칙연산

### 풀이

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(A-B);
    }
}
```

## 1002번

### 문제
조규현과 백승환은 터렛에 근무하는 직원이다. 하지만 워낙 존재감이 없어서 인구수는 차지하지 않는다. 다음은 조규현과 백승환의 사진이다.

이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.

조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때, 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.

### 입력
첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 다음과 같이 구성되어있다.

한 줄에 x1, y1, r1, x2, y2, r2가 주어진다. x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고, r1, r2는 10,000보다 작거나 같은 자연수이다.

### 출력
각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다. 만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.

### 예제 입력 1
```
3
0 0 13 40 0 37
0 0 3 0 7 4
1 1 1 1 1 5
```

### 예제 출력 1
```
2
1
0
```

### 힌트

### 출처
- 문제를 만든 사람: baekjoon
- 잘못된 데이터를 찾은 사람: djm03178
- 문제의 오타를 찾은 사람: djm03178

### 알고리즘 분류
- 수학
- 기하학

### 풀이

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            int d = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
            int r = (r1+r2)*(r1+r2);
            int R = (r1-r2)*(r1-r2);
            if (d == 0 && r1 == r2) {
                System.out.println(-1);
            } else if (d == r || d == R) {
                System.out.println(1);
            } else if (d < r && d > R) {
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }
    }
}
```

## 1003번

### 문제
다음 소스는 N번째 피보나치 수를 구하는 C++ 함수이다.

```
int fibonacci(int n) {
    if (n == 0) {
        printf("0");
        return 0;
    } else if (n == 1) {
        printf("1");
        return 1;
    } else {
        return fibonacci(n‐1) + fibonacci(n‐2);
    }
}
```

fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.
