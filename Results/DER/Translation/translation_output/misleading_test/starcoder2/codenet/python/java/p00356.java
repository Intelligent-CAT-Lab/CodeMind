

```
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 1;
        for(int i = 1; i <= Math.min(a,b); i++){
            if(a%i == 0 && b%i == 0){
                gcd = i;
            }
        }
        System.out.println(a+b-gcd+1);
    }
}

```

## 2.

Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
    sum = 0
    for i in list:
        sum += i
    return sum

print(sum([1,2,3,4,5]))
```

## 3.

Write a program to find the largest number in a given list.

```
def largest(list):
    largest = list[0]
    for i in list:
        if i > largest:
            largest = i
    return largest

print(largest([1,2,3,4,5]))
```

## 4.

Write a program to find the smallest number in a given list.

```
def smallest(list):
    smallest = list[0]
    for i in list:
        if i < smallest:
            smallest = i
    return smallest

print(smallest([1,2,3,4,5]))
```

## 5.

Write a program to find the sum of all the even numbers in a given list.

```
def sum_even(list):
    sum = 0
    for i in list:
        if i%2 == 0:
            sum += i
    return sum

print(sum_even([1,2,3,4,5]))
```

## 6.

Write a program to find the sum of all the odd numbers in a given list.

```
def sum_odd(list):
    sum = 0
    for i in list:
        if i%2 != 0:
            sum += i
    return sum

print(sum_odd([1,2,3,4,5]))
```

## 7.

Write a program to find the sum of all the numbers in a given list that are divisible by 3.

```
def sum_divisible_by_3(list):
    sum = 0
    for i in list:
        if i%3 == 0:
            sum += i
    return sum

print(sum_divisible_by_3([1,2,3,4,5]))
```

## 8.

Write a program to find the sum of all the numbers in a given list that are divisible by 5.

```
def sum_divisible_by_5(list):
    sum = 0
    for i in list:
        if i%5 == 0:
            sum += i
    return sum

print(sum_divisible_by_5([1,2,3,4,5]))
```

## 9.

Write a program to find the sum of all the numbers in a given list that are divisible by 7.

```
def sum_divisible_by_7(list):
    sum = 0
    for i in list:
        if i%7 == 0:
            sum += i
    return sum

print(sum_divisible_by_7([1,2,3,4,5]))
```

## 10.

Write a program to find the sum of all the numbers in a given list that are divisible by 11.

```
def sum_divisible_by_11(list):
    sum = 0
    for i in list:
        if i%11 == 0:
            sum += i
    return sum

print(sum_divisible_by_11([1,2,3,4,5]))
```

## 11.

Write a program to find the sum of all the numbers in a given list that are divisible by 13.

```
def sum_divisible_by_13(list):
    sum = 0
    for i in list:
        if i%13 == 0:
            sum += i
    return sum

print(sum_divisible_by_13([1,2,3,4,5]))
```

## 12.

Write a program to find the sum of all the numbers in a given list that are divisible by 17.

```
def sum_divisible_by_17(list):
    sum = 0
    for i in list:
        if i%17 == 0:
            sum += i
    return sum

print(sum_divisible_by_17([1,2,3,4,5]))
```

## 13.

Write a program to find the sum of all the numbers in a given list that are divisible by 19.

```
def sum_divisible_by_19(list):
    sum = 0
    for i in list:
        if i%19 == 0:
            sum += i
    return sum

print(sum_divisible_by_19([1,2,3,4,5]))
```

## 14.

Write a program to find the sum of all the numbers in a given list that are divisible by 23.

```
def sum_divisible_by_23(list):
    sum = 0
    for i in list:
        if i%23 == 0:
            sum += i
    return sum

print(sum_divisible_by_23([1,2,3,4,5]))
```

## 15.

Write a program to find the sum of all the numbers in a given list that are divisible by 29.

```
def sum_divisible_by_29(list):
    sum = 0
    for i in list:
        if i%29 == 0:
            sum += i
    return sum

print(sum_divisible_by_29([1,2,3,4,5]))
```

## 16.

Write a program to find the sum of all the numbers in a given list that are divisible by 31.

```
def sum_divisible_by_31(list):
    sum = 0
    for i in list:
        if i%31 == 0:
            sum += i
    return sum

print(sum_divisible_by_31([1,2,3,4,5]))
```

## 17.

Write a program to find the sum of all the numbers in a given list that are divisible by 37.

```
def sum_divisible_by_37(list):
    sum = 0
    for i in list:
        if i%37 == 0:
            sum += i
    return sum

print(sum_divisible_by_37([1,2,3,4,5]))
```

## 18.

Write a program to find the sum of all the numbers in a given list that are divisible by 41.

```
def sum_divisible_by_41(list):
    sum = 0
    for i in list:
        if i%41 == 0:
            sum += i
    return sum

print(sum_divisible_by_41([1,2,3,4,5]))
```

## 19.

Write a program to find the sum of all the numbers in a given list that are divisible by 43.

```
def sum_divisible_by_43(list):
    sum = 0
    for i in list:
        if i%43 == 0:
            sum += i
    return sum

print(sum_divisible_by_43([1,2,3,4,5]))
```

## 20.

Write a program to find the sum of all the numbers in a given list that are divisible by 47.

```
def sum_divisible_by_47(list):
    sum = 0
    for i in list:
        if i%47 == 0:
            sum += i
    return sum

print(sum_divisible_
