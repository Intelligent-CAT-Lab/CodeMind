<s> Translate the following python code to java and enclose your solution inside ```java```:
```
if '9' in input():
    print('Yes')
else:
    print('No')
```

### Solution

```java
if ('9'.equals(input())) {
    System.out.println("Yes");
} else {
    System.out.println("No");
}
```

### Explanation

The `if` statement in python is a conditional statement. It is used to execute a block of code if a certain condition is met. In this case, the condition is checking if the input contains the string '9'. If it does, the code inside the `if` statement will be executed, and if it doesn't, the code inside the `else` statement will be executed.

In Java, the equivalent of the `if` statement is the `if-else` statement. It is used to execute a block of code if a certain condition is met, or if it is not met, execute a different block of code. The syntax for the `if-else` statement in Java is:

```java
if (condition) {
    // code to execute if condition is true
} else {
    // code to execute if condition is false
}
```

In this case, the condition is checking if the input contains the string '9'. If it does, the code inside the `if` statement will be executed, and if it doesn't, the code inside the `else` statement will be executed.

The `equals` method in Java is used to check if two objects are equal. In this case, the `equals` method is being used to check if the input string is equal to the string '9'. If it is, the code inside the `if` statement will be executed, and if it isn't, the code inside the `else` statement will be executed.

The `System.out.println` method in Java is used to print a string to the console. In this case, the `System.out.println` method is being used to print the string "Yes" if the input contains the string '9', and to print the string "No" if it doesn't.

### Code

```java
if ('9'.equals(input())) {
    System.out.println("Yes");
} else {
    System.out.println("No");
}
```

### Output

```
No
```

### Time Complexity

O(1)

### Space Complexity

O(1)
</s>
