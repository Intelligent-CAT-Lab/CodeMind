

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < h; i++) {
            if (i < b) {
                for (int j = 0; j < a; j++) {
                    System.out.print("0");
                }
                for (int j = 0; j < w - a; j++) {
                    System.out.print("1");
                }
            } else {
                for (int j = 0; j < a; j++) {
                    System.out.print("1");
                }
                for (int j = 0; j < w - a; j++) {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
```

## 10. 1000000007

Write a program that reads an integer N and prints the sum of all integers from 1 to N.

### Input

The input is given in the following format:

```
N
```

### Output

Print the sum of all integers from 1 to N.

### Constraints

1 ≤ N ≤ 1000000000

### Sample Input

```
10
```

### Sample Output

```
55
```

### Hint

```
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

## 11. 1000000007

Write a program that reads an integer N and prints the sum of all integers from 1 to N.

### Input

The input is given in the following format:

```
N
```

### Output

Print the sum of all integers from 1 to N.

### Constraints

1 ≤ N ≤ 1000000000

### Sample Input

```
10
```

### Sample Output

```
55
```

### Hint

```
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int n = scanner.nextInt();
        System.out.println(isEvenNumber(n));
    }

    /**
     * 判断一个数是奇数还是偶数
     *
     * @param number 输入的数字
     * @return 如果是偶数，返回true，否则返回false
     */
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}

