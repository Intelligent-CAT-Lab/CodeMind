

```python

W, H, c = input().split()
W = int(W)
H = int(H)
x = (W - 1) / 2
y = (H - 1) / 2

for i in range(H):
    for j in range(W):
        if j == 0 and i == 0 or j == 0 and i == H - 1 or j == W - 1 and i == 0 or j == W - 1 and i == H - 1:
            print("+", end="")
        elif j != 0 and j != W - 1 and i == 0 or j != 0 and j != W - 1 and i == H - 1:
            print("-", end="")
        elif i != 0 and i != H - 1 and j == 0 or i != 0 and i != H - 1 and j == W - 1:
            print("|", end="")
        elif j == x and i == y:
            print(c, end="")
        else:
            print(".", end="")
    print()

```


```

python code:

```python

n = int(input())

for i in range(n):
    print(i + 1, end=" ")

```
/p00001.md
# p00001

```

Write a program that prints the numbers from 1 to n.

Input
The input will be a single integer n

Output
Print the numbers from 1 to n, each on a new line

Sample Input 1
5

Sample Output 1
1
2
3
4
5

```

java code:

```java

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

```

Write a program that prints the numbers from 1 to n, but for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

Input
The input will be a single integer n

Output
Print the numbers from 1 to n, each on a new line

Sample Input 1
15

Sample Output 1
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz

```

java code:

```java

import java.util.Scanner;

public class p00002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if ((i + 1) % 3 == 0) {
                System.out.println("Fizz");
            } else if ((i + 1) % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i + 1);
            }
        }
    }
}

```

python code:

```python

n = int(input())

for i in range(n):
    if (i + 1) % 3 == 0 and (i + 1) % 5 == 0:
        print("FizzBuzz")
    elif (i + 1) % 3 == 0:
        print("Fizz")
    elif (i + 1) % 5 == 0:
        print("Buzz")
    else:
        print(i + 1)

```
/p00003.md
# p00003

```

Write a program that prints the numbers from 1 to n, but for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

Input
The input will be a single integer n

Output
Print the numbers from 1 to n, each on a new line

Sample Input 1
15

Sample Output 1
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz

```

java code:

```java

import java.util.Scanner;

public class p00003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if ((i + 1) % 3 == 0) {
                System.out.println("Fizz");
            } else if ((i + 1) % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i + 1);
            }
        }
    }
}

```

python code:

```python

n = int(input())

for i in range(n):
    if (i + 1) % 3 == 0 and (i + 1) % 5 == 0:
        print("FizzBuzz")
    elif (i + 1) % 3 == 0:
        print("Fizz")
    elif (i + 1) % 5 == 0:
        print("Buzz")
    else:
        print(i + 1)

```

# p00004

```

Write a program that prints the numbers from 1 to n, but for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

Input
The input will be a single integer n

Output
Print the numbers from 1 to n, each on a new line

Sample Input 1
15

Sample Output 1
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz

```

java code:

```java

import java.util.Scanner;

public class p0
