
```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s.equals("RRR")) {
            System.out.println(3);
        } else if (s.equals("RRS") || s.equals("SRR")) {
            System.out.println(2);
        } else if (s.equals("SSS")) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
```

## 2. 1000번 A+B

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
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            System.out.println(a + b);
        }
    }
}
```

## 3. 1001번 A-B

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

### 풀이

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        System.out.println(a - b);
    }
}
```

## 4. 1002번 Towers

### 문제

There are N towers in a line. The height of the ith tower is Ai.

You have to answer Q queries. In each query, you are given two integers L and R. You have to find the number of towers between the towers with index L and R (both inclusive) such that the height of the tower is strictly greater than the height of the tower at index L-1 and strictly smaller than the height of the tower at index R+1.

### 입력

The first line of the input contains an integer N denoting the number of towers.

The second line of the input contains N space separated integers A1, A2, ..., AN denoting the heights of the towers.

The third line of the input contains an integer Q denoting the number of queries.

Each of the next Q lines contains two space separated integers L and R denoting the index of the towers in the query.

### 출력

For each query, print the answer in a new line.

### 제한

1 ≤ N, Q ≤ 105

1 ≤ Ai ≤ 109

1 ≤ L ≤ R ≤ N

### 예제 입력 1

```
5
1 2 3 4 5
3
1 5
2 4
3 5
```

### 예제 출력 1

```
3
2
1
```

### 풀이

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(s[i]);
        }
        int Q = Integer.parseInt(br.readLine());
        for (int i = 0; i < Q; i++) {
            s = br.readLine().split(" ");
            int L = Integer.parseInt(s[0]);
            int R = Integer.parseInt(s[1]);
            int cnt = 0;
            for (int j = L; j < R; j++) {
                if (A[j] > A[L - 1] && A[j] < A[R]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
```

## 5. 1003번 피보나치 함수

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

- fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
- fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
- 두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
- fibonacci(0)은 0을 출력하고, 0을 리턴한다.
- fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
- 첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
- fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.

1은 2번 출력되고, 0은 1번 출력된다. N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.

### 입력

첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.

### 출력

각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한다.

### 예제 입력 1

```
3
0
1
3
```

### 예제 출력 1
