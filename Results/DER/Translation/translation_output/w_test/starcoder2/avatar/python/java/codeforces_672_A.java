

```java

```
/docs/python/python-101/python-101-001.md
# Python 101

## 1. Introduction

### 1.1. What is Python?

Python is a programming language that lets you work quickly and integrate systems more effectively.

### 1.2. Why Python?

Python is a general-purpose programming language that is becoming more and more popular for doing data science. Companies worldwide are using Python to harvest insights from their data and get a competitive edge. Unlike other programming languages, Python has a very gentle learning curve and a simple syntax. It has a large community that builds a lot of libraries for you to use.

### 1.3. What is a Jupyter Notebook?

A Jupyter Notebook is an open-source web application that allows you to create and share documents that contain live code, equations, visualizations and narrative text. Uses include: data cleaning and transformation, numerical simulation, statistical modeling, data visualization, machine learning, and much more.

### 1.4. What is a Python Library?

A Python library is a collection of functions and methods that allows you to perform many actions without writing your code.

### 1.5. What is a Python Package?

A Python package is a collection of Python modules. A Python module is a Python code file that can have a set of functions, classes or variables defined and implemented.

### 1.6. What is a Python Module?

A Python module is a Python code file that can have a set of functions, classes or variables defined and implemented.

### 1.7. What is a Python Function?

A Python function is a block of code that performs a specific task. It is a set of statements that performs a specific task.

### 1.8. What is a Python Class?

A Python class is a blueprint for creating objects. It is a template definition of the method and variable in a particular class.

### 1.9. What is a Python Object?

A Python object is an instance of a class. It is a specific instance of a data structure that can have attributes and methods associated with it.

### 1.10. What is a Python Variable?

A Python variable is a reserved memory location to store values. It is a name given to a memory location.

### 1.11. What is a Python Data Type?

A Python data type is a classification that specifies which type of value a variable has.

### 1.12. What is a Python List?

A Python list is a collection of items which are ordered and changeable. It is a collection which is ordered and changeable.

### 1.13. What is a Python Tuple?

A Python tuple is a collection of items which are ordered and unchangeable. It is a collection which is ordered and unchangeable.

### 1.14. What is a Python Set?

A Python set is a collection of items which are unordered and unindexed. It is a collection which is unordered and unindexed.

### 1.15. What is a Python Dictionary?

A Python dictionary is a collection of items which are unordered, changeable and indexed. It is a collection which is unordered, changeable and indexed.

### 1.16. What is a Python If Statement?

A Python if statement is a conditional statement that runs or skips code based on whether a condition is true or false.

### 1.17. What is a Python For Loop?

A Python for loop is a control flow statement for specifying iteration, which allows code to be executed repeatedly.

### 1.18. What is a Python While Loop?

A Python while loop is a control flow statement for specifying iteration, which allows code to be executed repeatedly based on a given Boolean condition.

### 1.19. What is a Python Function?

A Python function is a block of code which only runs when it is called. It is a block of code which only runs when it is called.

### 1.20. What is a Python Lambda Function?

A Python lambda function is a small anonymous function. It is a small anonymous function.

### 1.21. What is a Python Array?

A Python array is a collection of items which are stored at contiguous memory locations. It is a collection which is stored at contiguous memory locations.

### 1.22. What is a Python File?

A Python file is a location 101

## 2. Python Basics

### 2.1. Printing

```python
print("Hello World")
```

### 2.2. Variables

```python
x = 5
y = "John"
print(x)
print(y)
```

### 2.3. Data Types

```python
x = 5
y = "John"
print(type(x))
print(type(y))
```

### 2.4. Casting

```python
x = int(1)   # x will be 1
y = int(2.8) # y will be 2
z = int("3") # z will be 3
```

### 2.5. Strings

```python
a = "Hello"
print(a[1])
```

### 2.6. Slicing

```python
b = "Hello, World!"
print(b[2:5])
```

### 2.7. Length

```python
a = "Hello, World!"
print(len(a))
```

### 2.8. Check String

```python
txt = "The best things in life are free!"
print("free" in txt)
```

### 2.9. Check if NOT

```python
txt = "The best things in life are free!"
print("expensive" not in txt)
```

### 2.10. String Concatenation

```python
a = "Hello"
b = "World"
c = a + b
print(c)
```

### 2.11. String Format

```python
age = 36
txt = "My name is John, and I am {}"
print(txt.format(age))
```

### 2.12. Escape Character

```python
txt = "We are the so-called \"Vikings\" from the north."
```

### 2.13. String Methods

```python
a = "Hello, World!"
print(a.upper())
```

### 2.14. Split String

```python
a = "Hello, World!"
print(a.split(",")) # returns ['Hello', ' World!']
```

### 2.15. Input

```python
username = input("Enter username:")
print("Username is: " + username)
```

### 2.16. Operators

```python
x = 5
y = 3
print(x + y)
```

### 2.17. Arithmetic Operators

```python
x = 5
y = 3
print(x + y)
print(x - y)
print(x * y)
print(x / y)
print(x % y)
print(x ** y)
print(x // y)
```

### 2.18. Assignment Operators

```python
x = 5
x += 3
print(x)
```

### 2.19. Comparison Operators

```python
x = 5
print(x == 5)
```

### 2.20. Logical Operators

