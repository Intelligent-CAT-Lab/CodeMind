

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
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
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

The first line contains an integer N, the size of the array.
The next line contains N space separated integers, denoting the elements of the array.

## Output

Print the maximum element in the array.

## Constraints

1 <= N <= 100000

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

The maximum element in the array is 5.

## Solution

```python
n = int(input())
arr = list(map(int, input().split()))
print(max(arr))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
```

## Solution 2

```python
n = int(input())
arr = list(map(int, input().split()))
max = arr[0]
for i in range(1, n):
    if arr[i] > max:
        max = arr[i]
print(max)
```/02-sum-of-array.md
# Sum of array

Write a program to find the sum of all the elements in an array.

## Input

The first line contains an integer N, the size of the array.
The next line contains N space separated integers, denoting the elements of the array.

## Output

Print the sum of all the elements in the array.

## Constraints

1 <= N <= 100000

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

The sum of all the elements in the array is 15.

## Solution

```python
n = int(input())
arr = list(map(int, input().split()))
print(sum(arr))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

## Solution 2

```python
n = int(input())
arr = list(map(int, input().split()))
sum = 0
for i in range(n):
    sum += arr[i]
print(sum)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
}
```
      int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

## Solution 3

```python
n = int(input())
arr = list(map(int, input().split()))
sum = 0
for i in arr:
    sum += i
print(sum)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

## Solution 4

```python
n = int(input())
arr = list(map(int, input().split()))
sum = 0
for i in range(len(arr)):
    sum += arr[i]
print(sum)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

## Solution 5

```python
n = int(input())
arr = list(map(int, input().split()))
sum = 0
for i in range(0, n):
    sum += arr[i]
print(sum)
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
  /03-sum-of-array-elements-at-even-positions.md
# Sum of array elements at even positions

Write a program to find the sum of all the elements in an array at even positions.

## Input

The first line contains an integer N, the size of the array.
The next line contains N space separated integers, denoting the elements of the array.

## Output

Print the sum of all the elements in the array at even positions.

## Constraints

1 <= N <= 100000

## Sample Input

```
5
1 2 3 4 5
```

## Sample Output

```
6
```

## Explanation

The sum of all the elements in the array at even positions is 2 + 4 = 6.

## Solution

```python
n = int(input())
arr = list(map(int, input().split()))
sum = 0

