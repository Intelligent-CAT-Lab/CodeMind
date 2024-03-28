

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[10000000000];
        int limit = 10000000000;
        int four = 0;
        int seven = 0;
        int number = 0;
        int ans = 0;
        for (int i = 0; i < l.length; i++) {
            if (number > limit) {
                break;
            }
            if (number > 0 && four == seven) {
                l[i] = number;
            }
            gen(number * 10 + 4, four + 1, seven);
            gen(number * 10 + 7, four, seven + 1);
        }
        Arrays.sort(l);
        for (int i = 0; i < l.length; i++) {
            if (l[i] >= n) {
                ans = l[i];
                break;
            }
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a program to find the sum of all the numbers in a given list.

```
def sum(l):
    # write your code here

print(sum([1,2,3,4,5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] l = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < l.length; i++) {
            sum += l[i];
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the sum of all the numbers in a given list.

```
def sum(l):
    # write your code here

print(sum([1,2,3,4,5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] l = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < l.length; i++) {
            sum += l[i];
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program to find the sum of all the numbers in a given list.

```
def sum(l):
    # write your code here

print(sum([1,2,3,4,5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] l = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < l.length; i++) {
            sum += l[i];
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program to find the sum of all the numbers in a given list.

```
def sum(l):
    # write your code here

print(sum([1,2,3,4,5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] l = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < l.length; i++) {
            sum += l[i];
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program to find the sum of all the numbers in a given list.

```
def sum(l):
    # write your code here

print(sum([1,2,3,4,5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] l = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < l.length; i++) {
            sum += l[i];
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program to find the sum of all the numbers in a given list.

```
def sum(l):
    # write your code here

print(sum([1,2,3,4,5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] l = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < l.length; i++) {
            sum += l[i];
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program to find the sum of all the numbers in a given list.

```
def sum(l):
    # write your code here

print(sum([1,2,3,4,5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] l = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < l.length; i++) {
            sum += l[i];
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program to find the sum of all the numbers in a given list.

```
def sum(l):
    # write your code here

print(sum([1,2,3,4,5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] l = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < l.length; i++) {
            sum += l[i];
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program to find the sum of all the numbers in a given list.

```
def sum(l):
    # write your code here

print(sum([1,2,3,4,5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] l = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < l.length; i++) {
            sum += l[i];
        }
        System.out.println(sum);
    }
}
```

## 11.

Write a program to find the sum of all the numbers in a given list.

```
def sum(l):
    # write your code here

print(sum([1,2,3,4,5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] l = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < l.length; i++) {
            sum += l[i];
        }
        System.out.println(sum);
    }
}
```

## 12.

Write a program to find the sum of all the numbers in a given list.

```
def sum(l):
    # write your code here

print(sum([1,2,3,4,5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[]
