
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(Math.ceil(h / a));
    }
}
```


```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        System.out.println((n / a + (n % a > 0 ? 1 : 0)) * (m / a + (m % a > 0 ? 1 : 0)));
    }
}
```
/codeforces/1A.md
# A. Theatre Square

## Problem

Theatre Square in the capital city of Berland has a rectangular shape with the size n × m meters. On the occasion of the city's anniversary, a decision was taken to pave the Square with square granite flagstones. Each flagstone is of the size a × a.

What is the least number of flagstones needed to pave the Square? It's allowed to cover the surface larger than the Theatre Square, but the Square has to be covered. It's not allowed to break the flagstones. The sides of flagstones should be parallel to the sides of the Square.

## Input

The input contains three positive integer numbers in the first line: n,  m and a (1 ≤  n, m, a ≤ 109).

## Output

Write the needed number of flagstones.

## Examples

### input
```
6 6 4
```

### output
```
4
```

### input
```
1 1 1
```

### output
```
1
```

### input
```
2 3 4
```

### output
```
1
```

## Note

In the first sample there is one possible variant to pave the Square.

In the second sample any 1 × 1 square will suit.

In the third sample you should split the Square into two rectangles of 2 × 1 and 2 × 2 sizes.

## Solution

```python
n, m, a = map(int, input().split())
print((n // a + (n % a > 0)) * (m // a + (m % a > 0)))/codeforces/118A.md
# A. String Task

## Problem

Petya started to attend programming lessons. On the first lesson his task was to write a simple program. The program was supposed to do the following: in the given string, consisting if uppercase and lowercase Latin letters, it:

deletes all the vowels,
inserts a character "." before each consonant,
replaces all uppercase consonants with corresponding lowercase ones.
Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants. The program's input is exactly one string, it should return the output as a single string, resulting after the program's processing the initial string.

Help Petya cope with this easy task.

## Input

The first line represents input string of Petya's program. This string only consists of uppercase and lowercase Latin letters and its length is from 1 to 100, inclusive.

## Output

Print the resulting string. It is guaranteed that this string is not empty.

## Examples

### input
```
tour
```

### output
```
.t.r
```

### input
```
Codeforces
```

### output
```
.c.d.f.r.c.s
```

### input
```
aBAcAba
```

### output
```
.b.c.b
```

## Solution

```python
s = input()
vowels = 'AEIOUY'
print('.'.join(c.lower() for c in s if c not in vowels))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String vowels = "AEIOUY";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) == -1) {
                sb.append(".");
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println(sb.toString());
    }
}
```
/codeforces/231A.md
# A. Team

## Problem

One day three best friends Petya, Vasya and Tonya decided to form a team and take part in programming contests. Participants are usually offered several problems during programming contests. Long before the start the friends decided that they will implement a problem if at least two of them are sure about the solution. Otherwise, the friends won't write the problem's solution.

This contest offers n problems to the participants. For each problem we know, which friend is sure about the solution. Help the friends find the number of problems for which they will write a solution.

## Input

The first input line contains a single integer n (1 ≤ n ≤ 1000) — the number of problems in the contest. Then n lines contain three integers each, each integer is either 0 or 1. If the first number in the line equals 1, then Petya is sure about the problem's solution, otherwise he isn't sure. The second number shows Vasya's view on the solution, the third number shows Tonya's view. The numbers on the lines are separated by spaces.

## Output

Print a single integer — the number of problems the friends will implement on the contest.

## Examples

### input
```
3
1 1 0
1 1 1
1 0 0
```

### output
```
2
```

### input
```
2
1 0 0
0 1 1
```

### output
```
1
```

## Note

In the first sample Petya and Vasya are sure that they know how to solve the first problem and all three friends know how to solve the second problem. That means that they will write solutions for these problems. Only Petya is sure about the solution for the third problem, but that isn't enough, so the friends won't take it.

In the second sample the friends will only implement the first problem, as Vasya and Tonya are sure about the solution.

## Solution

```python
n = int(input())
print(sum(1 for _ in range(n) if sum(map(int, input().split())) >= 2))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + b + c >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## Solution 2

```python
n = int(input())
print(sum(1 for _ in range(n) if sum(map(int, input().split())) >= 2))
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a + b + c >= 2) {
                count++;
           
