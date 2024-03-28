

```

W, H, c = input().split()
W = int(W)
H = int(H)
x = (W - 1) // 2
y = (H - 1) // 2

for i in range(H):
    for j in range(W):
        if j == 0 and i == 0 or j == 0 and i == H - 1 or j == W - 1 and i == 0 or j == W - 1 and i == H - 1:
            print('+', end='')
        elif j != 0 and j != W - 1 and i == 0 or j != 0 and j != W - 1 and i == H - 1:
            print('-', end='')
        elif i != 0 and i != H - 1 and j == 0 or i != 0 and i != H - 1 and j == W - 1:
            print('|', end='')
        elif j == x and i == y:
            print(c, end='')
        else:
            print('.', end='')
    print()

```


```

python code:

```

n = int(input())

for i in range(n):
    print(i + 1)

```
/p00001.md
# p00001

## 题目描述

```

Write a program that prints the numbers from 1 to 100.

```

## 输入输出格式

### 输入格式

```

None

```

### 输出格式

```

1
2
3
...
100

```

## 输入输出样例

暂无测试点

## 说明

```

None

```

java code:

```

import java.util.Scanner;

public class p00001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(i + 1);
        }
    }
}/p00002.md
# p00002

## 题目描述

```

Write a program that reads an integer N and prints the sum of the numbers 1 to N.

```

## 输入输出格式

### 输入格式

```

The first line of input contains the integer N.

```

### 输出格式

```

Output the sum of the numbers 1 to N.

```

## 输入输出样例

### 输入样例 #1

```

10

```

### 输出样例 #1

```

55

```

## 说明

```

None

```

java code:

```

import java.util.Scanner;

public class p00002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}

```

python code:

```

n = int(input())
sum = 0

for i in range(n + 1):
    sum += i

print(sum)

```
/p00003.md
# p00003

## 题目描述

```

Write a program that reads an integer N and prints the sum of the numbers 1 to N.

```

## 输入输出格式

### 输入格式

```

The first line of input contains the integer N.

```

### 输出格式

```

Output the sum of the numbers 1 to N.

```

## 输入输出样例

### 输入样例 #1

```

10

```

### 输出样例 #1

```

55

```

## 说明

```

None

```

java code:

```

import java.util.Scanner;

public class p00003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}

```

python code:

```

n = int(input())
sum = 0

for i in range(n + 1):
    sum += i

print(sum)

```

## 题目描述

```

Write a program that reads an integer N and prints the sum of the numbers 1 to N.

```

## 输入输出格式

### 输入格式

```

The first line of input contains the integer N.

```

### 输出格式

```

Output the sum of the numbers 1 to N.

```

## 输入输出样例

### 输入样例 #1

```

10

```

### 输出样例 #1

```

55

```

## 说明

```

None

```

java code:

```

import java.util.Scanner;

public class p00003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}

```

python code:

```

n = int(input())
sum = 0

for i in range(n + 1):
    sum += i

print(sum)

```

## 题目描述

```

Write a program that reads an integer N and prints the sum of the numbers 1 to N.

```

## 输入输出格式

### 输入格式

```

The first line of input contains the integer N.

```

### 输出格式

```

Output the sum of the numbers 1 to N.

```

## 输入输出样例

### 输入样例 #1

```

10

```

### 输出样例 #1

```

55

```

## 说明

```

None

```

java code:

```

import java.util.Scanner;

public class p00003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
