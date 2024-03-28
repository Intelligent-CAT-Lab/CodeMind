

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println("no");
                break;
            }
        }
        if (count == 1) {
            System.out.println("yes");
        }
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
```
/01-01-2021/01-01-2021.md
# 01-01-2021

## Question 1

Write a program to find the maximum element in an array.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
5
```

## Question 2

Write a program to find the minimum element in an array.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
1
```

## Question 3

Write a program to find the sum of all elements in an array.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
15
```

## Question 4

Write a program to find the average of all elements in an array.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
3
```

## Question 5

Write a program to find the sum of all even elements in an array.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
6
```

## Question 6

Write a program to find the sum of all odd elements in an array.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
9
```

## Question 7

Write a program to find the sum of all elements in an array which are divisible by 3.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
9
```

## Question 8

Write a program to find the sum of all elements in an array which are divisible by 5.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
5
```

## Question 9

Write a program to find the sum of all elements in an array which are divisible by 7.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
7
```

## Question 10

Write a program to find the sum of all elements in an array which are divisible by 11.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
11
```

## Question 11

Write a program to find the sum of all elements in an array which are divisible by 13.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
13
```

## Question 12

Write a program to find the sum of all elements in an array which are divisible by 17.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
17
```

## Question 13

Write a program to find the sum of all elements in an array which are divisible by 19.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
19
```

## Question 14

Write a program to find the sum of all elements in an array which are divisible by 23.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
23
```

## Question 15

Write a program to find the sum of all elements in an array which are divisible by 29.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
29
```

## Question 16

Write a program to find the sum of all elements in an array which are divisible by 31.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
31
```

## Question 17

Write a program to find the sum of all elements in an array which are divisible by 37.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
37
```

## Question 18

Write a program to find the sum of all elements in an array which are divisible by 41.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
41
```

## Question 19

Write a program to find the sum of all elements in an array which are divisible by 43.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
43
```

## Question 20

Write a program to find the sum of all elements in an array which are divisible by 47.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
47
```

## Question 21

Write a program to find the sum of all elements in an array which are divisible by 53.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
53
```

## Question 22

Write a program to find the sum of all elements in an array which are divisible by 59.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
59
```

## Question 23

Write a program to find the sum of all elements in an array which are divisible by 61.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
61
```

## Question 24

Write a program to find the sum of all elements in an array which are divisible by 67.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
67
```

## Question 25

Write a program to find the sum of all elements in an array which are divisible by 71.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
71
```

## Question 26

Write a program to find the sum of all elements in an array which are divisible by 73.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
73
```

## Question 27

Write a program to find the sum of all elements in an array which are divisible by 79.

```
Sample Input:
5
1 2 3 4 5

Sample Output:
79
```

## Question 28

Write a program to find the sum of all elements
