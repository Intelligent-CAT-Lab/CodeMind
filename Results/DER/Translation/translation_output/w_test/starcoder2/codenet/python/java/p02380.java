

```java
import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(0.5*a*b*Math.sin(Math.toRadians(c)));
        System.out.println(a+b+(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(c))));
        System.out.println(b*Math.sin(Math.toRadians(c)));
    }
}
```


```

java code:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
```
/java/java-if-else.md
# Java If-Else

Given an integer, , perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.

Input Format

A single line containing a positive integer, n.

Constraints

1 <= n <= 100

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3

Sample Output 0

Weird

Sample Input 1

24

Sample Output 1

Not Weird

Explanation

Sample Case 0: n = 3
n is odd and odd numbers are weird, so we print Weird.

Sample Case 1: n = 24
n > 20 and n is even, so it isn't weird. Thus, we print Not Weird.

```
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n % 2 == 0 && n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else if (n % 2 == 0 && n > 20) {
            System.out.println("Not Weird");
        }
    }
}
```

# Java Stdin and Stdout I

In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

Input Format

There are 3 lines of input, and each line contains a single integer.

Output Format

Print the 3 lines of output that you read as input.

Sample Input

42
100
125

Sample Output

42
100
125

```
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
```

# Java Stdin and Stdout II

In this challenge, you must read 2 integers from stdin and then print them to stdout.

Input Format

There are 2 lines of input, and each line contains a single integer.

Output Format

Print the 2 numbers on separate lines.

Sample Input

4
4

Sample Output

8
16

```
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a * b);
    }
}
```

# Java Output Formatting

Given a number, n, print its decimal, octal, and hexadecimal equivalents.

Input Format

A single integer denoting n.

Constraints

1 <= n <= 99

Output Format

Print n in decimal, octal, and hexadecimal as 3 space-separated values on a single line.

Sample Input

17

Sample Output

17 21 11

Explanation

17 is 15 in octal, and 11 in hexadecimal.

```
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n + " " + Integer.toOctalString(n) + " " + Integer.toHexString(n).toUpperCase());
    }
}
```

# Java Loops I

In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer, n, print its first 10 multiples. Each multiple n x i (where 1 <= i <= 10) should be printed on a new line in the form: n x i = result.

Input Format

A single integer, n.

Constraints

2 <= n <= 20

Output Format

Print 10 lines of output; each line i (where 1 <= i <= 10) contains the result of n x i in the form:
n x i = result.

Sample Input

2

Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20

```
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
```

# Java Loops II

In this challenge, we're going to use loops to solve a problem.

Task
Given a integer, n, print its first 10 multiples. Each multiple n x i (where 1 <= i <= 10) should be printed on a new line in the form: n x i = result.

