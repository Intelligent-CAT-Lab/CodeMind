

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = 0;
        int h = 0;
        int w = 0;

        for (int i = 1; i < 3501; i++) {
            for (int j = 1; j < 3501; j++) {
                int tmp1 = N * i * j;
                int tmp2 = (4 * i * j) - (N * j) - (N * i);
                if (tmp2 != 0) {
                    int s = tmp1 / tmp2;
                    int m = tmp1 % tmp2;
                    if (m == 0 && s >= 0) {
                        n = i;
                        h = j;
                        w = s;
                        System.out.println(n + " " + h + " " + w);
                        return;
                    }
                }
            }
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

A compiler is a computer program that transforms source code written in a programming language (the source language) into another computer language (the target language, often having a binary form known as object code). The most common reason for converting source code is to create an executable program. The term "compiler" is primarily used for programs that translate source code from a high-level programming language to a lower level language (e.g., assembly language, object code, or machine code) to create an executable program. Smaller, more specialized translators, such as those generating code for a single computer architecture, may be called assemblers or linkers.

## What is an interpreter?

An interpreter is a computer program that directly executes, i.e. performs, instructions written in a programming or scripting language, without previously compiling them into a machine language program. An interpreter generally uses one of the following strategies for program execution:

- parse the source code and perform its behavior directly;
- translate source code into some efficient intermediate representation and immediately execute this;
- explicitly execute stored precompiled code made by a compiler which is part of the interpreter system.

## What is a programming paradigm?

A programming paradigm is a fundamental style of computer programming, a way of building the structure and elements of computer programs. Programming paradigms differ in their support for the construction of software.

## What is an algorithm?

An algorithm is a finite sequence of well-defined, computer-implementable instructions, typically to solve a class of problems or to perform a computation. Algorithms are always unambiguous and are used as specifications for performing calculations, data processing, automated reasoning, and other tasks.

## What is a data structure?

A data structure is a data organization, management, and storage format that enables efficient access and modification. More precisely, a data structure is a collection of data values, the relationships among them, and the functions or operations that can be applied to the data.

## What is a variable?

A variable is a storage location paired with an associated symbolic name (an identifier), which contains some known or unknown quantity or information, a value. The variable name is the usual way to reference the stored value; this separation of name and content allows the name to be used independently of the exact information it represents. The identifier in computer source code can be bound to a value during run time, and the value of the variable may thus change during the course of program execution.

## What is a constant?

A constant is a fixed value that cannot be altered by the program during normal execution, i.e., the value is constant. Constants are used to avoid magic numbers in the code.

## What is a keyword?

A keyword is a reserved word that is used to identify a syntactic construct in a programming language. Keywords are used to construct the basic units of a programming language.

## What is a statement?

A statement is a syntactic unit of an imperative programming language that expresses some action to be carried out. A program written in such a language is formed by a sequence of one or more statements.

## What is an expression?

An expression is a combination of one or more constants, variables, operators, and functions that the programming language interprets (according to its particular rules of precedence and of association) and computes to produce ("to return", in a stateful environment) another value. This process, i.e. evaluation, is called evaluation of the expression.

## What is an operator?

An operator is a symbol that tells the compiler to perform specific mathematical or logical functions.

## What is a function?

A function is a block of code that performs a specific task. A function can be called from other parts of the program.

## What is a method?

A method is a function that is a member of a class.

## What is a class?

A class is a blueprint for creating objects (a particular data structure), providing initial values for state (member variables or attributes), and implementations of behavior (member functions or methods). The user-defined objects are created using the class keyword.

## What is an object?

An object is a basic unit of object-oriented programming and a key concept of object-oriented programming. An object can be defined as an instance of a class.

## What is an object-oriented programming?

Object-oriented programming (OOP) is a programming paradigm based on the concept of "objects", which can contain data and code: data in the form of fields (often known as attributes or properties), and code, in the form of procedures (often known as methods). A feature of objects is that an object's own procedures can access and often modify the data fields of itself (objects have a notion of "this" or "self"). In OOP, computer programs are designed by making them out of objects that interact with one another.

## What is a data type?

A data type is a classification of data which tells the compiler or interpreter how the programmer intends to use the data. Most programming languages support the following data types:

- Numeric data types
- Character data types
- Boolean data types

## What is a data structure?

A data structure is a data organization, management, and storage format that enables efficient access and modification. More precisely, a data structure is a collection of data values, the relationships among them, and the functions or operations that can be applied to the data.

## What is a data structure?

A data structure is a data organization, management, and storage format that enables efficient access and modification. More precisely, a data structure is a collection of data values, the relationships among them, and the functions or operations that can be applied to the data.

## What is a data structure?

A data structure is a data organization, management, and storage format that enables efficient access and modification. More precisely, a data structure is a collection of data values, the relationships among them, and the functions or operations that can be applied to the data.

## What is a data structure?

A data structure is a data organization, management, and storage format that enables efficient access and modification. More
