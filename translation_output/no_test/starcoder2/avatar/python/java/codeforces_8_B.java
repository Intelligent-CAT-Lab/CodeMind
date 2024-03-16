
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        Set<String> coord = new HashSet<>();
        coord.add("0,0");
        String[] temp = {"0","0"};
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i) == 'L'){
                temp[1] = String.valueOf(Integer.parseInt(temp[1]) - 1);
            }else if(path.charAt(i) == 'R'){
                temp[1] = String.valueOf(Integer.parseInt(temp[1]) + 1);
            }else if(path.charAt(i) == 'U'){
                temp[0] = String.valueOf(Integer.parseInt(temp[0]) - 1);
            }else{
                temp[0] = String.valueOf(Integer.parseInt(temp[0]) + 1);
            }
            if(coord.contains(temp[0] + "," + temp[1])){
                System.out.println("BUG");
                return;
            }
            coord.add(temp[0] + "," + temp[1]);
        }
        coord.remove("0,0");
        Queue<String> que = new LinkedList<>();
        que.add("0,0");
        while(!que.isEmpty()){
            if(que.size() > 1){
                System.out.println("BUG");
                return;
            }
            String[] temp2 = que.poll().split(",");
            int i = Integer.parseInt(temp2[0]);
            int j = Integer.parseInt(temp2[1]);
            for(int[] p : new int[][]{{i + 1, j}, {i - 1, j}, {i, j + 1}, {i, j - 1}}){
                if(coord.contains(p[0] + "," + p[1])){
                    coord.remove(p[0] + "," + p[1]);
                    que.add(p[0] + "," + p[1]);
                }
            }
        }
        System.out.println("OK");
    }
}
```
/2019-09-16/README.md
# 2019-09-16

## 1. 1000번

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
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
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

### 풀이

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println((double)A / B);
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

###
