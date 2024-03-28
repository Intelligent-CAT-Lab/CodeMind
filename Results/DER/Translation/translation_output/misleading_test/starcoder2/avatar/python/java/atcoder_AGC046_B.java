
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int m = 998244353;
        int[][] d = new int[C + 1][D + 1];
        d[A][B] = 1;
        for (int i = A; i <= C; i++) {
            for (int j = B; j <= D; j++) {
                d[i][j] += (d[i][j - 1] * i + d[i - 1][j] * j - d[i - 1][j - 1] * (i - 1) * (j - 1)) % m;
            }
        }
        System.out.println(d[C][D]);
    }
}
```

## 2. 
Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
    # write your code here

print(sum([1, 2, 3, 4, 5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(sum(list));
    }

    public static int sum(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }
}
```

## 3. 
Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
    # write your code here

print(sum([1, 2, 3, 4, 5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(sum(list));
    }

    public static int sum(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }
}
```

## 4. 
Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
    # write your code here

print(sum([1, 2, 3, 4, 5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(sum(list));
    }

    public static int sum(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }
}
```

## 5. 
Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
    # write your code here

print(sum([1, 2, 3, 4, 5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(sum(list));
    }

    public static int sum(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }
}
```

## 6. 
Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
    # write your code here

print(sum([1, 2, 3, 4, 5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(sum(list));
    }

    public static int sum(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }
}
```

## 7. 
Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
    # write your code here

print(sum([1, 2, 3, 4, 5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(sum(list));
    }

    public static int sum(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }
}
```

## 8. 
Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
    # write your code here

print(sum([1, 2, 3, 4, 5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(sum(list));
    }

    public static int sum(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }
}
```

## 9. 
Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
    # write your code here

print(sum([1, 2, 3, 4, 5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(sum(list));
    }

    public static int sum(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }
}
```

## 10. 
Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
    # write your code here

print(sum([1, 2, 3, 4, 5]))
```

```java
public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.println(sum(list));
    }

    public static int sum(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        return sum;
    }
}
```

## 11. 
Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
    # write your code here

print(sum([1, 2, 3, 4, 
