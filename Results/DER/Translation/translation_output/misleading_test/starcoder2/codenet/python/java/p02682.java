
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        ans += 1 * Math.min(a, k);
        k -= Math.min(a, k);
        ans += 0 * Math.min(b, k);
        k -= Math.min(b, k);
        ans += (-1) * Math.min(c, k);
        k -= Math.min(c, k);
        System.out.println(ans);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:
bobbobbob

Expected output:
3

```
s = input()
count = 0
for i in range(len(s)-2):
    if s[i:i+3] == "bob":
        count += 1
print(count)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that prints the longest substring of a string in which the letters occur in alphabetical order.

Test input:
azcbobobegghakl

Expected output:
beggh

```
s = input()
longest = s[0]
current = s[0]
for i in range(1, len(s)):
    if s[i] >= current[-1]:
        current += s[i]
    else:
        current = s[i]
    if len(current) > len(longest):
        longest = current
print(longest)
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = s.substring(0, 1);
        String current = s.substring(0, 1);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) >= current.charAt(current.length() - 1)) {
                current += s.charAt(i);
            } else {
                current = s.charAt(i) + "";
            }
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        System.out.println(longest);
    }
}
```
/README.md
# MITx-6.00.1x

## Introduction to Computer Science and Programming Using Python

This course is the first of a two-course sequence: Introduction to Computer Science and Programming Using Python, and Introduction to Computational Thinking and Data Science. Together, they are designed to help people with no prior exposure to computer science or programming learn to think computationally and write programs to tackle useful problems. Some of the people taking the two courses will use them as a stepping stone to more advanced computer science courses, but for many it will be their first and last computer science courses. This run of the course was offered in Fall 2016.

## Course Syllabus

### Week 1: Introduction

- Welcome to 6.00.1x!
- What is computation?
- Branching and iterations
- Kinds of iteration
- Guess and check
- Approximations and bisection
- Decomposition, abstraction, and functions

### Week 2: Simple Programs

- Tuples and lists
- Mutability
- Dictionaries
- Example: genetic algorithm
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)
- Example: 2048 (merge)
- Example: 2048 (full)
- Example: 2048 (smooth)

