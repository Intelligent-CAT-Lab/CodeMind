
```

k, b = map(int, input().split())
print((k-1)*(b-1))

```

## 3. 10869

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p10869 {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int a = sc.nextInt();
        int b = sc.nextInt();

        out.println(a+b);
        out.println(a-b);
        out.println(a*b);
        out.println(a/b);
        out.println(a%b);
        out.flush();

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

```

python code:
```

a, b = map(int, input().split())
print(a+b)
print(a-b)
print(a*b)
print(a//b)
print(a%b)

```

## 4. 10430

Translate the following java code to python and enclose your solution inside ```python```:
```

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class p10430 {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        out.println((a+b)%c);
        out.println(((a%c)+(b%c))%c);
        out.println((a*b)%c);
        out.println(((a%c)*(b%c))%c);
        out.flush();

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

```

python code:
```

a, b, c = map(int, input().split())
print((a+b)%c)
print(((a%c)+(b%c))%c)
print((a*b)%c)
print(((a%c)*(b%c))%c)

```
/README.md
# Python-for-Java-Programmers

## 1. Introduction

### 1.1. What is Python?

Python is a programming language that is easy to learn and use. It is a general-purpose language that can be used for many different types of programming tasks.

### 1.2. Why Python?

Python is a great language to learn for beginners because it is easy to learn and use. It is also a general-purpose language that can be used for many different types of programming tasks.

### 1.3. How to use this book?

This book is designed to be used as a reference for Java programmers who want to learn Python. It is not intended to be a comprehensive introduction to Python.

### 1.4. What is the target audience?

This book is intended for Java programmers who want to learn Python. It is not intended to be a comprehensive introduction to Python.

### 1.5. What is the prerequisite knowledge?

This book assumes that the reader has some basic knowledge of Java programming.

### 1.6. What is the structure of this book?

This book is divided into several chapters. Each chapter covers a different topic related to Python programming.

### 1.7. What is the license of this book?

This book is licensed under the Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License.

## 2. Getting Started

### 2.1. Installing Python

To use Python, you need to install it on your computer. You can download the latest version of Python from the official website: https://www.python.org/downloads/.

### 2.2. Running Python

Once you have installed Python, you can run it by typing the following command in a terminal:

```
python
```

This will start the Python interpreter, which is a program that allows you to enter Python code and run it.

### 2.3. Hello World

To print "Hello World" in Python, you can use the following code:

```
print("Hello World")
```

This will print "Hello World" to the console.

### 2.4. Variables

In Python, variables are used to store data. You can create a variable by assigning a value to it using the assignment operator (=). For example:

```
x = 5
```

This creates a variable named x and assigns it the value 5.

### 2.5. Data Types

In Python, there are several different data types, including integers, floating-point numbers, strings, and booleans. For example:

```
x = 5
y = 3.14
z = "Hello"
a = True
```

This creates four variables, x,
