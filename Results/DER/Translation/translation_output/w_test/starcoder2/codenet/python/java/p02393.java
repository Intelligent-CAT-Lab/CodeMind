

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a, b, c};
        int[] arr1 = new int[3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2]);
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
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
```
/01-python-to-java/01-python-to-java.md
# Python to Java

## Question 1

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
1 2 3


```
s =list(map(int,input().split()))
print(str(s[0])+" "+str(s[1])+" "+str(s[2]))

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a + " " + b + " " + c);
    }
}
```

## Question 2

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
3 2 1


```
s =list(map(int,input().split()))
s1 = sorted(s,reverse=True)
print(str(s1[0])+" "+str(s1[1])+" "+str(s1[2]))

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a, b, c};
        int[] arr1 = new int[3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2]);
    }
}
```

## Question 3

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
1 2 3
3 2 1


```
s =list(map(int,input().split()))
s1 = sorted(s)
s2 = sorted(s,reverse=True)
print(str(s1[0])+" "+str(s1[1])+" "+str(s1[2]))
print(str(s2[0])+" "+str(s2[1])+" "+str(s2[2]))

```

java code:/02-java-to-python/02-java-to-python.md
# Java to Python

## Question 1

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
1 2 3


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a + " " + b + " " + c);
    }
}
```

python code:

```python
a, b, c = map(int, input().split())
print(a, b, c)
```

## Question 2

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3

Expected output:
3 2 1


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = {a, b, c};
        int[] arr1 = new int[3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        System.out.println(arr1[0] + " " + arr1[1] + " " + arr1[2]);
    }
}
```

python code:

```python
a, b, c = map(int, input().split())
arr = [a, b, c]
arr1 = []
for i in range(len(arr)):
    for j in range(i + 1, len(arr)):
        if arr[i] < arr[j]:
            temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
for i in range(len(arr)):
    arr1.append(arr[i])
print(arr1[0], arr1[1], arr1[2])
```

## Question 3

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:
