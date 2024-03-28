

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        System.out.println(pow(m, n, mod));
    }

    public static int pow(int m, int n, int mod) {
        if (n == 0) {
            return 1;
        }
        int temp = pow(m, n / 2, mod);
        if (n % 2 == 0) {
            return (temp * temp) % mod;
        } else {
            return (((temp * temp) % mod) * m) % mod;
        }
    }
}
```
/docs/01.python/05.CS61A/02.Functions/01.Functions.md
---
title: Functions
date: 2021-07-28 16:11:49
permalink: /pages/50194a/
categories:
  - python
  - CS61A
tags:
  - 
---
# Functions

## 1.1 Defining Functions

### 1.1.1 Functions as Abstractions

- Functions are a method of abstraction that describe compound operations independent of specific values.
- Functions can be applied to arguments with the same names and values.
- Functions can be defined within other expressions.
- Functions can be passed as arguments to other functions.
- Functions can return functions as values.

### 1.1.2 Defining Functions

- A function definition is a statement.
- A function definition binds a name to a function.
- The function body is executed when the function is applied.
- The function body is executed repeatedly when the function is applied repeatedly.
- The function body may contain free variables that are bound in the environment where the function is defined.

### 1.1.3 Function Application

- A function application is an expression.
- A function application evaluates to the value of the function body in a new environment.
- The new environment binds the function's formal parameters to the arguments.
- The new environment also binds the free variables in the function body to the same values they were bound to in the environment where the function was defined.

### 1.1.4 Nested Definitions

- A function definition can be nested inside another function definition.
- The nested function is bound in the environment where the outer function is defined.
- The nested function can be returned as a value from the outer function.
- The nested function can be applied within the outer function.

### 1.1.5 Functions as Arguments

- A function can be passed as an argument to another function.
- The function that is passed as an argument is bound to the name of the formal parameter in the environment where the function is applied.
- The function that is passed as an argument can be applied within the body of the function that is applied.

### 1.1.6 Functions as General Methods

- Functions can be used as general methods to abstract over processes, even when the methods apply to more than one type of argument.
- Functions can be used to express computational objects that have corresponding mathematical objects.
- Functions can be used to express computational objects that have no corresponding mathematical objects.

### 1.1.7 Functions as Returned Values

- A function can be returned as a value from another function.
- The function that is returned as a value is bound to the name of the formal parameter in the environment where the function is applied.
- The function that is returned as a value can be applied within the body of the function that is applied.

### 1.1.8 Example: Arithmetic

- The `add` function is a higher-order function that takes two functions as arguments and returns a function as a value.
- The `add` function can be used to define the `add_one` function, which adds 1 to its argument.
- The `add` function can be used to define the `add_three` function, which adds 3 to its argument.
- The `add` function can be used to define the `add_five` function, which adds 5 to its argument.
- The `add` function can be used to define the `add_seven` function, which adds 7 to its argument.
- The `add` function can be used to define the `add_nine` function, which adds 9 to its argument.
- The `add` function can be used to define the `add_ten` function, which adds 10 to its argument.
- The `add` function can be used to define the `add_twenty` function, which adds 20 to its argument.
- The `add` function can be used to define the `add_thirty` function, which adds 30 to its argument.
- The `add` function can be used to define the `add_forty` function, which adds 40 to its argument.
- The `add` function can be used to define the `add_fifty` function, which adds 50 to its argument.
- The `add` function can be used to define the `add_sixty` function, which adds 60 to its argument.
- The `add` function can be used to define the `add_seventy` function, which adds 70 to its argument.
- The `add` function can be used to define the `add_eighty` function, which adds 80 to its argument.
- The `add` function can be used to define the `add_ninety` function, which adds 90 to its argument.
- The `add` function can be used to define the `add_hundred` function, which adds 100 to its argument.
- The `add` function can be used to define the `add_thousand` function, which adds 1000 to its argument.
- The `add` function can be used to define the `add_ten_thousand` function, which adds 10000 to its argument.
- The `add` function can be used to define the `add_hundred_thousand` function, which adds 100000 to its argument.
- The `add` function can be used to define the `add_million` function, which adds 1000000 to its argument.
- The `add` function can be used to define the `add_billion` function, which adds 1000000000 to its argument.
- The `add` function can be used to define the `add_trillion` function, which adds 1000000000000 to its argument.
- The `add` function can be used to define the `add_quadrillion` function, which adds 1000000000000000 to its argument.
- The `add` function can be used to define the `add_quintillion` function, which adds 1000000000000000000 to its argument.
- The `add` function can be used to define the `add_sextillion` function, which adds 1000000000000000000000 to its argument.
- The `add` function can be used to define the `add_septillion` function, which adds 1000000000000000000000000 to its argument.
- The `add` function can be used to define the `add_octillion` function, which adds 1000000000000000000000000000 to its argument.
- The `add` function can be used to define the `add_nonillion` function, which adds 1000000000000000000000000000000 to its argument.
- The `add` function can be used to define the `add_decillion` function, which adds 1000000000000000000000000000000000 to its argument.
- The `add` function can be used to define the `add_undecillion` function, which adds 1000000000
