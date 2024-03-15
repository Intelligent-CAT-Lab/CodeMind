
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        double h = x/Math.pow(a,2);
        double ans;
        if(h>=b/2){
            double V = 2*((Math.pow(a,2)*b - x)/Math.pow(a,3));
            ans = Math.toDegrees(Math.atan(V));
        }
        else{
            double V = a*(Math.pow(b,2))/(2*x);
            ans = Math.toDegrees(Math.atan(V));
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a program that takes a number and prints its digits from left to right and then from right to left.

```
Sample Input:
123456789

Sample Output:
1 2 3 4 5 6 7 8 9
9 8 7 6 5 4 3 2 1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while(temp!=0){
            temp = temp/10;
            count++;
        }
        int[] arr = new int[count];
        for(int i=0;i<count;i++){
            arr[i] = n%10;
            n = n/10;
        }
        for(int i=0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=count-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
```

## 3.

Write a program that takes a number and determines whether it is a palindrome or not. Print 1 if it is a palindrome, otherwise print 0.

```
Sample Input 1:
121

Sample Output 1:
1

Sample Input 2:
123

Sample Output 2:
0
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while(temp!=0){
            temp = temp/10;
            count++;
        }
        int[] arr = new int[count];
        for(int i=0;i<count;i++){
            arr[i] = n%10;
            n = n/10;
        }
        int flag = 0;
        for(int i=0;i<count;i++){
            if(arr[i]!=arr[count-i-1]){
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
```

## 4.

Write a program that takes a number and determines whether it is a power of 2 or not. Print 1 if it is a power of 2, otherwise print 0.

```
Sample Input 1:
1

Sample Output 1:
1

Sample Input 2:
16

Sample Output 2:
1

Sample Input 3:
12

Sample Output 3:
0
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        while(n!=1){
            if(n%2!=0){
                flag = 1;
                break;
            }
            n = n/2;
        }
        if(flag==0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
```

## 5.

Write a program that takes a number and determines whether it is a prime number or not. Print 1 if it is a prime number, otherwise print 0.

```
Sample Input 1:
1

Sample Output 1:
0

Sample Input 2:
2

Sample Output 2:
1

Sample Input 3:
8

Sample Output 3:
0
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
```

## 6.

Write a program that takes a number and determines whether it is a perfect number or not. Print 1 if it is a perfect number, otherwise print 0.

```
Sample Input 1:
6

Sample Output 1:
1

Sample Input 2:
28

Sample Output 2:
1

Sample Input 3:
8

Sample Output 3:
0
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        if(sum==n){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
```

## 7.

Write a program that takes a number and determines whether it is a strong number or not. Print 1 if it is a strong number, otherwise print 0.

```
Sample Input 1:
145

Sample Output 1:
1

Sample Input 2:
123

Sample Output 2:
0
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp!=0){
            int fact = 1;
            int rem = temp%10;
            for(int i=1;i<=rem;i++){
                fact = fact*i;
            }
            sum = sum + fact;
            temp = temp/10;
        }
        if(sum==n){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
```

## 8.

Write a program that takes a number and determines whether it is a happy number or not. Print 1 if it is a happy number, otherwise print 0.

```
Sample Input 1:
19

Sample Output 1:
1

Sample Input 2:
22

Sample Output 2:
0
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp!=0){
            int rem = temp%10;
            sum = sum + rem*rem;
            temp =
