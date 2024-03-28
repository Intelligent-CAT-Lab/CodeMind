

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        int[] X = new int[K];
        int[] Y = new int[K];
        for(int i = 0; i < K; i++) {
            X[i] = A + i;
        }
        for(int i = 0; i < K; i++) {
            Y[i] = B - K + 1 + i;
        }
        int[] ans = new int[K * 2];
        for(int i = 0; i < K; i++) {
            ans[i] = X[i];
        }
        for(int i = 0; i < K; i++) {
            ans[K + i] = Y[i];
        }
        Arrays.sort(ans);
        for(int i = 0; i < K * 2; i++) {
            System.out.println(ans[i]);
        }
    }
}
```

## 2.

Write a program to find the sum of all the numbers in a list.

```
def sum(list):
  sum = 0
  for i in list:
    sum += i
  return sum

print(sum([1,2,3,4,5]))
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the largest number in a list.

```
def max(list):
  max = list[0]
  for i in list:
    if i > max:
      max = i
  return max

print(max([1,2,3,4,5]))
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int max = list[0];
        for(int i = 0; i < list.length; i++) {
            if(list[i] > max) {
                max = list[i];
            }
        }
        System.out.println(max);
    }
}
```

## 4.

Write a program to find the smallest number in a list.

```
def min(list):
  min = list[0]
  for i in list:
    if i < min:
      min = i
  return min

print(min([1,2,3,4,5]))
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int min = list[0];
        for(int i = 0; i < list.length; i++) {
            if(list[i] < min) {
                min = list[i];
            }
        }
        System.out.println(min);
    }
}
```

## 5.

Write a program to find the second largest number in a list.

```
def second_max(list):
  max = list[0]
  second_max = list[0]
  for i in list:
    if i > max:
      second_max = max
      max = i
    elif i > second_max:
      second_max = i
  return second_max

print(second_max([1,2,3,4,5]))
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int max = list[0];
        int second_max = list[0];
        for(int i = 0; i < list.length; i++) {
            if(list[i] > max) {
                second_max = max;
                max = list[i];
            } else if(list[i] > second_max) {
                second_max = list[i];
            }
        }
        System.out.println(second_max);
    }
}
```

## 6.

Write a program to find the second smallest number in a list.

```
def second_min(list):
  min = list[0]
  second_min = list[0]
  for i in list:
    if i < min:
      second_min = min
      min = i
    elif i < second_min:
      second_min = i
  return second_min

print(second_min([1,2,3,4,5]))
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int min = list[0];
        int second_min = list[0];
        for(int i = 0; i < list.length; i++) {
            if(list[i] < min) {
                second_min = min;
                min = list[i];
            } else if(list[i] < second_min) {
                second_min = list[i];
            }
        }
        System.out.println(second_min);
    }
}
```

## 7.

Write a program to find the sum of all the even numbers in a list.

```
def sum_even(list):
  sum = 0
  for i in list:
    if i % 2 == 0:
      sum += i
  return sum

print(sum_even([1,2,3,4,5]))
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i < list.length; i++) {
            if(list[i] % 2 == 0) {
                sum += list[i];
            }
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program to find the sum of all the odd numbers in a list.

```
def sum_odd(list):
  sum = 0
  for i in list:
    if i % 2 == 1:
      sum += i
  return sum

print(sum_odd([1,2,3,4,5]))
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i < list.length; i++) {
            if(list[i] % 2 == 1) {
                sum += list[i];
            }
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program to find the sum of all the even numbers in a list.

```
def sum_even(list):
  sum = 0
  for i in list:
    if i % 2 == 0:
      sum += i
  return sum

print(sum_even([1,2,3,4,5]))
```

java code:

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int i = 0; i < list.length; i++) {
            if(list[i] % 2 == 0) {
                sum += list[i];
            }
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program to
