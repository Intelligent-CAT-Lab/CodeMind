
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.println(n / 1 + 1 > n * Math.sqrt(2) ? n * Math.sqrt(2) : n / 1 + 1);
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
/01-01-max-of-array.md
# Max of array

Write a program to find the maximum element in an array.

## Input

The first line contains an integer ```n```, the size of the array.

The second line contains ```n``` space-separated integers ```arr[i]```, denoting the elements of the array.

## Output

Print the maximum element in the array.

## Constraints

```1 <= n <= 1000```

```-1000 <= arr[i] <= 1000```

## Sample Input 0

```
5
1 2 3 4 5
```

## Sample Output 0

```
5
```

## Explanation 0

The maximum element in the array is ```5```.

## Sample Input 1

```
4
-1 -2 -3 -4
```

## Sample Output 1

```
-1
```

## Explanation 1

The maximum element in the array is ```-1```.

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
```/01-02-sum-of-array.md
# Sum of array

Write a program to find the sum of all elements in an array.

## Input

The first line contains an integer ```n```, the size of the array.

The second line contains ```n``` space-separated integers ```arr[i]```, denoting the elements of the array.

## Output

Print the sum of all elements in the array.

## Constraints

```1 <= n <= 1000```

```-1000 <= arr[i] <= 1000```

## Sample Input 0

```
5
1 2 3 4 5
```

## Sample Output 0

```
15
```

## Explanation 0

The sum of all elements in the array is ```15```.

## Sample Input 1

```
4
-1 -2 -3 -4
```

## Sample Output 1

```
-10
```

## Explanation 1

The sum of all elements in the array is ```-10```.

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
            arr[i] = sc.nextIn  }
}
```
t();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
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
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
  /01-03-sum-of-array-odd-indices.md
# Sum of array odd indices

Write a program to find the sum of all elements at odd indices in an array.

## Input

The first line contains an integer ```n```, the size of the array.

The second line contains ```n``` space-separated integers ```arr[i]```, denoting the elements of the array.

## Output

Print the sum of all elements at odd indices in the array.

## Constraints

```1 <= n <= 1000```

```-1000 <= arr[i] <= 1000```

## Sample Input 0

```
5
1 2 3 4 5
```

## Sample Output 0

```
9
```

## Explanation 0

The sum of all elements at odd indices in the array is ```9```.

## Sample Input 1

```
4
-1 -2 -3 -4
```

## Sample Output 1

```
-6
```

## Explanation 1

The sum of all elements at odd indices in the array is ```-6```.

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
            if (i % 2 == 1) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
```
/01-04-sum-of-array-even-indices.md
# Sum of array even indices

Write a program to find the sum of all elements at even indices in an array.

## Input

The first line contains an integer ```n```, the size of the array.

The second line contains ```n``` space-separated integers ```arr[i]```,
