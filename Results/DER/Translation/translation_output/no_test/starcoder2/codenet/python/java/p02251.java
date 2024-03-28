
```java

```
/problems/0001/README.md
# Problem 1

## Description

Given a list of numbers, return the sum of all the numbers that are even.

## Input

The first line contains an integer ```n```, the size of the list.

The second line contains ```n``` space-separated integers, ```a1, a2, ..., an```, representing the elements of the list.

## Output

Print the sum of the elements of the list, keeping in mind that only the even numbers need to be considered.

## Constraints

- 1 <= n <= 100
- 1 <= ai <= 100

## Example

### Input
```
5
1 4 3 4 5
```

### Output
```
4
```

## Solution

### Python
```python
n = int(input())
a = list(map(int, input().split()))
ans = 0
for x in a:
  if x % 2 == 0:
    ans += x
print(ans)
```

### Java
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      if (x % 2 == 0) {
        ans += x;
      }
    }
    System.out.println(ans);
  }
}
```


## Solution

### Python
```python
n = int(input())
ans = 0
for x in (25, 10, 5, 1):
  ans += n // x
  n %= x
print(ans)
```

### Java
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for (int x : new int[] {25, 10, 5, 1}) {
      ans += n / x;
      n %= x;
    }
    System.out.println(ans);
  }
}
```
/problems/0002/README.md
# Problem 2

## Description

Given a number of cents, return the smallest number of coins that you can use to make that amount.

## Input

The first line contains an integer ```n```, the number of cents.

## Output

Print the smallest number of coins that you can use to make that amount.

## Constraints

- 1 <= n <= 10000

## Example

### Input
```
92
```

### Output
```
3
```

## Explanation

You can use 3 quarters, 2 dimes, and 2 pennies./problems/0003/README.md
# Problem 3

## Description

Given a list of numbers, return the sum of all the numbers that are even.

## Input

The first line contains an integer ```n```, the size of the list.

The second line contains ```n``` space-separated integers, ```a1, a2, ..., an```, representing the elements of the list.

## Output

Print the sum of the elements of the list, keeping in mind that only the even numbers need to be considered.

## Constraints

- 1 <= n <= 100
- 1 <= ai <= 100

## Example

### Input
```
5
1 4 3 4 5
```

### Output
```
4
```

## Solution

### Python
```python
n = int(input())
a = list(map(int, input().split()))
ans = 0
for x in a:
  if x % 2 == 0:
    ans += x
print(ans)
```

### Java
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      if (x % 2 == 0) {
        ans += x;
      }
    }
    System.out.println(ans);
  }
}
```

## Solution 2

### Python
```python
n = int(input())
a = list(map(int, input().split()))
ans = 0
for x in a:
  if x % 2 == 0:
    ans += x
print(ans)
```

### Java
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      if (x % 2 == 0) {
        ans += x;
      }
    }
    System.out.println(ans);
  }
}
```

## Solution 3

### Python
```python
n = int(input())
a = list(map(int, input().split()))
ans = 0
for x in a:
  if x % 2 == 0:
    ans += x
print(ans)
```

### Java
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      if (x % 2 == 0) {
        ans += x;
      }
    }
    System.out.println(ans);
  }
}
```

## Solution 4

### Python
```python
n = int(input())
a = list(map(int, input().split()))
ans = 0
for x in a:
  if x % 2 == 0:
    ans += x
print(ans)
```

### Java
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      if (x % 2 == 0) {
        ans += x;
      }
    }
    System.out.println(ans);
  }
}
```

## Solution 5

### Python
```python
n = int(input())
a = list(map(int, input().split()))
ans = 0
for x in a:
  if x % 2 == 0:
    ans += x
print(ans)
```

### Java
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      if (x % 2 == 0) {
        ans += x;
      }
    }
    System.out.println(ans);
  }
}
```

## Solution 6

### Python
```python
n = int(input())
a = list(map(int, input().split()))
ans = 0
for x in a:
  if x % 2 == 0:
    ans += x
print(ans)
```

### Java
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = 0;
    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      if (x % 2 == 0) {
        ans += x;
      }
   
