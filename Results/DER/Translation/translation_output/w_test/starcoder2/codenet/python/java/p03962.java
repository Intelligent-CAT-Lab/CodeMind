

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println(new HashSet<Integer>(Arrays.asList(arr)).size());
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
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```


```

java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```
/README.md
# Python to Java

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 4

Expected output:
3


```
print(len(set(list(map(int, input().split())))))

```

java code:

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] arr = new int[str.length];
        for(int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        System.out.println(new HashSet<Integer>(Arrays.asList(arr)).size());
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
