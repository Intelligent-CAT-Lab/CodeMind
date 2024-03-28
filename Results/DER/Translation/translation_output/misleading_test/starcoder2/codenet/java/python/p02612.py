

```python
n = int(input())
x = n // 1000
y = n % 1000
if y == 0:
    print(0)
else:
    ans = 1000 * (x + 1) - n
    print(ans)
```
/docs/python/python-basics/python-basics-001.md
# Python Basics 001

## 1. What is Python?

Python is a general-purpose programming language that is becoming more and more popular for doing data science. Companies worldwide are using Python to harvest insights from their data and get a competitive edge. Unlike other programming languages, Python has a very gentle learning curve and a simple syntax. It is a high-level programming language, designed to be easy to read.

## 2. Why Python?

Python is a general-purpose programming language that is becoming more and more popular for doing data science. Companies worldwide are using Python to harvest insights from their data and get a competitive edge. Unlike other programming languages, Python has a very gentle learning curve and a simple syntax. It is a high-level programming language, designed to be easy to read.

## 3. Python Syntax

Python uses new lines to complete a command, as opposed to other programming languages which often use semicolons or parentheses.

Python relies on indentation, using whitespace, to define scope; such as the scope of loops, functions and classes. Other programming languages often use curly-brackets for this purpose.

## 4. Python Indentation

Indentation refers to the spaces at the beginning of a code line. Where in other programming languages the indentation in code is for readability only, the indentation in Python is very important.

Python uses indentation to indicate a block of code.

## 5. Python Comments

Comments can be used to explain Python code.

Comments can be used to make the code more readable.

Comments can be used to prevent execution when testing code.

## 6. Python Variables

Variables are containers for storing data values.

Unlike other programming languages, Python has no command for declaring a variable.

A variable is created the moment you first assign a value to it.

## 7. Python Numbers

There are three numeric types in Python:

int
float
complex

Variables of numeric types are created when you assign a value to them:

## 8. Python Strings

Strings in Python are arrays of bytes representing unicode characters.

However, Python does not have a character data type, a single character is simply a string with a length of 1.

Square brackets can be used to access elements of the string.

## 9. Python Booleans

Booleans represent one of two values: True or False.

## 10. Python Operators

Operators are used to perform operations on variables and values.

Python divides the operators in the following groups:

Arithmetic operators
Assignment operators
Comparison operators
Logical operators
Identity operators
Membership operators
Bitwise operators

## 11. Python Lists

Lists are used to store multiple items in a single variable.

Lists are one of 4 built-in data types in Python used to store collections of data, the other 3 are Tuple, Set, and Dictionary, all with different qualities and usage.

Lists are created using square brackets:

## 12. Python Tuples

A tuple is a collection which is ordered and unchangeable.

Tuples are written with round brackets.

## 13. Python Sets

A set is a collection which is unordered and unindexed.

In Python sets are written with curly brackets.

## 14. Python Dictionaries

A dictionary is a collection which is unordered, changeable and indexed.

Dictionaries are written with curly brackets, and they have keys and values.

## 15. Python If ... Else

Python supports the usual logical conditions from mathematics:

Equals: a == b
Not Equals: a != b
Less than: a < b
Less than or equal to: a <= b
Greater than: a > b
Greater than or equal to: a >= b
These conditions can be used in several ways, most commonly in "if statements" and loops.

An "if statement" is written by using the if keyword.

## 16. Python While Loops

With the while loop we can execute a set of statements as long as a condition is true.

## 17. Python For Loops

A for loop is used for iterating over a sequence (that is either a list, a tuple, a dictionary, a set, or a string).

This is less like the for keyword in other programming languages, and works more like an iterator method as found in other object-orientated programming languages.

With the for loop we can execute a set of statements, once for each item in a list, tuple, set etc.

## 18. Python Functions

A function is a block of code which only runs when it is called.

You can pass data, known as parameters, into a function.

A function can return data as a result.

## 19. Python Lambda

A lambda function is a small anonymous function.

A lambda function can take any number of arguments, but can only have one expression.

## 20. Python Arrays

Note: Python does not have built-in support for Arrays, but Python Lists can be used instead.

Arrays are used to store multiple values in one single variable:

## 21. Python Classes/Objects

Python is an object oriented programming language.

Almost everything in Python is an object, with its properties and methods.

A Class is like an object constructor, or a "blueprint" for creating objects.

## 22. Python Inheritance

Inheritance allows us to define a class that inherits all the methods and properties from another class.

Parent class is the class being inherited from, also called base class.

Child class is the class that inherits from another class, also called derived class.

## 23. Python Iterators

An iterator is an object that contains a countable number of values.

An iterator is an object that can be iterated upon, meaning that you can traverse through all the values.

Technically, in Python, an iterator is an object which implements the iterator protocol, which consist of the methods __iter__() and __next__().

## 24. Python Scope

A variable is only available from inside the region it is created. This is called scope.

## 25. Python Modules

Consider a module to be the same as a code library.

A file containing a set of functions you want to include in your application.

## 26. Python Dates

A date in Python is not a data type of its own, but we can import a module named datetime to work
