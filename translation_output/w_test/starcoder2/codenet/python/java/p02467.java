

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
        System.out.print(n + ": ");
        for(int i = 2; i <= n; i++)
        {
            while(n % i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }
        System.out.println();
    }
}
```

## 2.

Write a program that reads a string and prints the number of vowels and consonants in the string.

Test input:

```
Hello World
```

Expected output:

```
Vowels: 3
Consonants: 7
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
        int vowels = 0, consonants = 0;
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                vowels++;
            else if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                consonants++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
```

## 3.

Write a program that reads a string and prints the number of words in the string.

Test input:

```
Hello World
```

Expected output:

```
2
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
        int words = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ')
                words++;
        }
        System.out.println(words + 1);
    }
}
```

## 4.

Write a program that reads a string and prints the number of digits in the string.

Test input:

```
Hello World 123
```

Expected output:

```
3
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
        int digits = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                digits++;
        }
        System.out.println(digits);
    }
}
```

## 5.

Write a program that reads a string and prints the number of uppercase letters in the string.

Test input:

```
Hello World
```

Expected output:

```
2
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
        int upper = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                upper++;
        }
        System.out.println(upper);
    }
}
```

## 6.

Write a program that reads a string and prints the number of lowercase letters in the string.

Test input:

```
Hello World
```

Expected output:

```
8
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
        int lower = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                lower++;
        }
        System.out.println(lower);
    }
}
```

## 7.

Write a program that reads a string and prints the number of special characters in the string.

Test input:

```
Hello World!
```

Expected output:

```
1
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
        int special = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) >= '!' && s.charAt(i) <= '/' || s.charAt(i) >= ':' && s.charAt(i) <= '@' || s.charAt(i) >= '[' && s.charAt(i) <= '`' || s.charAt(i) >= '{' && s.charAt(i) <= '~')
                special++;
        }
        System.out.println(special);
    }
}
```

## 8.

Write a program that reads a string and prints the number of spaces in the string.

Test input:

```
Hello World
```

Expected output:

```
1
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
        int spaces = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == ' ')
                spaces++;
        }
        System.out.println(spaces);
    }
}
```

## 9.

Write a program that reads a string and prints the number of punctuation marks in the string.

Test input:

```
Hello World!
```

Expected output:

```
1
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
        int punct = 0;
        for
