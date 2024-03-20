

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double a = Math.ceil(C/A);
        double s = 7*A+B;
        double t = C/s;
        double u = C-s*t;
        double v = Math.ceil(u/A);
        double b;
        if(v<=7){
            b = 7*t+v;
        }else{
            b = 7*t+7;
        }
        if(a>b){
            System.out.println((int)b);
        }else{
            System.out.println((int)a);
        }
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(int i=0;i<s.length()-2;i++){
            if(s.substring(i,i+3).equals("bob")){
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(int i=0;i<s.length()-2;i++){
            if(s.substring(i,i+3).equals("bob")){
                count++;
            }
        }
        System.out.println(count);
    }
}
```


```

Expected output:

```
1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(a==1){
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(int i=0;i<s.length()-2;i++){
            if(s.substring(i,i+3).equals("bob")){
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbob
```

Expected output:

```
3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(int i=0;i<s.length()-2;i++){
            if(s.substring(i,i+3).equals("bob")){
                count++;
            }
        }
        System.out.println(count);
    }
}
```
/2019/04/04.md
# 2019/04/04

## 1.

Write a program that reads an integer N and prints the number of ones in the binary representation of N.

Test input:

```
10
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            if(n%2==1){
                count++;
            }
            n/=2;
        }
        System.out.println(count);
    }
}
```

## 2.

Write a program that reads an integer N and prints the number of ones in the binary representation of N.

Test input:

```
10
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            if(n%2==1){
                count++;
            }
            n/=2;
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that reads an integer N and prints the number of ones in the binary representation of N.

Test input:

```
10
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            if(n%2==1){
                count++;
            }
            n/=2;
        }
        System.out.println(count);
    }
}
```

## 4.

Write a program that reads an integer N and prints the number of ones in the binary representation of N.

Test input:

```
10
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            if(n%2==1){
                count++;
            }
            n/=2;
        }
        System.out.println(count);
    }
}
```

## 5.

Write a program that reads an integer N and prints the number of ones in the binary representation of N.

Test input:

```
10
```

Expected output:

```
2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            if(n%2==1){
                count++;
            }
           
