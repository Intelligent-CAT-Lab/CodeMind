
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (n >= 2) {
            if (b >= a) {
                System.out.println((n - 2) * (b - a) + 1);
            } else {
                System.out.println(0);
            }
        } else {
            if (a == b) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

bobbobbob

Expected output:

3

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

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

bobbobbob

Expected output:

3

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

## 4.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

bobbobbob

Expected output:

3

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
/README.md
# Java-Programming-and-Software-Engineering-Fundamentals

## Week 1

### 1.1 Introduction to Java

#### 1.1.1 What is Java?

Java is a programming language and computing platform first released by Sun Microsystems in 1995. There are lots of applications and websites that will not work unless you have Java installed, and more are created every day. Java is fast, secure, and reliable. From laptops to datacenters, game consoles to scientific supercomputers, cell phones to the Internet, Java is everywhere!

#### 1.1.2 What is a programming language?

A programming language is a formal language that specifies a set of instructions that can be used to produce various kinds of output. Programming languages generally consist of instructions for a computer. Programming languages can be used to create programs that implement specific algorithms.

#### 1.1.3 What is a computer program?

A computer program is a sequence of instructions that specifies how to perform a computation. The computation might be something mathematical, such as solving a system of equations or finding the roots of a polynomial, but it can also be a symbolic computation, such as searching and replacing text in a document or (strangely enough) compiling a program.

#### 1.1.4 What is a compiler?

A compiler is a computer program (or a set of programs) that transforms source code written in a programming language (the source language) into another computer language (the target language), with the latter often having a binary form known as object code.

#### 1.1.5 What is an interpreter?

An interpreter is a computer program that directly executes, i.e. performs, instructions written in a programming or scripting language, without previously compiling them into a machine language program.

#### 1.1.6 What is Java Virtual Machine?

The Java Virtual Machine (JVM) is an abstract computing machine that enables a computer to run a Java program. As with a real computing machine, a Java virtual machine performs operations, manipulates data, and controls the flow of the program.

#### 1.1.7 What is Java Development Kit?

The Java Development Kit (JDK) is an implementation of either one of the Java Platform, Standard Edition, Java Platform, Enterprise Edition, or Java Platform, Micro Edition platforms released by Oracle Corporation in the form of a binary product aimed at Java developers on Solaris, Linux, macOS or Windows.

#### 1.1.8 What is Java Runtime Environment?

The Java Runtime Environment (JRE) is a software package that provides the minimum requirements for running a Java application. It consists of the Java Virtual Machine (JVM), core classes, and supporting files that are necessary to run Java applications.

#### 1.1.9 What is Java Standard Edition?

The Java Platform, Standard Edition (Java SE) is a widely used enterprise platform for developing and deploying client and server applications. It includes the Java Development Kit (JDK), Java Runtime Environment (JRE), and a set of core Java libraries.

#### 1.1.10 What is Java Enterprise Edition?

The Java Platform, Enterprise Edition (Java EE) is a set of specifications that defines a platform for developing and running enterprise applications. It includes the Java Platform, Standard Edition (Java SE) and a set of additional libraries and APIs for developing distributed, transactional, and secure applications.

#### 1.1.11 What is Java Micro Edition?

The Java Platform, Micro Edition (Java ME) is a subset of the Java Platform, Standard Edition (Java SE) that is designed for devices with limited resources, such as mobile phones and embedded systems. It includes a subset of the Java SE libraries and APIs, and a reduced set of features to support small devices.

#### 1.1.12 What is JavaFX?

JavaFX is a software platform for creating and delivering desktop applications, as well as rich Internet applications (RIAs) that can run across a wide variety of devices. It is a successor to the Java 2D API, and is part of Oracle's Java Platform, Standard Edition (Java SE).

#### 1.1.13 What is Java Card?

Java Card is a software platform for securely executing Java applications on smart cards and other small, embedded devices. It is designed to provide a secure and reliable environment for executing Java applications in a resource-constrained environment.

#### 1.1.14 What is Java Web Start?

Java Web Start is a technology that allows Java applications to be launched from a web browser without the need for a separate installation process. It provides a secure and reliable environment for executing Java applications in a web browser.

#### 1.1.15 What is Java Applet?

A Java applet is a small program that runs in a web browser. It can be used to create interactive applications that can be embedded in web pages. Java applets are written in the Java programming language and compiled into bytecode that can be executed by the Java Virtual Machine.

#### 1.1.16 What is JavaBeans?

JavaBeans is a component-based software architecture for creating reusable software components in Java. It defines a standard for creating and using software components that can be used in a variety of software applications.

#### 1.1.17 What is JavaServer Faces?

JavaServer Faces (JSF) is a Java specification for creating dynamic, interactive web applications. It provides a standard way to define user interfaces, handle user input, and manage application state.

#### 1.1.18 What is JavaServer Pages?

JavaServer Pages (JSP) is a technology for creating dynamic web pages that can be embedded in a
