

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ant = 1, bnt = 1, cnt = 1;
        for (int i = 0; i < n; i++) {
            ant = 10 * ant % 1000000007;
            bnt = 9 * bnt % 1000000007;
            cnt = 8 * cnt % 1000000007;
        }
        int ans = (ant - (bnt * 2 - cnt)) % 1000000007;
        if (ans >= 0) {
            System.out.println(ans);
        } else {
            System.out.println(1000000007 + ans);
        }
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```
/2020-02-24/README.md
# 2020-02-24

## 1. 10814번 나이순 정렬

### 문제

온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.

### 입력

첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)

둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다. 나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다. 입력은 가입한 순서로 주어진다.

### 출력

첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.

### 예제 입력 1

```
3
21 Junkyu
21 Dohyun
20 Sunyoung
```

### 예제 출력 1

```
20 Sunyoung
21 Junkyu
21 Dohyun
```

### 예제 입력 2

```
2
10 a
10 b
```

### 예제 출력 2

```
10 a
10 b
```

### 예제 입력 3

```
2
10 a
9 b
```

### 예제 출력 3

```
9 b
10 a
```

### 예제 입력 4

```
1
1 a
```

### 예제 출력 4

```
1 a
```

### 예제 입력 5

```
10
10 a
10 a
10 a
10 a
10 a
10 a
10 a
10 a
10 a
10 a
```

### 예제 출력 5

```
10 a
10 a
10 a
10 a
10 a
10 a
10 a
10 a
10 a
10 a
```

### 예제 입력 6

```
10
1 a
2 b
3 c
4 d
5 e
6 f
7 g
8 h
9 i
10 j
```

### 예제 출력 6

```
1 a
2 b
3 c
4 d
5 e
6 f
7 g
8 h
9 i
10 j
```

### 예제 입력 7

```
10
10 j
9 i
8 h
7 g
6 f
5 e
4 d
3 c
2 b
1 a
```

### 예제 출력 7

```
1 a
2 b
3 c
4 d
5 e
6 f
7 g
8 h
9 i
10 j
```

### 예제 입력 8

```
10
1 a
1 a
1 a
1 a
1 a
1 a
1 a
1 a
1 a
1 a
```

### 예제 출력 8

```
1 a
1 a
1 a
1 a
1 a
1 a
1 a
1 a
1 a
1 a
```

### 예제 입력 9

```
10
100 a
99 b
98 c
97 d
96 e
95 f
94 g
93 h
92 i
91 j
```

### 예제 출력 9

```
91 j
92 i
93 h
94 g
95 f
96 e
97 d
98 c
99 b
100 a
```

### 예제 입력 10

```
10
100 a
100 a
100 a
100 a
100 a
100 a
100 a
100 a
100 a
100 a
```

### 예제 출력 10

```
100 a
100 a
100 a
100 a
100 a
100 a
100 a
100 a
100 a
100 a
```

### 예제 입력 11

```
10
100 a
100 a
100 a
100 a
100 a
100 a
100 a
100 a
100 a
101 b
```

### 예제 출력 11

```
100 a
100 a
100 a
100 a
100 a
100 a
100 a
100 a
100 a
101 b
```

### 예제 입력 12

```
10
100 a
100 a
100 a
100 a
100 a
100 a
100 a
100 a
101 b
101 b
```

### 예제 출력 12

```
100 a
100 a
100 a
100 a
100 a
100 a
100 a
100 a
101 b
101 b
```

### 예제 입력 13

