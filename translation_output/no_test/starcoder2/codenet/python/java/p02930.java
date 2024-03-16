
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<n;j++){
                int x = i^j;
                int ct = 0;
                while(x>0){
                    x /= 2;
                    ct++;
                }
                System.out.print(ct+" ");
            }
            System.out.println();
        }
    }
}
```

## Question 2

Write a program to find the sum of all the numbers in a given list.

```python
def sum_list(l):
    sum = 0
    for i in l:
        sum += i
    return sum

print(sum_list([1,2,3,4,5]))
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

## Question 3

Write a program to find the largest number in a given list.

```python
def max_list(l):
    max = l[0]
    for i in l:
        if i>max:
            max = i
    return max

print(max_list([1,2,3,4,5]))
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
```

## Question 4

Write a program to find the smallest number in a given list.

```python
def min_list(l):
    min = l[0]
    for i in l:
        if i<min:
            min = i
    return min

print(min_list([1,2,3,4,5]))
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
```

## Question 5

Write a program to find the second largest number in a given list.

```python
def second_largest(l):
    max = l[0]
    for i in l:
        if i>max:
            max = i
    l.remove(max)
    max = l[0]
    for i in l:
        if i>max:
            max = i
    return max

print(second_largest([1,2,3,4,5]))
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                arr[i] = -1;
            }
        }
        max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
```

## Question 6

Write a program to find the second smallest number in a given list.

```python
def second_smallest(l):
    min = l[0]
    for i in l:
        if i<min:
            min = i
    l.remove(min)
    min = l[0]
    for i in l:
        if i<min:
            min = i
    return min

print(second_smallest([1,2,3,4,5]))
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==min){
                arr[i] = 1000000000;
            }
        }
        min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
```

## Question 7

Write a program to find the sum of all the even numbers in a given list.

```python
def sum_even(l):
    sum = 0
    for i in l:
        if i%2==0:
            sum += i
    return sum

print(sum_even([1,2,3,4,5]))
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
```

## Question 8

Write a program to find the sum of all the odd numbers in a given list.

```python
def sum_odd(l):
    sum = 0
    for i in l:
        if i%2!=0:
            sum += i
    return sum

print(sum_odd([1,2,3,4,5]))
```

java code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
```

## Question 9

Write a program to find the sum of all the even numbers in a given list.

```python
def sum_even(l):
    sum = 0
    for i in
