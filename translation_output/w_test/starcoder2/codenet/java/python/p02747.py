

```python
S = input()

ans = "Yes"

if len(S) % 2 == 1:
    ans = "No"
else:
    for i in range(0, len(S), 2):
        if S[i:i+2] != "hi":
            ans = "No"

print(ans)
```

## p02748

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
55


```
import java.util.*;

public class p02748 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] dp = new int[N+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=N;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[N]);

    }

}








```

python code:

```python
N = int(input())

dp = [0] * (N+1)

dp[0] = 0
dp[1] = 1

for i in range(2, N+1):
    dp[i] = dp[i-1] + dp[i-2]

print(dp[N])
```

## p02749

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000

Expected output:
166666666667


```
import java.util.*;

public class p02749 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long[] dp = new long[N+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=N;i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 1000000;
        }

        System.out.println(dp[N]);

    }

}








```

python code:

```python
N = int(input())

dp = [0] * (N+1)

dp[0] = 0
dp[1] = 1

for i in range(2, N+1):
    dp[i] = (dp[i-1] + dp[i-2]) % 1000000

print(dp[N])
```

## p02750

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5
5
2
3
4
1

Expected output:
1
2
3
4
5


```
import java.util.*;

public class p02750 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i=0;i<N;i++){
            System.out.println(arr[i]);
        }

    }

}








```

python code:

```python
N = int(input())

arr = []

for i in range(N):
    arr.append(int(input()))

arr.sort()

for i in range(N):
    print(arr[i])
```

## p02751

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5
5
2
3
4
1

Expected output:
1
2
3
4
5


```
import java.util.*;

public class p02751 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i=0;i<N;i++){
            System.out.println(arr[i]);
        }

    }

}








```

python code:

```python
N = int(input())

arr = []

for i in range(N):
    arr.append(int(input()))

arr.sort()

for i in range(N):
    print(arr[i])
```

## p02752

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1 2

Expected output:
1 2 3


```
import java.util.*;

public class p02752 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[3];

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        Arrays.sort(arr);

        for(int i=0;i<3;i++){
            System.out.print(arr[i] + " ");
        }

    }

}








```

python code:

```python
a, b, c = map(int, input().split())

arr = [a, b, c]

arr.sort()

for i in range(3):
    print(arr[i], end=" ")
```

## p02753

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2000

Expected output:
1


```
import java.util.*;

public class p02753 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N % 4 == 0 && N % 100 != 0 || N % 400 == 0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

}








```

python code:

```python
N = int(input())

if N % 4 == 0 and N % 100 != 0 or N % 400 == 0:
    print(1)
else:
    print(0)
```

## p02754

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
A+

Expected output:
4.3


```
import java.util.*;

public class p02754 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        double ans = 0;

        if(S.equals("A+")){
            ans = 4.3;
        } else if(S.equals("A0")){
            ans = 4.0;
        } else if(S.equals("A-")){
           
