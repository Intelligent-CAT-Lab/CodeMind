

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int X = sc.nextInt();
        for(int i = Math.max(X-K+1, -1000000); i < Math.min(X+K, 1000000); i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
azcbobobegghakl
```

the output should be:

```
Number of times bob occurs is: 2
```

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i = 0; i < s.length() - 2; i++) {
            if(s.substring(i, i+3).equals("bob")) {
                count++;
            }
        }
        System.out.println("Number of times bob occurs is: " + count);
    }
}
```

## 3.

Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

```
Longest substring in alphabetical order is: abc
```

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        String current = "";
        for(int i = 0; i < s.length(); i++) {
            if(i == 0 || s.charAt(i) >= s.charAt(i-1)) {
                current += s.charAt(i);
            } else {
                if(current.length() > longest.length()) {
                    longest = current;
                }
                current = "" + s.charAt(i);
            }
        }
        if(current.length() > longest.length()) {
            longest = current;
        }
        System.out.println("Longest substring in alphabetical order is: " + longest);
    }
}
```


```

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int max_index = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
                max_index = i;
            }
        }
        System.out.println(max_index);
    }
}
```

## 2.

Write a program that prints the sum of the numbers in the list, followed by the final number. So the code:

```
print_sum_end([4, 3, 6])
```

should output:

```
13
6
```

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println(arr[n-1]);
    }
}
```

## 3.

Write a program that prints the largest element in the list and its index. If the highest element does not appear only once, print its last appearance. If the list is empty, print "List is empty".

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(n == 0) {
            System.out.println("List is empty");
            return;
        }
        int max = 0;
        int max_index = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
                max_index = i;
            }
        }
        System.out.println(max);
        System.out.println(max_index);
    }
}
```
/Week 2/Week 2.md
# Week 2

## 1.

Write a program that prints the index of the first occurrence of the largest element in a list. If the highest element does not appear only once, print its first appearance. If the list is empty, print "List is empty".

```
print_max_index([1, 2, 3, 4, 5])
```

should output:

```
4
```

```
print_max_index([7, 7, 7, 7, 7, 7, 7])
```

should
