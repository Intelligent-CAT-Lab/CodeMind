
```

```


```
/solutions/1000.md
# 1000. A+B Problem

## Problem

Your task is to calculate the sum of some integers.

## Input

Input contains an integer N in the first line, and then N lines follow. Each line starts with a integer M, and then M integers follow in the same line.

## Output

For each group of input integers you should output their sum in one line, and you must note that there is a blank line between outputs.

## Sample Input

```
2
4 1 2 3 4
5 1 2 3 4 5
```

## Sample Output

```
10

15
```

## Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
            if (i != n - 1) {
                System.out.println();
            }
        }
    }
}/solutions/1001.md
# 1001. A+B Problem II

## Problem

Your task is to calculate the sum of some integers.

## Input

Input contains an integer N in the first line, and then N lines follow. Each line starts with a integer M, and then M integers follow in the same line.

## Output

For each group of input integers you should output their sum in one line, and you must note that there is a blank line between outputs.

## Sample Input

```
2
4 1 2 3 4
5 1 2 3 4 5
```

## Sample Output

```
10

15
```

## Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
            if (i != n - 1) {
                System.out.println();
            }
        }
    }
}

```
/solutions/1002.md
# 1002. A+B Problem III

## Problem

Your task is to calculate the sum of some integers.

## Input

Input contains an integer N in the first line, and then N lines follow. Each line starts with a integer M, and then M integers follow in the same line.

## Output

For each group of input integers you should output their sum in one line, and you must note that there is a blank line between outputs.

## Sample Input

```
2
4 1 2 3 4
5 1 2 3 4 5
```

## Sample Output

```
10

15
```

## Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
            if (i != n - 1) {
                System.out.println();
            }
        }
    }
}

```


## Sample Input

```
1 2 3 4 5
```

## Sample Output

```
15
```

## Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}

```
/solutions/1003.md
# 1003. A+B Problem IV

## Problem

Your task is to calculate the sum of some integers.

## Input

Input contains an integer N in the first line, and then N lines follow. Each line starts with a integer M, and then M integers follow in the same line.

## Output

For each group of input integers you should output their sum in one line, and you must note that there is a blank line between outputs.

## Sample Input

```
2
4 1 2 3 4
5 1 2 3 4 5
```

## Sample Output

```
10

15
```
