

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String st = " ";
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                if (ip.charAt(i) > '4') {
                    int n = 9 - (ip.charAt(i) - '0');
                    st += n;
                } else {
                    st += ip.charAt(i);
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}
```


```

java code:

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
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
```
/01-basic-programming/01-getting-started/01-max-min-array.md
# Max and Min in an array

Given an array of integers, find the maximum and minimum element in the array.

## Input Format

The first line of input contains an integer N, denoting the number of elements in the array.

The second line of input contains N space-separated integers, denoting the elements of the array.

## Output Format

Print the maximum and minimum element in the array.

## Sample Input

```
5
1 2 3 4 5
```

## Sample Output

```
5 1
```

## Solution

python code:

```python
n = int(input())

```

java code:

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
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
```
/01-basic-programming/01-getting-started/02-max-min-array-2.md
# Max and Min in an array

Given an array of integers, find the maximum and minimum element in the array.

## Input Format

The first line of input contains an integer N, denoting the number of elements in the array.

The second line of input contains N space-separated integers, denoting the elements of the array.

## Output Format

Print the maximum and minimum element in the array.

## Sample Input

```
5
1 2 3 4 5
```

## Sample Output

```
5 1
```

## Solution

python code:

```python
n = int(input())
arr = list(map(int, input().split()))
print(max(arr), min(arr))/01-basic-programming/01-getting-started/03-max-min-array-3.md
# Max and Min in an array

Given an array of integers, find the maximum and minimum element in the array.

## Input Format

The first line of input contains an integer N, denoting the number of elements in the array.

The second line of input contains N space-separated integers, denoting the elements of the array.

## Output Format

Print the maximum and minimum element in the array.

## Sample Input

```
5
1 2 3 4 5
```

## Sample Output

```
5 1
```

## Solution

python code:

```python
n = int(input())
arr = list(map(int, input().split()))
print(max(arr), min(arr))

```

java code:

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
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
```


```

java code:

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
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
```
/01-basic-programming/01-getting-started/04-max-min-array-4.md
# Max and Min in an array

Given an array of integers, find the maximum and minimum element in the array.

## Input Format

The first line of input contains an integer N, denoting the number of elements in the array.

The second line of input contains N space-separated integers, denoting the elements of the array.

## Output Format

Print the maximum and minimum element in the array.

## Sample Input

```
5
1 2 3 4 5
```

## Sample Output

```
5 1
```

## Solution

python code:

```python
n = int(input())
arr = list(map(int, input().split()))
print(max(arr), min(arr))

```

java code:

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
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i
