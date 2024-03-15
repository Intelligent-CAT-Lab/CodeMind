
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.max(a+b, Math.max(a-b, a*b)));
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

## Problem

Given an array of integers, find the maximum element in the array.

## Input

The first line of the input contains an integer ```n``` denoting the number of elements in the array.

The second line of the input contains ```n``` space-separated integers denoting the elements of the array.

## Output

Print the maximum element in the array.

## Constraints

```1 <= n <= 1000```

```-1000 <= a[i] <= 1000```

## Sample Input

```
5
1 2 3 4 5
```

## Sample Output

```
5
```

## Explanation

The maximum element in the array is ```5```.

## Solution

### Python

```python
n = int(input())
a = list(map(int, input().split()))
print(max(a))
```

### Java/02-max-of-two-numbers.md
# Max of two numbers

## Problem

Given two numbers, find the maximum of the two.

## Input

The first line of the input contains two space-separated integers ```a``` and ```b```.

## Output

Print the maximum of the two numbers.

## Constraints

```-1000 <= a, b <= 1000```

## Sample Input

```
1 2
```

## Sample Output

```
2
```

## Explanation

The maximum of the two numbers is ```2```.

## Solution

### Python

```python
a, b = map(int, input().split())
print(max(a, b))
```

### Java

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.max(a, b));
    }
}
```
/03-max-of-three-numbers.md
# Max of three numbers

## Problem

Given three numbers, find the maximum of the three.

## Input

The first line of the input contains three space-separated integers ```a```, ```b``` and ```c```.

## Output

Print the maximum of the three numbers.

## Constraints

```-1000 <= a, b, c <= 1000```

## Sample Input

```
1 2 3
```

## Sample Output

```
3
```

## Explanation

The maximum of the three numbers is ```3```.

## Solution

### Python

```python
a, b, c = map(int, input().split())
print(max(a, b, c))
```

### Java

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Math.max(a, Math.max(b, c)));
    }
}
```
/04-sum-of-array.md
# Sum of array

## Problem

Given an array of integers, find the sum of the elements in the array.

## Input

The first line of the input contains an integer ```n``` denoting the number of elements in the array.

The second line of the input contains ```n``` space-separated integers denoting the elements of the array.

## Output

Print the sum of the elements in the array.

## Constraints

```1 <= n <= 1000```

```-1000 <= a[i] <= 1000```

## Sample Input

```
5
1 2 3 4 5
```

## Sample Output

```
15
```

## Explanation

The sum of the elements in the array is ```15```.

## Solution

### Python

```python
n = int(input())
a = list(map(int, input().split()))
print(sum(a))
```

### Java

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
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
```
/05-sum-of-two-numbers.md
# Sum of two numbers

## Problem

Given two numbers, find their sum.

## Input

The first line of the input contains two space-separated integers ```a``` and ```b```.

## Output

Print the sum of the two numbers.

## Constraints

```-1000 <= a, b <= 1000```

## Sample Input

```
1 2
```

## Sample Output

```
3
```

## Explanation

The sum of the two numbers is ```3```.

## Solution

### Python

```python
a, b = map(int, input().split())
print(a + b)
```

### Java

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
/06-sum-of-three-numbers.md
# Sum of three numbers

## Problem

Given three numbers, find their sum.

## Input

The first line of the input contains three space-separated integers ```a```, ```b``` and ```c```.

## Output

Print the sum of the three numbers.

## Constraints

```-1000 <= a, b, c <= 1000```

## Sample Input

```
1 2 3
```

## Sample Output

```
6
```

## Explanation

The sum of the three numbers is ```6```.

## Solution

### Python

```python
a, b, c = map(int, input().split())
print(a + b + c)
```

### Java

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a + b + c);
    }
}
```

