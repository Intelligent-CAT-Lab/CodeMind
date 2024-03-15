<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n = input().split()
s = []
for i in range(len(n)):
    if n[i] == "+":
        a = s.pop()
        b = s.pop()
        s.append(b + a)
    elif n[i] == "-":
        a = s.pop()
        b = s.pop()
        s.append(b - a)
    elif n[i] == "*":
        a = s.pop()
        b = s.pop()
        s.append(b * a)
    else:
        s.append(int(n[i]))
print(s.pop())

```

### Input

The first line of input contains a single integer $n$ ($1 \leq n \leq 1000$).

### Output

Print the result of the calculation.

### Constraints

- $1 \leq n \leq 1000$

### Sample Input

```
5
1 2 3 4 5
```

### Sample Output

```
15
```

### Explanation

The input is the string "1 2 3 4 5".

The first line of the program is:

```
n = input().split()
```

This line splits the input string into a list of strings.

The second line of the program is:

```
s = []
```

This line creates an empty list.

The third line of the program is:

```
for i in range(len(n)):
```

This line iterates over the list of strings.

The fourth line of the program is:

```
if n[i] == "+":
```

This line checks if the current string is "+" (the string "+" is the first string in the list of strings).

The fifth line of the program is:

```
    a = s.pop()
    b = s.pop()
    s.append(b + a)
```

This line pops the first and second elements from the list, adds them together, and then appends the result to the list.

The sixth line of the program is:

```
elif n[i] == "-":
```

This line checks if the current string is "-" (the string "-" is the second string in the list of strings).

The seventh line of the program is:

```
    a = s.pop()
    b = s.pop()
    s.append(b - a)
```

This line pops the first and second elements from the list, subtracts them, and then appends the result to the list.

The eighth line of the program is:

```
elif n[i] == "*":
```

This line checks if the current string is "*" (the string "*" is the third string in the list of strings).

The ninth line of the program is:

```
    a = s.pop()
    b = s.pop()
    s.append(b * a)
```

This line pops the first and second elements from the list, multiplies them, and then appends the result to the list.

The tenth line of the program is:

```
else:
    s.append(int(n[i]))
```

This line checks if the current string is not "+" or "-" or "*" (the string "+" is the first string in the list of strings, the string "-" is the second string in the list of strings, and the string "*" is the third string in the list of strings).

The eleventh line of the program is:

```
    s.append(int(n[i]))
```

This line appends the current string to the list.

The twelfth line of the program is:

```
print(s.pop())
```

This line prints the last element of the list.

### Hint

- Use the `split()` method to split the input string into a list of strings.
- Use the `pop()` method to remove elements from the list.
- Use the `append()` method to add elements to the list.
- Use the `int()` method to convert a string to an integer.
- Use the `range()` function to iterate over a range of integers.

### Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String temp = sc.next();
            if (temp.equals("+")) {
                String a = s.remove(0);
                String b = s.remove(0);
                s.add(b + a);
            } else if (temp.equals("-")) {
                String a = s.remove(0);
                String b = s.remove(0);
                s.add(b - a);
            } else if (temp.equals("*")) {
                String a = s.remove(0);
                String b = s.remove(0);
                s.add(b * a);
            } else {
                s.add(Integer.parseInt(temp));
            }
        }
        System.out.println(s.remove(0));
    }
}
```
</s>
