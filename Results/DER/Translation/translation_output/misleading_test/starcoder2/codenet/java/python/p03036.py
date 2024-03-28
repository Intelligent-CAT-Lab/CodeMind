

```python
r,d,x = map(int,input().split())
for i in range(10):
    x = r*x - d
    print(x)
```


```
---
layout: post
title:  "Python 101"
date:   2019-01-01 10:00:00 +0530
categories: python
---

# Python 101

## 1. Introduction

Python is a high-level, interpreted, interactive and object-oriented scripting language. Python is designed to be highly readable. It uses English keywords frequently where as other languages use punctuation, and it has fewer syntactical constructions than other languages.

Python is Interpreted − Python is processed at runtime by the interpreter. You do not need to compile your program before executing it. This is similar to PERL and PHP.

Python is Interactive − You can actually sit at a Python prompt and interact with the interpreter directly to write your programs.

Python is Object-Oriented − Python supports Object-Oriented style or technique of programming that encapsulates code within objects.

Python is a Beginner's Language − Python is a great language for the beginner-level programmers and supports the development of a wide range of applications from simple text processing to WWW browsers to games.

## 2. Python IDE

There are many IDEs available for python. Some of them are:

* PyCharm
* Spyder
* Visual Studio Code
* Atom
* Sublime Text
* Jupyter Notebook

## 3. Python Syntax

Python is a case sensitive language.

### 3.1. Indentation

Indentation refers to the spaces at the beginning of a code line.

Where in other programming languages the indentation in code is for readability only, the indentation in Python is very important.

Python uses indentation to indicate a block of code.

### 3.2. Comments

Comments starts with a #, and Python will ignore them:

```python
#This is a comment
print("Hello, World!")
```

### 3.3. Variables

Variables are containers for storing data values.

Unlike other programming languages, Python has no command for declaring a variable.

A variable is created the moment you first assign a value to it.

```python
x = 5
y = "John"
print(x)
print(y)
```

### 3.4. Data Types

In programming, data type is an important concept.

Variables can store data of different types, and different types can do different things.

Python has the following data types built-in by default, in these categories:

* Text Type:    str
* Numeric Types:    int, float, complex
* Sequence Types:    list, tuple, range
* Mapping Type:    dict
* Set Types:    set, frozenset
* Boolean Type:    bool
* Binary Types:    bytes, bytearray, memoryview

### 3.5. Casting

If you want to specify the data type of a variable, this can be done with casting.

Python is an object-orientated language, and as such it uses classes to define data types, including its primitive types.

Casting in python is therefore done using constructor functions:

* int() - constructs an integer number from an integer literal, a float literal (by rounding down to the previous whole number), or a string literal (providing the string represents a whole number)
* float() - constructs a float number from an integer literal, a float literal or a string literal (providing the string represents a float or an integer)
* str() - constructs a string from a wide variety of data types, including strings, integer literals and float literals

### 3.6. Strings

Strings in python are surrounded by either single quotation marks, or double quotation marks.

'hello' is the same as "hello".

You can display a string literal with the print() function:

```python
print("Hello")
print('Hello')
```

### 3.7. Operators

Operators are used to perform operations on variables and values.

Python divides the operators in the following groups:

* Arithmetic operators
* Assignment operators
* Comparison operators
* Logical operators
* Identity operators
* Membership operators
* Bitwise operators

### 3.8. Arithmetic Operators

Arithmetic operators are used with numeric values to perform common mathematical operations:

| Operator | Name | Example |
|----------|------|---------|
| + | Addition | x + y |
| - | Subtraction | x - y |
| * | Multiplication | x * y |
| / | Division | x / y |
| % | Modulus | x % y |
| ** | Exponentiation | x ** y |
| // | Floor division | x // y |

### 3.9. Assignment Operators

Assignment operators are used to assign values to variables:

| Operator | Example | Same As |
|----------|---------|---------|

