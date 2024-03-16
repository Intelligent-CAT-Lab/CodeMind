<s> Translate the following python code to java and enclose your solution inside ```java```:
```
string = input()
if string == "ARC":
  print("ABC")
else:
  print("ARC")
```

### Solution

```java
String string = input();
if (string.equals("ARC")) {
  System.out.println("ABC");
} else {
  System.out.println("ARC");
}
```

### Explanation

```
string = input()
```

This line takes input from the user and stores it in the variable `string`.

```
if string == "ARC":
```

This line checks if the value of `string` is equal to "ARC". If it is, the code inside the `if` statement will be executed.

```
  print("ABC")
```

This line prints the string "ABC" to the console.

```
else:
```

This line checks if the value of `string` is not equal to "ARC". If it is not, the code inside the `else` statement will be executed.

```
  print("ARC")
```

This line prints the string "ARC" to the console.

### Code

```java
String string = input();
if (string.equals("ARC")) {
  System.out.println("ABC");
} else {
  System.out.println("ARC");
}
```

### Output

```
ARC
```

### Time Complexity

O(1)

### Space Complexity

O(1)
</s>
