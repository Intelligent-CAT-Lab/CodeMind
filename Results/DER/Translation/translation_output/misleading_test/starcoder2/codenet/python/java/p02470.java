

```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rn = (int)Math.sqrt(n);
        int[] sieve = new int[rn+1];
        Arrays.fill(sieve, 1);
        for(int i=2; i<=rn; i++){
            int j = i*2;
            while(j<=rn){
                sieve[j] = 0;
                j += i;
            }
        }
        ArrayList<Integer> p = new ArrayList<Integer>();
        for(int i=2; i<=rn; i++){
            if(sieve[i] == 1){
                p.add(i);
            }
        }
        int ans = n;
        for(int q: p){
            if(n%q == 0){
                ans = ans*(q-1)/q;
                while(n%q == 0){
                    n /= q;
                }
            }
        }
        if(n>1){
            ans = ans*(n-1)/n;
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        File file = new File(filename);
        Scanner sc2 = new Scanner(file);
        int sum = 0;
        while(sc2.hasNextInt()){
            sum += sc2.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        File file = new File(filename);
        Scanner sc2 = new Scanner(file);
        int sum = 0;
        while(sc2.hasNextInt()){
            sum += sc2.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        File file = new File(filename);
        Scanner sc2 = new Scanner(file);
        int sum = 0;
        while(sc2.hasNextInt()){
            sum += sc2.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        File file = new File(filename);
        Scanner sc2 = new Scanner(file);
        int sum = 0;
        while(sc2.hasNextInt()){
            sum += sc2.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        File file = new File(filename);
        Scanner sc2 = new Scanner(file);
        int sum = 0;
        while(sc2.hasNextInt()){
            sum += sc2.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        File file = new File(filename);
        Scanner sc2 = new Scanner(file);
        int sum = 0;
        while(sc2.hasNextInt()){
            sum += sc2.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        File file = new File(filename);
        Scanner sc2 = new Scanner(file);
        int sum = 0;
        while(sc2.hasNextInt()){
            sum += sc2.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        File file = new File(filename);
        Scanner sc2 = new Scanner(file);
        int sum = 0;
        while(sc2.hasNextInt()){
            sum += sc2.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        File file = new File(filename);
        Scanner sc2 = new Scanner(file);
        int sum = 0;
        while(sc2.hasNextInt()){
            sum += sc2.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 11.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();
        File file = new File(filename);
        Scanner sc2 = new Scanner(file);
        int sum = 0;
        while(sc2.hasNextInt()){
            sum += sc2.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 12.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.*;
import java.util.*;

class Main
{
    public static void main (String[] args
