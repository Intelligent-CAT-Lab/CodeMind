
```java

```


```

java code:
```java

```
/solutions/1000/1000.md
# A+B Problem

## Problem

Write a program that reads two integers a and b, and then prints their sum.

## Input

The input is given in the following format:

```
a b
```

## Output

Print the sum of a and b in one line.

## Constraints

- 0 ≤ a, b ≤ 10000

## Sample Input 1

```
1 2
```

## Sample Output 1

```
3
```

## Sample Input 2

```
10000 10000
```

## Sample Output 2

```
20000
```

## Note

This is a sample problem.

## Solution

Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = map(int, input().split())
print(a + b)/solutions/1001/1001.md
# Print Test Cases

## Problem

Your program is to read a line of text and print it in reverse order.

## Input

The input is a line of text.

## Output

Print the reversed line of text.

## Constraints

- The length of the input line is less than or equal to 1000.

## Sample Input 1

```
Hello World!
```

## Sample Output 1

```
!dlroW olleH
```

## Sample Input 2

```
Hello, World!
```

## Sample Output 2

```
!dlroW ,olleH
```

## Solution

Translate the following python code to java and enclose your solution inside ```java```:
```
print(input()[::-1])

```

java code:
```java

```
/solutions/1002/1002.md
# Print a Rectangle

## Problem

Your program is to read two integers from the keyboard, and print a rectangle of the specified size.

## Input

The input is given in the following format:

```
h w
```

## Output

Print a rectangle of size h x w.

## Constraints

- 1 ≤ h, w ≤ 100

## Sample Input 1

```
4 5
```

## Sample Output 1

```
#####
#   #
#   #
#####
```

## Sample Input 2

```
3 3
```

## Sample Output 2

```
###
# #
###
```

## Solution

Translate the following python code to java and enclose your solution inside ```java```:
```
h, w = map(int, input().split())
for i in range(h):
  if i == 0 or i == h - 1:
    print("#" * w)
  else:
    print("#" + " " * (w - 2) + "#")

```

java code:
```java

```


```

java code:
```java

```
/solutions/1003/1003.md
# Print Test Cases

## Problem

Your program is to read a line of text and print it in reverse order.

## Input

The input is a line of text.

## Output

Print the reversed line of text.

## Constraints

- The length of the input line is less than or equal to 1000.

## Sample Input 1

```
Hello World!
```

## Sample Output 1

```
!dlroW olleH
```

## Sample Input 2

```
Hello, World!
```

## Sample Output 2

```
!dlroW ,olleH
```

## Solution

Translate the following python code to java and enclose your solution inside ```java```:
```
print(input()[::-1])/solutions/1004/1004.md
# Print a Chessboard

## Problem

Your program is to read two integers from the keyboard, and print a chessboard of the specified size.

## Input

The input is given in the following format:

```
h w
```

## Output

Print a chessboard of size h x w.

## Constraints

- 1 ≤ h, w ≤ 100

## Sample Input 1

```
4 5
```

## Sample Output 1

```
#.#.#
.#.#.
#.#.#
.#.#.
```

## Sample Input 2

```
3 3
```

## Sample Output 2

```
#.#
.#.
#.#
```

## Solution

Translate the following python code to java and enclose your solution inside ```java```:
```
h, w = map(int, input().split())
for i in range(h):
  if i % 2 == 0:
    print("#." * (w // 2) + "#")
  else:
    print(".#" * (w // 2) + ".")

```

java code:
```java

```

