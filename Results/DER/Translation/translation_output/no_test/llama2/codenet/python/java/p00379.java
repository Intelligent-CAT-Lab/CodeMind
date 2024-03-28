<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a, n, m = map(int, input().split())
ans = 0
for y in range(1, 50):
    x = (y + a)**n
    if 1 <= x <= m and y == sum(map(int, str(x))):
        ans += 1
print(ans)

```

### Input

The first line of input contains three integers, $a, n, m$ ($1 \leq a \leq 10^9, 1 \leq n \leq 10^9, 1 \leq m \leq 10^9$).

### Output

Print a single integer, the answer to the problem.

### Constraints

- $1 \leq a \leq 10^9$
- $1 \leq n \leq 10^9$
- $1 \leq m \leq 10^9$

### Sample Input

```
1 2 3
```

### Sample Output

```
1
```

### Explanation

The only solution is $y = 1$.

### Hint

- Use the `int` data type to store integers.
- Use the `str` data type to store strings.
- Use the `map` function to create a list of integers.
- Use the `range` function to create a list of integers.
- Use the `input` function to read input.
- Use the `split` function to split a string into a list of strings.
- Use the `+` operator to concatenate strings.
- Use the `==` operator to compare two values.
- Use the `!=` operator to compare two values.
- Use the `>` operator to compare two values.
- Use the `<` operator to compare two values.
- Use the `>`=` operator to compare two values.
- Use the `<=` operator to compare two values.
- Use the `!` operator to negate a boolean value.
- Use the `and` operator to combine two boolean values.
- Use the `or` operator to combine two boolean values.
- Use the `not` operator to negate a boolean value.
- Use the `if` statement to execute code based on a boolean value.
- Use the `else` statement to execute code when the `if` statement is false.
- Use the `for` statement to iterate over a list.
- Use the `in` operator to check if a value is in a list.
- Use the `len` function to get the length of a list.
- Use the `+` operator to concatenate strings.
- Use the `*` operator to multiply two numbers.
- Use the `/` operator to divide two numbers.
- Use the `%` operator to get the remainder of a division.
- Use the `^` operator to raise one number to the power of another.
- Use the `**` operator to raise one number to the power of another.
- Use the `==` operator to compare two values.
- Use the `!=` operator to compare two values.
- Use the `>` operator to compare two values.
- Use the `<` operator to compare two values.
- Use the `>`=` operator to compare two values.
- Use the `<=` operator to compare two values.
- Use the `and` operator to combine two boolean values.
- Use the `or` operator to combine two boolean values.
- Use the `not` operator to negate a boolean value.
- Use the `if` statement to execute code based on a boolean value.
- Use the `else` statement to execute code when the `if` statement is false.
- Use the `for` statement to iterate over a list.
- Use the `in` operator to check if a value is in a list.
- Use the `len` function to get the length of a list.
- Use the `+` operator to concatenate strings.
- Use the `*` operator to multiply two numbers.
- Use the `/` operator to divide two numbers.
- Use the `%` operator to get the remainder of a division.
- Use the `^` operator to raise one number to the power of another.
- Use the `**` operator to raise one number to the power of another.
- Use the `==` operator to compare two values.
- Use the `!=` operator to compare two values.
- Use the `>` operator to compare two values.
- Use the `<` operator to compare two values.
- Use the `>`=` operator to compare two values.
- Use the `<=` operator to compare two values.
- Use the `and` operator to combine two boolean values.
- Use the `or` operator to combine two boolean values.
- Use the `not` operator to negate a boolean value.
- Use the `if` statement to execute code based on a boolean value.
- Use the `else` statement to execute code when the `if` statement is false.
- Use the `for` statement to iterate over a list.
- Use the `in` operator to check if a value is in a list.
- Use the `len` function to get the length of a list.
- Use the `+` operator to concatenate strings.
- Use the `*` operator to multiply two numbers.
- Use the `/` operator to divide two numbers.
- Use the `%` operator to get the remainder of a division.
- Use the `^` operator to raise one number to the power of another.
- Use the `**` operator to raise one number to the power of another.
- Use the `==` operator to compare two values.
- Use the `!=` operator to compare two values.
- Use the `>` operator to compare two values.
- Use the `<` operator to compare two values.
- Use the `>`=` operator to compare two values.
- Use the `<=` operator to compare two values.
- Use the `and` operator to combine two boolean values.
- Use the `or` operator to combine two boolean values.
- Use the `not` operator to negate a boolean value.
- Use the `if` statement to execute code based on a boolean value.
- Use the `else` statement to execute code when the `if` statement is false.
- Use the `for` statement to iterate over a list.
- Use the `in` operator to check if a value is in a list.
- Use the `len` function to get the length of a list.
- Use the `+` operator to concatenate strings.
- Use the `*` operator to multiply two numbers.
- Use the `/` operator to divide two numbers.
- Use the `%` operator to get the remainder of a division.
- Use the `^` operator to raise one number to the power of another.
- Use the `**` operator to raise one number to the power of another.
- Use the `==` operator to compare two values.
- Use the `!=` operator to compare two values.
- Use the `>` operator to compare two values.
- Use the `<` operator to compare two values.
- Use the `>`=` operator to compare two values.
- Use the `<=` operator to compare two values.
- Use the `and` operator to combine two boolean values.
- Use the `or` operator to combine two boolean values.
- Use the `not` operator to negate a boolean value.
- Use the `if` statement to execute code based on a boolean value.
- Use the `else` statement to execute code when the `if` statement is false.
- Use the `for` statement to iterate over a list.
- Use the `in` operator to check if a value is in a list.
- Use the `len` function to get the length of a list.
- Use the `+` operator to concatenate strings.
- Use the `*` operator to multiply two numbers.
- Use the `/` operator to divide two numbers.
- Use the `%` operator to get the remainder of a division.
- Use the `^` operator to raise one number to the power of another.
- Use the `**` operator to raise one number to the power of another.
- Use the `==` operator to compare two values.
- Use the `!=` operator to compare two values.
- Use the `>` operator to compare two values.
- Use the `<` operator to compare two values.
- Use the `>`=` operator to compare two values.
- Use the `<=` operator to compare two values.
- Use the `and` operator to combine two boolean values.
- Use the `or` operator to combine two boolean values.
- Use the `not` operator to negate a boolean value.
- Use the `if` statement to execute code based on a boolean value.
- Use the `else` statement to execute code when the `if` statement is false.
- Use the `for` statement to iterate over a list.
- Use the `in` operator to check if a value is in a list.
-
