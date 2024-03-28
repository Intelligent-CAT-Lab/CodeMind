

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a < b ? 0 : 10);
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == k) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
```
/java/2021-04-26-java-2d-array.md
---
layout: default
title: 2D Array
parent: Java
nav_order: 1
---

# 2D Array

## Problem

Given a 2D array of size NxM. Find the number of times the given number K occurs in the array.

## Input Format

The first line contains three integers N, M and K.

The next N lines contain M integers each.

## Output Format

Print the number of times K occurs in the array.

## Sample Input

```
3 4 5
1 2 3 4
5 6 7 8
9 10 11 12
```

## Sample Output

```
1
```

## Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == k) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
```

## Explanation

The first line contains three integers N, M and K.

The next N lines contain M integers each.

We create a 2D array of size NxM and store the values in it.

We then iterate over the array and check if the value at each index is equal to K.

If it is, we increment the sum variable by 1.

Finally, we print the value of sum.

## Sample Input

```
3 4 5
1 2 3 4
5 6 7 8
9 10 11 12
```

## Sample Output

```
1
```

## Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == k) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
```

## Explanation

The first line contains three integers N, M and K.

The next N lines contain M integers each.

We create a 2D array of size NxM and store the values in it.

We then iterate over the array and check if the value at each index is equal to K.

If it is, we increment the sum variable by 1.

Finally, we print the value of sum.

## Sample Input

```
3 4 5
1 2 3 4
5 6 7 8
9 10 11 12
```

## Sample Output

```
1
```

## Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == k) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
```

## Explanation

The first line contains three integers N, M and K.

The next N lines contain M integers each.

We create a 2D array of size NxM and store the values in it.

We then iterate over the array and check if the value at each index is equal to K.

If it is, we increment the sum variable by 1.

Finally, we print the value of sum.

## Sample Input

```
3 4 5
1 2 3 4
5 6 7 8
9 10 11 12
```

## Sample Output

```
1
```

## Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == k) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
```

## Explanation

The first line contains three integers N, M and K.

The next N lines contain M integers each.

We create a 2D array of size NxM and store the values in it.

We then iterate over the array and check if the value at each index is equal to K.

If it is, we increment the sum variable by 1.

Finally, we print the value of sum.

## Sample Input

```
3 4 5
1 2 3 4
5 6 7 8
9 10 11 12
```

## Sample Output

```
1
```

## Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k
