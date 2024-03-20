
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(t/x);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers. Your solution should be recursive.

```
def sum_list(l):
    if len(l) == 0:
        return 0
    else:
        return l[0] + sum_list(l[1:])
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list. Your solution should be recursive.

```
def max_list(l):
    if len(l) == 0:
        return 0
    else:
        return max(l[0], max_list(l[1:]))
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list. Your solution should be recursive.

```
def min_list(l):
    if len(l) == 0:
        return 0
    else:
        return min(l[0], min_list(l[1:]))
```

## 5.

Write a function that takes a list of numbers and returns a new list of all the numbers greater than 10. Your solution should be recursive.

```
def greater_than_10(l):
    if len(l) == 0:
        return []
    else:
        if l[0] > 10:
            return [l[0]] + greater_than_10(l[1:])
        else:
            return greater_than_10(l[1:])
```

## 6.

Write a function that takes a list of numbers and returns a new list of all the numbers less than 5. Your solution should be recursive.

```
def less_than_5(l):
    if len(l) == 0:
        return []
    else:
        if l[0] < 5:
            return [l[0]] + less_than_5(l[1:])
        else:
            return less_than_5(l[1:])
```

## 7.

Write a function that takes a list of numbers and returns a new list of all the numbers equal to 10. Your solution should be recursive.

```
def equal_to_10(l):
    if len(l) == 0:
        return []
    else:
        if l[0] == 10:
            return [l[0]] + equal_to_10(l[1:])
        else:
            return equal_to_10(l[1:])
```

## 8.

Write a function that takes a list of numbers and returns a new list of all the numbers that are even. Your solution should be recursive.

```
def even_list(l):
    if len(l) == 0:
        return []
    else:
        if l[0] % 2 == 0:
            return [l[0]] + even_list(l[1:])
        else:
            return even_list(l[1:])
```

## 9.

Write a function that takes a list of numbers and returns a new list of all the numbers that are odd. Your solution should be recursive.

```
def odd_list(l):
    if len(l) == 0:
        return []
    else:
        if l[0] % 2 == 1:
            return [l[0]] + odd_list(l[1:])
        else:
            return odd_list(l[1:])
```

## 10.

Write a function that takes a list of strings and returns a new list containing all strings of length 4 or greater. Your solution should be recursive.

```
def greater_than_4(l):
    if len(l) == 0:
        return []
    else:
        if len(l[0]) >= 4:
            return [l[0]] + greater_than_4(l[1:])
        else:
            return greater_than_4(l[1:])
```

## 11.

Write a function that takes a list of strings and returns a new list containing all strings of length 2 or less. Your solution should be recursive.

```
def less_than_2(l):
    if len(l) == 0:
        return []
    else:
        if len(l[0]) <= 2:
            return [l[0]] + less_than_2(l[1:])
        else:
            return less_than_2(l[1:])
```

## 12.

Write a function that takes a list of strings and returns a new list containing all strings of length 3. Your solution should be recursive.

```
def equal_to_3(l):
    if len(l) == 0:
        return []
    else:
        if len(l[0]) == 3:
            return [l[0]] + equal_to_3(l[1:])
        else:
            return equal_to_3(l[1:])
```

## 13.

Write a function that takes a list of strings and returns a new list containing all strings that start with the letter 'a'. Your solution should be recursive.

```
def start_with_a(l):
    if len(l) == 0:
        return []
    else:
        if l[0][0] == 'a':
            return [l[0]] + start_with_a(l[1:])
        else:
            return start_with_a(l[1:])
```

## 14.

Write a function that takes a list of strings and returns a new list containing all strings that start with the letter 'b'. Your solution should be recursive.

```
def start_with_b(l):
    if len(l) == 0:
        return []
    else:
        if l[0][0] == 'b':
            return [l[0]] + start_with_b(l[1:])
        else:
            return start_with_b(l[1:])
```

## 15.

Write a function that takes a list of strings and returns a new list containing all strings that start with the letter 'c'. Your solution should be recursive.

```
def start_with_c(l):
    if len(l) == 0:
        return []
    else:
        if l[0][0] == 'c':
            return [l[0]] + start_with_c(l[1:])
        else:
            return start_with_c(l[1:])
```

## 16.

Write a function that takes a list of strings and returns a new list containing all strings that start with the letter 'd'. Your solution should be recursive.

```
def start_with_d(l):
    if len(l) == 0:
        return []
    else:
        if l[0][0] == 'd':
            return [l[0]] + start_with_d(l[1:])
        else:
            return start_with_d(l[1:])
```

## 17.

Write a function that takes a list of strings and returns a new list containing all strings that start with the letter 'e'. Your solution should be recursive.

```
def start_with_e(l):
    if len(l) == 0:
        return []
    else:
        if l[0][0] == 'e':
            return [l[0]] + start_with_e(l[1:])
        else:
            return start_with_e(l[1:])
```

## 18.

Write a function that takes a list
