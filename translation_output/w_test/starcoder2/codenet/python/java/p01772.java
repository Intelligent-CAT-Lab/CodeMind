

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        boolean flag = false;
        for (char c : s.toCharArray()) {
            if (c == 'A' && !flag) flag = true;
            if (c == 'Z' && flag) {
                ans += "AZ";
                flag = false;
            }
        }
        if (ans.equals("")) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
```

## 2. 1000000007

### 2.1. Problem

Given an integer n, calculate the sum of all the numbers from 1 to n.

### 2.2. Input

The first line contains an integer n (1 ≤ n ≤ 10^9).

### 2.3. Output

Print the sum of all the numbers from 1 to n.

### 2.4. Sample Input

```
1000000007
```

### 2.5. Sample Output

```
500000003500000006
```

### 2.6. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println((n * (n + 1) / 2) % 1000000007);
    }
}
```

## 3. 1000000007

### 3.1. Problem

Given an integer n, calculate the sum of all the numbers from 1 to n.

### 3.2. Input

The first line contains an integer n (1 ≤ n ≤ 10^9).

### 3.3. Output

Print the sum of all the numbers from 1 to n.

### 3.4. Sample Input

```
1000000007
```

### 3.5. Sample Output

```
500000003500000006
```

### 3.6. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println((n * (n + 1) / 2) % 1000000007);
    }
}
```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        boolean flag = false;
        for (char c : s.toCharArray()) {
            if (c == 'A' && !flag) flag = true;
            if (c == 'Z' && flag) {
                ans += "AZ";
                flag = false;
            }
        }
        if (ans.equals("")) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}

