
```
import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        boolean is_run = Calendar.isLeapYear(y);
        int week = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
        while (true) {
            y++;
            if (Calendar.isLeapYear(y) == is_run && Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == week) {
                System.out.println(y);
                break;
            }
        }
    }
}
```

## 10.
Write a program that reads a number and prints the sum of the digits of the number.

### Input
The input is a single integer.

### Output
The output is a single integer.

### Sample Input
```
123
```

### Sample Output
```
6
```

### Solution
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 11.
Write a program that reads a number and prints the sum of the digits of the number.

### Input
The input is a single integer.

### Output
The output is a single integer.

### Sample Input
```
123
```

### Sample Output
```
6
```

### Solution
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 12.
Write a program that reads a number and prints the sum of the digits of the number.

### Input
The input is a single integer.

### Output
The output is a single integer.

### Sample Input
```
123
```

### Sample Output
```
6
```

### Solution
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
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

