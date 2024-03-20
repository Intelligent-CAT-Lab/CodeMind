
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int gcd = gcd(A, B);
        List<Integer> prime_factor = prime_factorize(gcd);
        int ans = prime_factor.size();
        for (int i = 0; i < (1 << prime_factor.size()); i++) {
            int i_temp = i;
            int j = 0;
            int composite = 1;
            int count = 0;
            while (i_temp != 0) {
                if (i_temp % 2 == 0) {
                    pass;
                } else if (i_temp % 2 == 1) {
                    composite *= prime_factor.get(j);
                    count += 1;
                }
                j += 1;
                i_temp /= 2;
            }
            for (int j = 0; j < prime_factor.size(); j++) {
                if (prime_factor.get(j) == composite && count >= 2) {
                    ans -= 1;
                }
            }
        }
        System.out.println(ans + 1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static List<Integer> prime_factorize(int n) {
        List<Integer> a = new ArrayList<>();
        while (n % 2 == 0) {
            a.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.add(n);
        }
        return a;
    }
}
```

## 2.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum(numbers):
    # your code here
```

## 3.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max(numbers):
    # your code here
```

## 4.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min(numbers):
    # your code here
```

## 5.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average(numbers):
    # your code here
```

## 6.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median(numbers):
    # your code here
```

## 7.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode(numbers):
    # your code here
```

## 8.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
def standard_deviation(numbers):
    # your code here
```

## 9.

Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance(numbers):
    # your code here
```

## 10.

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range(numbers):
    # your code here
```

## 11.

Write a function that takes a list of numbers and returns the number of even numbers in the list.

```
def count_even(numbers):
    # your code here
```

## 12.

Write a function that takes a list of numbers and returns the number of odd numbers in the list.

```
def count_odd(numbers):
    # your code here
```

## 13.

Write a function that takes a list of numbers and returns the number of positive numbers in the list.

```
def count_positive(numbers):
    # your code here
```

## 14.

Write a function that takes a list of numbers and returns the number of negative numbers in the list.

```
def count_negative(numbers):
    # your code here
```

## 15.

Write a function that takes a list of numbers and returns the number of numbers that are greater than 100 in the list.

```
def count_greater_than_100(numbers):
    # your code here
```

## 16.

Write a function that takes a list of numbers and returns the number of numbers that are less than 100 in the list.

```
def count_less_than_100(numbers):
    # your code here
```

## 17.

Write a function that takes a list of numbers and returns the number of numbers that are equal to 100 in the list.

```
def count_equal_to_100(numbers):
    # your code here
```

## 18.

Write a function that takes a list of numbers and returns the number of numbers that are greater than 1000 in the list.

```
def count_greater_than_1000(numbers):
    # your code here
```

## 19.

Write a function that takes a list of numbers and returns the number of numbers that are less than 1000 in the list.

```
def count_less_than_1000(numbers):
    # your code here
```

## 20.

Write a function that takes a list of numbers and returns the number of numbers that are equal to 1000 in the list.

```
def count_equal_to_1000(numbers):
    # your code here
```

## 21.

Write a function that takes a list of numbers and returns the number of numbers that are greater than 10000 in the list.

```
def count_greater_than_10000(numbers):
    # your code here
```

## 22.

Write a function that takes a list of numbers and returns the number of numbers that are less than 10000 in the list.

```
def count_less_than_10000(numbers):
    # your code here
```

## 23.

Write a function that takes a list of numbers and returns the number of numbers that are equal to 10000 in the list.

```
def count_equal_to_10000(numbers):
    # your code here
```

## 24.

Write a function that takes a list of numbers and returns the number of numbers that are greater than 100000 in the list.

```
def count_greater_than_100000(numbers):
    # your code here
```

## 25.

Write a function that takes a list of numbers and returns the number of numbers that are less than 100000 in the list.

```
def count_less_than_10
