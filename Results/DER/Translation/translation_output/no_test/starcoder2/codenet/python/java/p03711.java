
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] a = {1, 3, 5, 7, 8, 10, 12};
        int[] b = {4, 6, 9, 11};
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if ((x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) && (y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12)) {
            System.out.println("Yes");
        } else if ((x == 4 || x == 6 || x == 9 || x == 11) && (y == 4 || y == 6 || y == 9 || y == 11)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

## 2.
Write a program that reads a number and prints the sum of the digits of the number.

### Input
The input is a single integer.

### Output
Print the sum of the digits of the number.

### Sample Input 1
```
123
```

### Sample Output 1
```
6
```

### Sample Input 2
```
123456789
```

### Sample Output 2
```
45
```

### Sample Input 3
```
1000000000
```

### Sample Output 3
```
1
```

### Hint
```
123456789 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
```

### Solution
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 3.
Write a program that reads a number and prints the sum of the digits of the number.

### Input
The input is a single integer.

### Output
Print the sum of the digits of the number.

### Sample Input 1
```
123
```

### Sample Output 1
```
6
```

### Sample Input 2
```
123456789
```

### Sample Output 2
```
45
```

### Sample Input 3
```
1000000000
```

### Sample Output 3
```
1
```

### Hint
```
123456789 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
```

### Solution
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```
/01-Introduction/01-Introduction.md
# Introduction

## 1.
Write a program that reads a number and prints the sum of the digits of the number.

### Input
The input is a single integer.

### Output
Print the sum of the digits of the number.

### Sample Input 1
```
123
```

### Sample Output 1
```
6
```

### Sample Input 2
```
123456789
```

### Sample Output 2
```
45
```

### Sample Input 3
```
1000000000
```

### Sample Output 3
```
1
```

### Hint
```
123456789 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
```

### Solution
```python
n = int(input())
sum = 0
while n > 0:
    sum += n % 10
    n //= 10
print(sum)
```

## 2.
Write a program that reads a number and prints the sum of the digits of the number.

### Input
The input is a single integer.

### Output
Print the sum of the digits of the number.

### Sample Input 1
```
123
```

### Sample Output 1
```
6
```

### Sample Input 2
```
123456789
```

### Sample Output 2
```
45
```

### Sample Input 3
```
1000000000
```

### Sample Output 3
```
1
```

### Hint
```
123456789 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
```

### Solution
```python
n = int(input())
sum = 0
while n > 0:
    sum += n % 10
    n //= 10
print(sum)
```

## 3.
Write a program that reads a number and prints the sum of the digits of the number.

### Input
The input is a single integer.

### Output
Print the sum of the digits of the number.

### Sample Input 1
```
123
```

### Sample Output 1
```
6
```

### Sample Input 2
```
123456789
```

### Sample Output 2
```
45
```

### Sample Input 3
```
1000000000
```

### Sample Output 3
```
1
```

### Hint
```
123456789 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
```

### Solution
```python
n = int(input())
sum = 0
while n > 0:
    sum += n % 10
    n //= 10
print(sum)
```


### Sample Input 1
```
123
```

### Sample Output 1
```
6
```

### Sample Input 2
```
123456789
```

### Sample Output 2
```
45
```

### Sample Input 3
```
1000000000
```

### Sample Output 3
```
1
```

### Hint
```
123456789 = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9
```

### Solution
```python
n = int(input())
sum = 0
while n > 0:
    sum += n % 10
    n //= 10
print(sum)
```

## 3.
Write a program that reads a number and prints the sum of the digits of the number.

### Input
The input is a single integer.

### Output
Print the sum of the digits of the number.

### Sample Input 1
```
123
```

### Sample Output 1
```
6
```
