
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans[][] = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                ans[i][j] = 0;
            }
        }
        for(int i = 0; i < n; i++) {
            if(i % 2 == 1) {
                ans[i][0] = 1;
            }
        }
        for(int i = 0; i < n; i++) {
            if(i % 6 == 1) {
                for(int j = 2; j < n; j++) {
                    if(j % 2 == 0) {
                        ans[i][j] = 1;
                    }
                }
            }
        }
        for(int i = 0; i < n; i++) {
            if(i % 6 == 4) {
                for(int j = 0; j < n; j++) {
                    if(j % 2 == 1) {
                        ans[i][j] = 1;
                    }
                }
            }
        }
        for(int j = 0; j < n; j++) {
            if((n - 1 + j) % 2 == 1) {
                ans[n - 1][j] = 1;
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(ans[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(ans[i][j] == 1) {
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
```

## 2.

Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
  # your code here

print(sum([1,2,3,4,5]))
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
  # your code here

print(sum([1,2,3,4,5]))
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
  # your code here

print(sum([1,2,3,4,5]))
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
  # your code here

print(sum([1,2,3,4,5]))
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
  # your code here

print(sum([1,2,3,4,5]))
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
  # your code here

print(sum([1,2,3,4,5]))
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
  # your code here

print(sum([1,2,3,4,5]))
```

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program to find the sum of all the numbers in a given list.

```
def sum(list):
  # your code here

