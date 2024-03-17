

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        if (n == 1) {
            System.out.println(p);
        } else if (p == 1) {
            System.out.println(1);
        } else if (n >= 40) {
            System.out.println(1);
        } else {
            int ans = 1;
            int count = 2;
            int tmp = (int) Math.pow(count, n);
            while (tmp <= p) {
                if (p % tmp == 0) {
                    ans *= count;
                    p = p / tmp;
                    count--;
                }
                count++;
                tmp = (int) Math.pow(count, n);
            }
            System.out.println(ans);
        }
    }
}
```
/docs/01-introduction/01-introduction.md
# Introduction

## What is programming?

Programming is the process of writing a set of instructions that tell a computer how to perform a task.

## What is a computer?

A computer is a machine that can be instructed to carry out sequences of arithmetic or logical operations automatically via computer programming. Modern computers have the ability to follow generalized sets of operations, called programs. These programs enable computers to perform an extremely wide range of tasks. A "complete" computer including the hardware, the operating system (main software), and peripheral equipment required and used for "full" operation can be referred to as a computer system. This term may as well be used for a group of computers that are connected and work together, in particular a computer network or computer cluster.

## What is a programming language?

A programming language is a formal language comprising a set of instructions that produce various kinds of output. Programming languages are used in computer programming to implement algorithms. Most programming languages consist of instructions for computers. There are programmable machines that use a set of specific instructions, rather than general programming languages. Since the early 1980s, however, programming languages have become common.

## What is a compiler?

A compiler is a computer program that transforms source code written in a programming language (the source language) into another computer language (the target language, often having a binary form known as object code). The most common reason for converting source code is to create an executable program. The name compiler is primarily used for programs that translate source code from a high-level programming language to a lower level language (e.g., assembly language, object code, or machine code) to create an executable program.

## What is an interpreter?

An interpreter is a computer program that directly executes, i.e. performs, instructions written in a programming or scripting language, without previously compiling them into a machine language program. An interpreter generally uses one of the following strategies for program execution:

- parse the source code and perform its behavior directly;
- translate source code into some efficient intermediate representation and immediately execute this;
- explicitly execute stored precompiled code made by a compiler which is part of the interpreter system.

## What is a script?

A script is a program written for a special run-time environment that automates the execution of tasks that could alternatively be executed one-by-one by a human operator. Scripts are typically used to automate administrative tasks performed on a computer or server.

## What is a program?

A program is a sequence of instructions that specifies how to perform a computation. The computation might be something mathematical, such as solving a system of equations or finding the roots of a polynomial, but it can also be a symbolic computation, such as searching and replacing text in a document or (strangely enough) compiling a program.

The details look different in different languages, but a few basic instructions appear in just about every language:

- input: Get data from the keyboard, a file, or some other device.
- output: Display data on the screen or send data to a file or other device.
- math: Perform basic mathematical operations like addition and multiplication.
- conditional execution: Check for certain conditions and execute the appropriate sequence of statements.
- repetition: Perform some action repeatedly, usually with some variation.

Believe it or not, that’s pretty much all there is to it. Every program you’ve ever used, no matter how complicated, is made up of instructions that look pretty much like these. So you can think of programming as the process of breaking a large, complex task into smaller and smaller subtasks until the subtasks are simple enough to be performed with one of these basic instructions.

That may be a little vague, but we will come back to this topic later when we talk about algorithms.

## What is an algorithm?

An algorithm is a self-contained step-by-step set of operations to be performed. Algorithms perform calculation, data processing, and/or automated reasoning tasks.

## What is a program structure?

A program structure is a set of rules that defines the structure of a program.

## What is a program design?

A program design is a set of rules that defines the design of a program.

## What is a program implementation?

A program implementation is a set of rules that defines the implementation of a program.

## What is a program testing?

A program testing is a set of rules that defines the testing of a program.

## What is a program debugging?

A program debugging is a set of rules that defines the debugging of a program.

## What is a program maintenance?

A program maintenance is a set of rules that defines the maintenance of a program.

## What is a program documentation?

A program documentation is a set of rules that defines the documentation of a program.

## What is a program verification?

A program verification is a set of rules that defines the verification of a program.

## What is a program validation?

A program validation is a set of rules that defines the validation of a program.

## What is a program optimization?

A program optimization is a set of rules that defines the optimization of a program.

## What is a program portability?

A program portability is a set of rules that defines the portability of a program.

## What is a program security?

A program security is a set of rules that defines the security of a program.

## What is a program reliability?

A program reliability is a set of rules that defines the reliability of a program.

## What is a program scalability?

A program scalability is a set of rules that defines the scalability of a program.

## What is a program performance?

A program performance is a set of rules that defines the performance of a program.

## What is a program efficiency?

A program efficiency is a set of rules that defines the efficiency of a program.

## What is a program maintainability?

A program maintainability is a set of rules that defines the maintainability of a program.

## What is a program readability?

A program readability is a set of rules that defines the readability of a program.

## What is a program reusability?

A program reusability is a set of rules that defines the reusability of a program.

## What is a program extensibility?

A program extensibility is a set of rules that defines the extensibility of a program.

## What is a program modularity?

A program modularity is a set of rules that defines the modularity of a program.

## What is a program robustness?

A program robustness is a set of rules that defines the robustness of a program.

## What is a program portability?

A program portability is a set of rules that defines the portability of a program.

## What is a program scalability?

A program scalability is a set of rules that defines the scalability of a program.

## What is a program reliability?

A program reliability is a set of rules that defines the reliability of a program.

## What is a program security?

A program security is a set of rules that defines the security of a program.

## What is a program efficiency?

A program efficiency is a set of rules that defines the efficiency of a program.

## What is
