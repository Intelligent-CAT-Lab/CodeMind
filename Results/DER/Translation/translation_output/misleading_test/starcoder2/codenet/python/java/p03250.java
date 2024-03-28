
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Integer.parseInt(c + "" + b) + a);
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
/01-basic-syntax/01-max-of-array.md
# Max of array

Write a program to find the maximum element in an array.

## Input

The first line contains an integer N, the size of the array.
The next line contains N space-separated integers A1,A2,…,AN, the elements of the array.

## Output

Output a single line containing the maximum element in the array.

## Constraints

1≤N≤100
1≤Ai≤1000

## Sample Input 1

```
5
1 2 3 4 5
```

## Sample Output 1

```
5
```

## Sample Input 2

```
4
1 3 3 7
```

## Sample Output 2

```
7
```

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
print(max(arr))
```/01-basic-syntax/02-sum-of-array.md
# Sum of array

Write a program to find the sum of all the elements in an array.

## Input

The first line contains an integer N, the size of the array.
The next line contains N space-separated integers A1,A2,…,AN, the elements of the array.

## Output

Output a single line containing the sum of the elements in the array.

## Constraints

1≤N≤100
1≤Ai≤1000

## Sample Input 1

```
5
1 2 3 4 5
```

## Sample Output 1

```
15
```

## Sample Input 2

```
4
1 3 3 7
```

## Sample Output 2

```
14
```

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
print(sum(arr))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextIn  }
}
```
t();
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
print(sum(arr))
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sc.nextInt() * n);
  /01-basic-syntax/03-sum-of-array-odd-index.md
# Sum of array odd index

Write a program to find the sum of all the elements at odd index in an array.

## Input

The first line contains an integer N, the size of the array.
The next line contains N space-separated integers A1,A2,…,AN, the elements of the array.

## Output

Output a single line containing the sum of the elements at odd index in the array.

## Constraints

1≤N≤100
1≤Ai≤1000

## Sample Input 1

```
5
1 2 3 4 5
```

## Sample Output 1

```
9
```

## Sample Input 2

```
4
1 3 3 7
```

## Sample Output 2

```
7
```

## Solution

```python
n = int(input())
arr = list(map(int, input().split()))
print(sum(arr[1::2]))
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
        for (int i = 1; i < n; i += 2) {
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
print(sum(arr[1::2]))
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
        for (int i = 1; i < n; i += 2) {
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
print(sum(arr[1::2]))
```

