

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int T = sc.nextInt();
        int ans = (T / A) * B;
        System.out.println(ans);
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
        int N = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
```
/01_Introduction/01_Introduction/01_Introduction.md
# Introduction

## 1. Hello World

Write a program that prints "Hello World" to the standard output.

```
print ( "Hello World" )
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

## 2. Hello HackerRank

Write a program that prints "Hello World" to the standard output.

```
print ( "Hello World" )
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

## 3. Python If-Else

Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird

```
n = int ( input ( ) )
if n % 2 == 1:
    print ( "Weird" )
else:
    if n >= 2 and n <= 5:
        print ( "Not Weird" )
    elif n >= 6 and n <= 20:
        print ( "Weird" )
    else:
        print ( "Not Weird" )
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }
}
```

## 4. Arithmetic Operators

Read two integers from STDIN and print three lines where:

The first line contains the sum of the two numbers.
The second line contains the difference of the two numbers (first - second).
The third line contains the product of the two numbers.

```
a = int ( input ( ) )
b = int ( input ( ) )
print ( a + b )
print ( a - b )
print ( a * b )
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
    }
}
```

## 5. Python: Division

Read two integers and print two lines. The first line should contain integer division, a//b. The second line should contain float division, a/b.

You don't need to perform any rounding or formatting operations.

```
a = int ( input ( ) )
b = int ( input ( ) )
print ( a // b )
print ( a / b )
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a / b);
        System.out.println((double) a / b);
    }
}
```

## 6. Loops

Read an integer N. For all non-negative integers i<N, print i^2. See the sample for details.

```
n = int ( input ( ) )
for i in range ( n ):
    print ( i * i )
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i * i);
        }
    }
}
```

## 7. Write a function

Write a function

```
is_leap(year)
```

that takes a year, and returns True if it is a leap year. Otherwise, it should return False.

Note that the code stub provided reads from STDIN and passes arguments to the is_leap function. It is only necessary to complete the is_leap function.

```
def is_leap(year):
    leap = False
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                leap = True
            else:
                leap = False
        else:
            leap = True
    else:
        leap = False
    return leap

year = int(input())
print(is_leap(year))
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static boolean is_leap(int year) {
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }
        return leap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(is_leap(year));
    }
}
```

## 8. Print Function

Read an integer N.

Without using any string methods, try to print the following:

123...N

Note that "..." represents the values in between.

```
n = int ( input ( ) )
for i in range ( 1 , n + 1 ):
    print ( i , end = '' )
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
        }
    }
}
```

## 9. List Comprehensions

Let's learn about list comprehensions! You are given three integers X, Y and Z representing the dimensions of a cuboid along with an integer N. You have to print a list of all possible coordinates given by (i,j,k) on a 3D grid where the sum of i+j+k is not equal to N. Here, 0<=i<=X; 0<=j<=Y; 0<=k<=Z.

```
if __name__ == '__main__':
    x = int(input())
    y
