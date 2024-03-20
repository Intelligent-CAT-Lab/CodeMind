
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

Hello World

Expected output:

Vowels: 3
Consonants: 7

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
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
                vowels++;
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                consonants++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
```

## 3.

Write a program that reads a string and prints the number of occurrences of each character in the string.

Test input:

Hello World

Expected output:

H: 1
e: 1
l: 3
o: 2
W: 1
r: 1
d: 1

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
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++)
        {
            if(freq[i] != 0)
                System.out.println((char)(i + 'a') + ": " + freq[i]);
        }
    }
}
```

## 4.

Write a program that reads a string and prints the number of occurrences of each word in the string.

Test input:

Hello World

Expected output:

Hello: 1
World: 1

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
        String[] words = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++)
        {
            if(map.containsKey(words[i]))
                map.put(words[i], map.get(words[i]) + 1);
            else
                map.put(words[i], 1);
        }
        for(String key : map.keySet())
        {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
```

## 5.

Write a program that reads a string and prints the number of occurrences of each word in the string.

Test input:

Hello World

Expected output:

Hello: 1
World: 1

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
        String[] words = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++)
        {
            if(map.containsKey(words[i]))
                map.put(words[i], map.get(words[i]) + 1);
            else
                map.put(words[i], 1);
        }
        for(String key : map.keySet())
        {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
```

## 6.

Write a program that reads a string and prints the number of occurrences of each word in the string.

Test input:

Hello World

Expected output:

Hello: 1
World: 1

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
        String[] words = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++)
        {
            if(map.containsKey(words[i]))
                map.put(words[i], map.get(words[i]) + 1);
            else
                map.put(words[i], 1);
        }
        for(String key : map.keySet())
        {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
```

## 7.

Write a program that reads a string and prints the number of occurrences of each word in the string.

Test input:

Hello World

Expected output:

Hello: 1
World: 1

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
        String[] words = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++)
        {
            if(map.containsKey(words[i]))
                map.put(words[i], map.get(words[i]) + 1);
            else
                map.put(words[i], 1);
        }
        for(String key : map.keySet())
        {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
```

## 8.

Write a program that reads a string and prints the number of occurrences of each word in the string.

Test input:

Hello World

Expected output:

Hello:
