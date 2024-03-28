
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int w = 0;
        for (int i = 0; i < 100000; i++) {
            if (i * (i + 1) / 2 < N && N <= (i + 1) * (i + 2) / 2) {
                w = i + 1;
                break;
            }
        }
        for (int i = w; i > 0; i--) {
            if (N >= i) {
                System.out.println(i);
                N -= i;
            }
        }
    }
}
```

## 2. 
Write a program to find the sum of all the numbers in a given list.

```
def sum_list(l):
    sum = 0
    for i in l:
        sum += i
    return sum

print(sum_list([1, 2, 3, 4, 5]))
```

java code:
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(sumList(l));
    }

    public static int sumList(List<Integer> l) {
        int sum = 0;
        for (int i : l) {
            sum += i;
        }
        return sum;
    }
}
```


## 2. 
Write a program to find the sum of all the numbers in a given list.

```
def sum_list(l):
    sum = 0
    for i in l:
        sum += i
    return sum

print(sum_list([1, 2, 3, 4, 5]))
```

java code:
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(sumList(l));
    }

    public static int sumList(List<Integer> l) {
        int sum = 0;
        for (int i : l) {
            sum += i;
        }
        return sum;
    }
}
```
/README.md
# Python to Java

## 1. 
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
1
3
27

```
N = int(input())
w = 0
for i in range(10 ** 5):
    if i * (i + 1) // 2 < N <= (i + 1) * (i + 2) // 2:
        w = i + 1
        break
for i in range(w, 0, -1):
    if N >= i:
        print(i)
        N -= i
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int w = 0;
        for (int i = 0; i < 100000; i++) {
            if (i * (i + 1) / 2 < N && N <= (i + 1) * (i + 2) / 2) {
                w = i + 1;
                break;
            }
        }
        for (int i = w; i > 0; i--) {
            if (N >= i) {
                System.out.println(i);
                N -= i;
            }
        }
    }
}
```
