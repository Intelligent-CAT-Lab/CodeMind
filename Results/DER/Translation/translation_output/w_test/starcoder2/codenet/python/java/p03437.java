

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(x % y == 0 ? x : -1);
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
/java/001-max-of-array.md
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

## Solution

```python
n = int(input())
arr = list(map(int, input().split()))
print(max(arr))
```/java/002-sum-of-array.md
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

## Alternative solution

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
        System.out.println(sum(arr));
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
```

## Alternative solution

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
        System.out.println(sum(arr, 0));
    }

    public static int sum(int[] arr, int i) {
        if (i == arr.length) {
            return 0;
        }
        return arr[i] + sum(arr, i + 1);
    }
}
```

## Alternative solution

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
        System.out.println(sum(arr, 0, 0));
    }

    public static int sum(int[] arr, int i, int sum) {
        if (i == arr.length) {
            return sum;
        }
        return sum(arr, i + 1, sum + arr[i]);
    }
}
```

## Alternative solution

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
        System.out.println(sum(arr, 0, 0));
    }

    public static int sum(int[] arr, int i, int sum) {
        if (i == arr.length) {
            return sum;
        }
        return sum(arr, i + 1, sum + arr[i]);
    }
}
```

## Alternative solution

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
        System.out.println(sum(arr, 0, 0));
    }

    public static int sum(int[] arr, int i, int sum) {
        if (i == arr.length) {
            return sum;
        }
        return sum(arr, i + 1, sum + arr[i]);
    }
}
```

## Alternative solution

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
        System.out.println(sum(arr, 0, 0));
    }

    public static int sum(int[] arr, int i, int sum) {
        if (i == arr.length) {
            return sum;
        }
        return sum(arr, i + 1, sum + arr[i]);
    }
}
```

## Alternative solution

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
        System.out.println(sum(arr, 0, 0));
    }

    public static int sum(int[] arr, int i, int sum) {
        if (i == arr.length) {
            return sum;
        }
        return sum(arr, i + 1, sum + arr[i]);
    }
}
```

## Alternative solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt
