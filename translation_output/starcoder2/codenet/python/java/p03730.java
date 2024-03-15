
```java
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        HashSet<Integer> seen = new HashSet<Integer>();
        int m = a % b;
        int i = m;
        while (!seen.contains(i)) {
            if (i == c) {
                System.out.println("YES");
                return;
            }
            seen.add(i);
            i = (m + i) % b;
        }
        System.out.println("NO");
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```python
def sum(numbers):
    # your code here
```

```java
public static int sum(int[] numbers) {
    // your code here
}
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```python
def max(numbers):
    # your code here
```

```java
public static int max(int[] numbers) {
    // your code here
}
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```python
def min(numbers):
    # your code here
```

```java
public static int min(int[] numbers) {
    // your code here
}
```

## 5.

Write a function that takes a list of numbers and returns the average of the numbers.

```python
def average(numbers):
    # your code here
```

```java
public static double average(int[] numbers) {
    // your code here
}
```

## 6.

Write a function that takes a list of numbers and returns the median of the numbers.

```python
def median(numbers):
    # your code here
```

```java
public static double median(int[] numbers) {
    // your code here
}
```

## 7.

Write a function that takes a list of numbers and returns the mode of the numbers.

```python
def mode(numbers):
    # your code here
```

```java
public static int mode(int[] numbers) {
    // your code here
}
```

## 8.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```python
def stddev(numbers):
    # your code here
```

```java
public static double stddev(int[] numbers) {
    // your code here
}
```

## 9.

Write a function that takes a list of numbers and returns the variance of the numbers.

```python
def variance(numbers):
    # your code here
```

```java
public static double variance(int[] numbers) {
    // your code here
}
```

## 10.

Write a function that takes a list of numbers and returns the range of the numbers.

```python
def range(numbers):
    # your code here
```

```java
public static int range(int[] numbers) {
    // your code here
}
```

## 11.

Write a function that takes a list of numbers and returns the interquartile range of the numbers.

```python
def iqr(numbers):
    # your code here
```

```java
public static double iqr(int[] numbers) {
    // your code here
}
```

## 12.

Write a function that takes a list of numbers and returns the quartiles of the numbers.

```python
def quartiles(numbers):
    # your code here
```

```java
public static double[] quartiles(int[] numbers) {
    // your code here
}
```

## 13.

Write a function that takes a list of numbers and returns the percentiles of the numbers.

```python
def percentiles(numbers):
    # your code here
```

```java
public static double[] percentiles(int[] numbers) {
    // your code here
}
```

## 14.

Write a function that takes a list of numbers and returns the number of unique numbers in the list.

```python
def unique(numbers):
    # your code here
```

```java
public static int unique(int[] numbers) {
    // your code here
}
```

## 15.

Write a function that takes a list of numbers and returns the number of even numbers in the list.

```python
def even(numbers):
    # your code here
```

```java
public static int even(int[] numbers) {
    // your code here
}
```

## 16.

Write a function that takes a list of numbers and returns the number of odd numbers in the list.

```python
def odd(numbers):
    # your code here
```

```java
public static int odd(int[] numbers) {
    // your code here
}
```

## 17.

Write a function that takes a list of numbers and returns the number of positive numbers in the list.

```python
def positive(numbers):
    # your code here
```

```java
public static int positive(int[] numbers) {
    // your code here
}
```

## 18.

Write a function that takes a list of numbers and returns the number of negative numbers in the list.

```python
def negative(numbers):
    # your code here
```

```java
public static int negative(int[] numbers) {
    // your code here
}
```

## 19.

Write a function that takes a list of numbers and returns the number of zeroes in the list.

```python
def zeroes(numbers):
    # your code here
```

```java
public static int zeroes(int[] numbers) {
    // your code here
}
```

## 20.

Write a function that takes a list of numbers and returns the number of non-zeroes in the list.

```python
def nonzeroes(numbers):
    # your code here
```

```java
public static int nonzeroes(int[] numbers) {
    // your code here
}
```

## 21.

Write a function that takes a list of numbers and returns the number of prime numbers in the list.

```python
def primes(numbers):
    # your code here
```

```java
public static int primes(int[] numbers) {
    // your code here
}
```

## 22.

Write a function that takes a list of numbers and returns the number of composite numbers in the list.

```python
def composites(numbers):
    # your code here
```

```java
public static int composites(int[] numbers) {
    // your code here
}
```

## 23.

Write a function that takes a list of numbers and returns the number of perfect numbers in the list.

```python
def perfect(numbers):
    # your code here
```

```java
public static int perfect(int[] numbers) {
    // your code here
}
```

## 24.

Write a function that takes a list of numbers and returns the number of abundant numbers in the list.

```python
def abundant(numbers):
    # your code here
```

```java
public static int abundant(int[] numbers) {
    // your code here
}
```

## 25.

Write a function that takes a list of numbers and returns the number of deficient numbers in the list.

```python
def deficient(numbers):
    # your code here
```

```java
public static int deficient(int[] numbers) {
    // your code here
}
```

## 26.

Write a function that takes a list of numbers and returns the number of numbers that are not perfect, abundant, or deficient in the list.

```python
def weird(numbers):
    # your code here
```

```java
public static int weird(int[] numbers) {
    // your code here
}
