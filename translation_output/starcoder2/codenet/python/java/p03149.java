
```
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[] b = {1, 4, 7, 9};
        String ans = "NO";
        if (Arrays.equals(a, b)) {
            ans = "YES";
        }
        System.out.println(ans);
    }
}
```

## 2.
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

```
Example:
Input:
bobbobbob
Output:
3
```

```
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

## Course Description

This course is an introduction to Java programming and software engineering fundamentals. It covers the basics of the Java programming language, including variables, control structures, methods, arrays, and object-oriented programming. It also covers software engineering fundamentals, including software development life cycle, software requirements, software design, and software testing.

## Course Objectives

By the end of this course, students will be able to:

- Understand the basics of the Java programming language, including variables, control structures, methods, arrays, and object-oriented programming.
- Understand software engineering fundamentals, including software development life cycle, software requirements, software design, and software testing.
- Apply these concepts to solve real-world problems using Java programming.

## Course Outline

The course is divided into 10 modules, each covering a specific topic. Here is a brief outline of each module:

1. Introduction to Java Programming: This module introduces the Java programming language and its features. It covers the basics of Java syntax, including variables, control structures, methods, and arrays.

2. Object-Oriented Programming in Java: This module covers object-oriented programming in Java, including classes, objects, inheritance, and polymorphism.

3. Software Development Life Cycle: This module covers the software development life cycle, including requirements analysis, design, implementation, testing, and maintenance.

4. Software Requirements: This module covers the process of gathering and analyzing software requirements, including functional and non-functional requirements.

5. Software Design: This module covers the process of designing software, including design patterns, UML diagrams, and software architecture.

6. Software Testing: This module covers the process of testing software, including unit testing, integration testing, and system testing.

7. Software Maintenance: This module covers the process of maintaining software, including bug fixing, enhancement, and refactoring.

8. Java Collections Framework: This module covers the Java Collections Framework, including lists, sets, maps, and iterators.

9. Java I/O: This module covers the Java I/O API, including file I/O, network I/O, and serialization.

10. Java Concurrency: This module covers the Java concurrency API, including threads, synchronization, and concurrent data structures.

## Course Prerequisites

This course assumes that students have a basic understanding of programming concepts and have some experience with another programming language.

## Course Materials

The course materials include lecture slides, assignments, and quizzes.

## Course Assessment

The course assessment will be based on assignments, quizzes, and a final project.

## Course Schedule

The course schedule is as follows:

- Module 1: Introduction to Java Programming (Week 1)
- Module 2: Object-Oriented Programming in Java (Week 2)
- Module 3: Software Development Life Cycle (Week 3)
- Module 4: Software Requirements (Week 4)
- Module 5: Software Design (Week 5)
- Module 6: Software Testing (Week 6)
- Module 7: Software Maintenance (Week 7)
- Module 8: Java Collections Framework (Week 8)
- Module 9: Java I/O (Week 9)
- Module 10: Java Concurrency (Week 10)

## Course Instructor

The course instructor is , a software engineer with extensive experience in Java programming and software engineering.

## Course Communication

Students will be expected to attend all lectures and participate in discussions. They will also be expected to complete assignments and quizzes on time.

## Course Feedback

Students will be encouraged to provide feedback on the course through online surveys and in-class discussions.

## Course Resources

The course will provide students with access to online resources, including lecture slides, assignments, and quizzes.

## Course Support

Students will be provided with support through online forums and in-class discussions.

## Course Evaluation

The course evaluation will be based on assignments, quizzes, and a final project.

## Course Conclusion

This course is an introduction to Java programming and software engineering fundamentals. It covers the basics of the Java programming language and software engineering fundamentals. Students will be able to apply these concepts to solve real-world problems using Java programming.
/Week 1/README.md
# Week 1

## 1.
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

```
Example:
Input:
bobbobbob
Output:
3
```

```
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

## 2.
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

```
Example:
Input:
bobbobbob
Output:
3
```

```
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

```
Example:
Input:
bobbobbob
Output:
3
```

```
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

```
Example:
Input:
bobbobbob
Output:
3
```

```
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
