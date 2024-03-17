

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int s = sc.nextInt();
        int q = sc.nextInt();
        double v = (q - 1) / (double) q;
        int tm = 1;
        double t = s / (1 - v);
        while ((T - s) / v - t > 0) {
            if ((T - s) / v - t < 1e-10) {
                break;
            }
            tm += 1;
            s += v * t;
            t = s / (1 - v);
        }
        System.out.println(tm);
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of the same numbers in reverse order.

```
def reverse(lst):
    return lst[::-1]
```

## 3.

Write a function that takes a list of numbers and returns the sum of the numbers.

```
def sum(lst):
    return sum(lst)
```

## 4.

Write a function that takes a list of numbers and returns the largest number in the list.

```
def max(lst):
    return max(lst)
```

## 5.

Write a function that takes a list of numbers and returns the smallest number in the list.

```
def min(lst):
    return min(lst)
```

## 6.

Write a function that takes a list of numbers and returns the average of the numbers.

```
def average(lst):
    return sum(lst) / len(lst)
```

## 7.

Write a function that takes a list of numbers and returns the median of the numbers.

```
def median(lst):
    lst.sort()
    if len(lst) % 2 == 0:
        return (lst[len(lst) // 2] + lst[len(lst) // 2 - 1]) / 2
    else:
        return lst[len(lst) // 2]
```

## 8.

Write a function that takes a list of numbers and returns the standard deviation of the numbers.

```
def std(lst):
    avg = sum(lst) / len(lst)
    return (sum([(i - avg) ** 2 for i in lst]) / len(lst)) ** 0.5
```

## 9.

Write a function that takes a list of numbers and returns the mode of the numbers.

```
def mode(lst):
    return max(set(lst), key=lst.count)
```

## 10.

Write a function that takes a list of numbers and returns the range of the numbers.

```
def range(lst):
    return max(lst) - min(lst)
```

## 11.

Write a function that takes a list of numbers and returns the variance of the numbers.

```
def variance(lst):
    avg = sum(lst) / len(lst)
    return sum([(i - avg) ** 2 for i in lst]) / len(lst)
```

## 12.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad(lst):
    avg = sum(lst) / len(lst)
    return sum([abs(i - avg) for i in lst]) / len(lst)
```

## 13.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad(lst):
    avg = sum(lst) / len(lst)
    return sum([abs(i - avg) for i in lst]) / len(lst)
```

## 14.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad(lst):
    avg = sum(lst) / len(lst)
    return sum([abs(i - avg) for i in lst]) / len(lst)
```

## 15.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad(lst):
    avg = sum(lst) / len(lst)
    return sum([abs(i - avg) for i in lst]) / len(lst)
```

## 16.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad(lst):
    avg = sum(lst) / len(lst)
    return sum([abs(i - avg) for i in lst]) / len(lst)
```

## 17.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad(lst):
    avg = sum(lst) / len(lst)
    return sum([abs(i - avg) for i in lst]) / len(lst)
```

## 18.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad(lst):
    avg = sum(lst) / len(lst)
    return sum([abs(i - avg) for i in lst]) / len(lst)
```

## 19.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad(lst):
    avg = sum(lst) / len(lst)
    return sum([abs(i - avg) for i in lst]) / len(lst)
```

## 20.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad(lst):
    avg = sum(lst) / len(lst)
    return sum([abs(i - avg) for i in lst]) / len(lst)
```

## 21.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad(lst):
    avg = sum(lst) / len(lst)
    return sum([abs(i - avg) for i in lst]) / len(lst)
```

## 22.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad(lst):
    avg = sum(lst) / len(lst)
    return sum([abs(i - avg) for i in lst]) / len(lst)
```

## 23.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad(lst):
    avg = sum(lst) / len(lst)
    return sum([abs(i - avg) for i in lst]) / len(lst)
```

## 24.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad(lst):
    avg = sum(lst) / len(lst)
    return sum([abs(i - avg) for i in lst]) / len(lst)
```

## 25.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad(lst):
    avg = sum(lst) / len(lst)
    return sum([abs(i - avg) for i in lst]) / len(lst)
```

## 26.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad(lst):
    avg = sum(lst) / len(lst)
    return sum([abs(i - avg) for i in lst]) / len(lst)
```

## 27.

Write a function that takes a list of numbers and returns the mean absolute deviation of the numbers.

```
def mad(lst):
    avg = sum(lst) / len(lst)
    return sum([abs(i - avg) for i in lst])
