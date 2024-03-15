<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n = input()
print(max(int(n[0])-1+9*(len(n)-1),sum([int(i) for i in n])))
```

### Input

- The first line contains a single integer `n` denoting the length of the string.

### Output

- Print the maximum value of the sum of the elements of the string and the sum of the elements of the string minus 1 and the sum of the elements of the string multiplied by 9.

### Constraints

- 1 <= `n` <= 1000
- The string will contain only digits.

### Example

```
Input:
n = 3

Output:
12

Explanation:
The string is "123".
The sum of the elements of the string is 1+2+3 = 6.
The sum of the elements of the string minus 1 is 1+2+3-1 = 5.
The sum of the elements of the string multiplied by 9 is 1*9+2*9+3*9 = 27.
The maximum value is 12.
```

### Hint

- Use the `String` class to convert the input to a string.
- Use the `int` class to convert the string to an integer.
- Use the `sum` function to find the sum of the elements of the string.
- Use the `max` function to find the maximum value.
</s>
