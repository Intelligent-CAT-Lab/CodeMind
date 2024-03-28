
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (n+1)/2;
        System.out.println(a);
    }
}
```

## Question 2

Write a program to print the following pattern:

```
*
**
***
****
*****
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

## Question 3

Write a program to print the following pattern:

```
*****
****
***
**
*
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

## Question 4

Write a program to print the following pattern:

```
*
**
***
****
*****
****
***
**
*
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

## Question 5

Write a program to print the following pattern:

```
*
**
***
****
*****
****
***
**
*
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

## Question 6

Write a program to print the following pattern:

```
*
**
***
****
*****
****
***
**
*
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

## Question 7

Write a program to print the following pattern:

```
*
**
***
****
*****
****
***
**
*
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

## Question 8

Write a program to print the following pattern:

```
*
**
***
****
*****
****
***
**
*
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

## Question 9

Write a program to print the following pattern:

```
*
**
***
****
*****
****
***
**
*
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

## Question 10

Write a program to print the following pattern:

```
*
**
***
****
*****
****
***
**
*
```

java code:
```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```


## Question 10

Write a program to print the following pattern:

```
*
**
***
****
*****
****
***
**
*
```

python code:
```python
for i in range(1, 6):
    for j in range(1, i+1):
        print("*", end="")
    print()
for i in range(4, 0, -1):
    for j in range(1, i+1):
        print("*", end="")
    print()
```
# Python Programming

## Question 1

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
-2

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (n+1)/2;
        System.out.println(a);
    }
}
```

python code:
```python
n = int(input())
a = (n+1)/2
print(int(a))
```

## Question 2

Write a program to print the following pattern:

```
*
**
***
****
*****
```

python code:
```python
for i in range(1, 6):
    for j in range(1, i+1):
        print("*", end="")
    print()
```

## Question 3

Write a program to print the following pattern:

```
*****
****
***
**
*
```

python code:
```python
for i in range(5, 0, -1):
    for j in range(1, i+1):
        print("*", end="")
    print()
```

## Question 4

Write a program to print the following pattern:
