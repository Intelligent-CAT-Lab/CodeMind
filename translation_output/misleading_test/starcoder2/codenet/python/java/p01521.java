
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.charAt(0) == 'x' && s.charAt(s.length() - 1) == 'x' ? 'x' : 'o');
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
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```
/01-max-of-array.md
# Max of array

Write a program to find the maximum element in an array.

## Input

The first line contains an integer ```n```, the size of the array.

The second line contains ```n``` space-separated integers ```a[i]```, the elements of the array.

## Output

Print the maximum element in the array.

## Constraints

```1 <= n <= 1000```

```-1000 <= a[i] <= 1000```

## Sample Input 0

```
5
1 2 3 4 5
```

## Sample Output 0

```
5
```

## Sample Input 1

```
4
-1 -2 -3 -4
```

## Sample Output 1

```
-1
```

## Explanation

In the first sample, the maximum element is ```5```.

In the second sample, the maximum element is ```-1```.

## Solution

```python
n = int(input())
a = list(map(int, input().split()))
print(max(a))
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
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```/02-max-of-two-numbers.md
# Max of two numbers

Write a program to find the maximum of two numbers.

## Input

The first line contains an integer ```a```.

The second line contains an integer ```b```.

## Output

Print the maximum of the two numbers.

## Constraints

```-1000 <= a, b <= 1000```

## Sample Input 0

```
1
2
```

## Sample Output 0

```
2
```

## Sample Input 1

```
-1
-2
```

## Sample Output 1

```
-1
```

## Explanation

In the first sample, the maximum of the two numbers is ```2```.

In the second sample, the maximum of the two numbers is ```-1```.

## Solution

```python
a = int(input())
b = int(input())
print(max(a, b))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a > b ? a : b);
    }
}
```

## Bonus

Write a program to find the maximum of three numbers.

## Input

The first line contains an integer ```a```.

The second line contains an integer ```b```.

The third line contains an integer ```c```.

## Output

Print the maximum of the three numbers.

## Constraints

```-1000 <= a, b, c <= 1000```

## Sample Input 0

```
1
2
3
```

## Sample Output 0

```
3
```

## Sample Input 1

```
-1
-2
-3
```

## Sample O  int c = sc.nextInt();
        System.out.println(a > b ? (a > c ? a : c) : (b > c ? b : c));
    }
}
```
utput 1

```
-1
```

## Explanation

In the first sample, the maximum of the three numbers is ```3```.

In the second sample, the maximum of the three numbers is ```-1```.

## Solution

```python
a = int(input())
b = int(input())
c = int(input())
print(max(a, b, c))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a > b ? (a > c ? a : c) : (b > c ? b : c));
    }
}
```

## Bonus

Write a program to find the maximum of four numbers.

## Input

The first line contains an integer ```a```.

The second line contains an integer ```b```.

The third line contains an integer ```c```.

The fourth line contains an integer ```d```.

## Output

Print the maximum of the four numbers.

## Constraints

```-1000 <= a, b, c, d <= 1000```

## Sample Input 0

```
1
2
3
4
```

## Sample Output 0

```
4
```

## Sample Input 1

```
-1
-2
-3
-4
```

## Sample Output 1

```
-1
```

## Explanation

In the first sample, the maximum of the four numbers is ```4```.

In the second sample, the maximum of the four numbers is ```-1```.

## Solution

```python
a = int(input())
b = int(input())
c = int(input())
d = int(input())
print(max(a, b, c, d))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(a > b ? (a > c ? (a > d ? a : d) : (c > d ? c : d)) : (b > c ? (b > d ? b : d) : (c > d ? c : d)));
    }
}
```

## Bonus

Write a program to find the maximum of five numbers.

## Input

The first line contains an integer ```a```.

The second line contains an integer ```b```.

The third line contains an integer ```c```.

The fourth line contains an integer ```d```.

The fifth line contains an integer ```e```.

## Output

Print the maximum of the five numbers.

## Constraints

```-1000 <= a, b, c, d, e <= 1000```

## Sample Input 0

```
1
2
3
4
5
```

## Sample Output 0

```
5
```
