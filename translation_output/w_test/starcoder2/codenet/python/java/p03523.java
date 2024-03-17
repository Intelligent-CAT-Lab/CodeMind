

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            String[] L = S.replaceAll("A", "*").split("\\*");
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            for (int i = 0; i < L.length; i++) {
                if (L[i].length() > X[i]) {
                    b = false;
                    break;
                }
            }
        }
        System.out.println(b ? "YES" : "NO");
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```
/ABC/ABC170/B.md
# B - Crane and Turtle

## Problem

Takahashi has a crane and a turtle.

The crane can lift x kilograms of weight, and the turtle can run y kilometers.

Takahashi wants to know if it is possible to lift a weight of w kilograms with the crane and run a distance of d kilometers with the turtle.

Determine if it is possible.

## Constraints

* 1≤x≤100
* 1≤y≤100
* 1≤w≤100
* 1≤d≤100
* All values in input are integers.

## Input

Input is given from Standard Input in the following format:

```
x y w d
```

## Output

If it is possible to lift a weight of w kilograms with the crane and run a distance of d kilometers with the turtle, print `Yes`; otherwise, print `No`.

## Sample Input 1

```
2 3 6 9
```

## Sample Output 1

```
Yes
```

The crane can lift 6 kilograms of weight, and the turtle can run 9 kilometers.

## Sample Input 2

```
1 1 1 1
```

## Sample Output 2

```
No
```

The crane can lift 1 kilogram of weight, and the turtle can run 1 kilometer.

## Note

In the first sample, the crane can lift 6 kilograms of weight, and the turtle can run 9 kilometers.

## Java  }
}
```
/ABC/ABC170/C.md
# C - Forbidden List

## Problem

Takahashi has a list of N integers.

He wants to choose an integer x from 1 to 100, inclusive, such that x is not included in the list.

Find the smallest such integer x.

## Constraints

* 1≤N≤100
* 1≤a_i≤100
* All values in input are integers.

## Input

Input is given from Standard Input in the following format:

```
N
a_1 a_2 ... a_N
```

## Output

Print the smallest integer x that satisfies the condition.

## Sample Input 1

```
3
3 14 159
```

## Sample Output 1

```
2
```

## Sample Input 2

```
2
57 57
```

## Sample Output 2

```
1
```

## Sample Input 3

```
1
100
```

## Sample Output 3

```
1
```

## Java

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 1; i <= 100; i++) {
            boolean ok = true;
            for (int j = 0; j < N; j++) {
                if (i == A[j]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                System.out.println(i);
                break;
            }
        }
    }
}
```

## Java (2)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int ans = 1;
        for (int i = 0; i < N; i++) {
            if (ans == A[i]) {
                ans++;
                i = -1;
            }
        }
        System.out.println(ans);
  /ABC/ABC170/A.md
# A - Five Variables

## Problem

There are five variables x_1,x_2,x_3,x_4,x_5.

Find the index of the variable that has the value 0.

## Constraints

* 0≤x_i≤100
* All values in input are integers.

## Input

Input is given from Standard Input in the following format:

```
x_1 x_2 x_3 x_4 x_5
```

## Output

Print the index of the variable that has the value 0.

## Sample Input 1

```
0 1 2 3 4
```

## Sample Output 1

```
1
```

## Sample Input 2

```
5 6 7 8 9
```

## Sample Output 2

```
0
```

## Sample Input 3

```
10 10 10 10 10
```

## Sample Output 3

```
0
```

## Java

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[5];
        for (int i = 0; i < 5; i++) {
            X[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (X[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```

## Java (2)

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[5];
        for (int i = 0; i < 5; i++) {
            X[i] = sc.nextIn  for (int i = 0; i < 5; i++) {
            if (X[i]
