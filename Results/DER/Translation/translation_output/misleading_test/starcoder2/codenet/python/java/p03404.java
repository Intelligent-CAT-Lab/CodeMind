
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[][] ar = new char[100][100];
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                ar[i][j] = '#';
            }
        }
        for(int i = 50; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                ar[i][j] = '.';
            }
        }
        int count = 0;
        for(int i = 48; i >= 0; i -= 2) {
            if(count == a-1) {
                break;
            }
            if(i % 2 == 0) {
                for(int j = 0; j < 100; j += 2) {
                    ar[i][j] = '.';
                    count++;
                    if(count == a-1) {
                        break;
                    }
                }
            } else {
                for(int j = 1; j < 100; j += 2) {
                    ar[i][j] = '.';
                    count++;
                    if(count == a-1) {
                        break;
                    }
                }
            }
        }
        count = 0;
        for(int i = 99; i >= 50; i -= 2) {
            if(count == b-1) {
                break;
            }
            if(i % 2 == 0) {
                for(int j = 0; j < 100; j += 2) {
                    ar[i][j] = '#';
                    count++;
                    if(count == b-1) {
                        break;
                    }
                }
            } else {
                for(int j = 1; j < 100; j += 2) {
                    ar[i][j] = '#';
                    count++;
                    if(count == b-1) {
                        break;
                    }
                }
            }
        }
        System.out.println("100 100");
        for(int i = 0; i < 100; i++) {
            for(int j = 0; j < 100; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }
}
```

## 2.

Write a program to find the sum of all the numbers in a given list.

```
a = [1,2,3,4,5]
sum = 0
for i in a:
    sum += i
print(sum)
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the sum of all the numbers in a given list.

```
a = [1,2,3,4,5]
sum = 0
for i in a:
    sum += i
print(sum)
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program to find the sum of all the numbers in a given list.

```
a = [1,2,3,4,5]
sum = 0
for i in a:
    sum += i
print(sum)
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program to find the sum of all the numbers in a given list.

```
a = [1,2,3,4,5]
sum = 0
for i in a:
    sum += i
print(sum)
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program to find the sum of all the numbers in a given list.

```
a = [1,2,3,4,5]
sum = 0
for i in a:
    sum += i
print(sum)
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program to find the sum of all the numbers in a given list.

```
a = [1,2,3,4,5]
sum = 0
for i in a:
    sum += i
print(sum)
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program to find the sum of all the numbers in a given list.

```
a = [1,2,3,4,5]
sum = 0
for i in a:
    sum += i
print(sum)

