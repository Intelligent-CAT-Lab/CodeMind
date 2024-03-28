

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Set<Integer> setl = new HashSet<Integer>();
        setl.add(k);
        setl.add(k-1);
        for(int x = 2; x <= Math.sqrt(k); x++)
        {
            check(x, k, setl);
            check(k/x, k, setl);
        }
        if(setl.contains(1))
        {
            setl.remove(1);
        }
        System.out.println(setl.size());
    }
    public static void check(int i, int k, Set<Integer> setl)
    {
        int tot = k;
        while(tot%i == 0)
        {
            tot /= i;
        }
        if(tot%i == 1)
        {
            setl.add(i);
        }
    }
}
```

## 2.

Write a program to find the sum of all the numbers in a given string.

```
Input:
12345

Output:
15
```

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            sum += s.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the sum of all the numbers in a given string.

```
Input:
12345

Output:
15
```

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            sum += s.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program to find the sum of all the numbers in a given string.

```
Input:
12345

Output:
15
```

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            sum += s.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program to find the sum of all the numbers in a given string.

```
Input:
12345

Output:
15
```

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            sum += s.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program to find the sum of all the numbers in a given string.

```
Input:
12345

Output:
15
```

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            sum += s.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program to find the sum of all the numbers in a given string.

```
Input:
12345

Output:
15
```

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            sum += s.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program to find the sum of all the numbers in a given string.

```
Input:
12345

Output:
15
```

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            sum += s.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program to find the sum of all the numbers in a given string.

```
Input:
12345

Output:
15
```

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            sum += s.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program to find the sum of all the numbers in a given string.

```
Input:
12345

Output:
15
```

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
        {
            sum += s.
