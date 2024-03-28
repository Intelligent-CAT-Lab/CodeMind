

```java
import java.util.Scanner;

public class Bitset2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < Math.pow(2, n); i++) {
            System.out.print(i + ":");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(" " + j);
                }
            }
            System.out.println();
        }
    }
}
```

## Bitset 3 - Enumeration of Subsets 2

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
0
1:v 0
N2: 1
k?@Iz)
4 2
eC -}Q
6: 1 2
g<L'-QJK
8:L 3
9:: 0 3
10: 13
11x: 0 1 3
1l2: 2 3
jU; IY2 3
4: 1 2 3
15: 0 1 2 

```
#!/usr/bin/env python3
# Bitset 3 - Enumeration of Subsets 2


def subset(n):
    for i in range(2**n):
        yield [v for v in range(n) if i & (1 << v) > 0]


def run():
    n = int(input())

    for i, vs in enumerate(subset(n)):
        print("{}:{}".format(i, "".join([" {}".format(v) for v in vs])))


if __name__ == '__main__':
    run()


```

java code:

```java
import java.util.Scanner;

public class Bitset3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < Math.pow(2, n); i++) {
            System.out.print(i + ":");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(" " + j);
                }
            }
            System.out.println();
        }
    }
}
```

## Bitset 4 - Enumeration of Subsets 3

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
0
1:v 0
N2: 1
k?@Iz)
4 2
eC -}Q
6: 1 2
g<L'-QJK
8:L 3
9:: 0 3
10: 13
11x: 0 1 3
1l2: 2 3
jU; IY2 3
4: 1 2 3
15: 0 1 2 

```
#!/usr/bin/env python3
# Bitset 4 - Enumeration of Subsets 3


def subset(n):
    for i in range(2**n):
        yield [v for v in range(n) if i & (1 << v) > 0]


def run():
    n = int(input())

    for i, vs in enumerate(subset(n)):
        print("{}:{}".format(i, "".join([" {}".format(v) for v in vs])))


if __name__ == '__main__':
    run()


```

java code:

```java
import java.util.Scanner;

public class Bitset4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < Math.pow(2, n); i++) {
            System.out.print(i + ":");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(" " + j);
                }
            }
            System.out.println();
        }
    }
}
```
/docs/01-introduction/01-introduction.md
# Introduction

## Introduction to Java

Java is a general-purpose programming language that is class-based, object-oriented, and designed to have as few implementation dependencies as possible. It is intended to let application developers "write once, run anywhere" (WORA), meaning that compiled Java code can run on all platforms that support Java without the need for recompilation. Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them.

The Java language was originally developed by  at Sun Microsystems (which has since been acquired by Oracle Corporation) and released in 1995 as a core component of Sun Microsystems' Java platform. The language derives much of its syntax from C and C++, but it has fewer low-level facilities than either of them.

The original and reference implementation Java compilers, virtual machines, and class libraries were developed by Sun. In January 2007, Sun released the Java platform to the public as Java SE.

Subsequently, Oracle has taken over as the leading provider of the Java platform. Oracle has also released additional Java platforms, including Java ME for embedded systems, and Java EE for enterprise computing.

## Java Virtual Machine

The Java Virtual Machine (JVM) is an abstract computing machine that enables a computer to run a Java program. It is a specification that can be implemented on many hardware and software platforms.

The JVM is a virtual machine that enables a computer to run a Java program. It is a specification that can be implemented on many hardware and software platforms.

The JVM is a virtual machine that enables a computer to run a Java program. It is a specification that can be implemented on many hardware and software platforms.

The JVM is a virtual machine that enables a computer to run a Java program. It is a specification that can be implemented on many hardware and software platforms.

The JVM is a virtual machine that enables a computer to run a Java program. It is a specification that can be implemented on many hardware and software platforms.

The JVM is a virtual machine that enables a computer to run a Java program. It is a specification that can be implemented on many hardware and software platforms.

The JVM is a virtual machine that enables a computer to run a Java program. It is a specification that can be implemented on many hardware and software platforms.

The JVM is a virtual machine that enables a computer to run a Java program. It is a specification that can be implemented on many hardware and software platforms.

The JVM is a virtual machine that enables a computer to run a Java program. It is a specification that can be implemented on many hardware and software platforms.

The JVM is a virtual machine that enables a computer to run a Java program. It is a specification that can be implemented on many hardware and software platforms.

The JVM is a virtual machine that enables a computer to run a Java program. It is a specification that can be implemented on many hardware and software platforms.

The JVM is a virtual machine that enables a computer to run a Java program. It is a specification that can be implemented on many hardware and software platforms.

The JVM is a virtual machine that enables a computer to run a Java program. It is a specification that can be implemented on many hardware and software platforms
