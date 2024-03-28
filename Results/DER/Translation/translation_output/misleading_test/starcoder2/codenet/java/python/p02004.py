

```

import sys

def main():
    str = sys.stdin.readline()
    dir = 0
    stack = []
    stack.append(0)
    result = 0

    for i in range(len(str)):
        command = str[i]

        if command == 'R':
            dir += 1
        else:
            dir += 3
        dir %= 4

        if dir == 0 and len(stack) == 0:
            stack = []
            stack.append(0)
        elif len(stack) != 0:
            if command == 'L':
                stack.pop()
                if len(stack) == 0:
                    stack = None
            else:
                stack.append(0)
                if len(stack) == 5:
                    result += 1
                    stack = []
                    stack.append(0)

    print(result)

if __name__ == '__main__':
    main()

```

## 02005

```

Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

```

python code:

```

import sys

def main():
    str = sys.stdin.readline()
    count = 0
    for i in range(len(str) - 1):
        if str[i] == 'h' and str[i + 1] == 'i':
            count += 1
    print(count)

if __name__ == '__main__':
    main()

```

## 02006

```

Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

```

python code:

```

import sys

def main():
    str = sys.stdin.readline()
    count = 0
    for i in range(len(str) - 1):
        if str[i] == 'h' and str[i + 1] == 'i':
            count += 1
    print(count)

if __name__ == '__main__':
    main()

```
/01000/01000.md
# 01000

## 01001

```

Write a program that reads an integer and prints the integer with its digits reversed.

```

python code:

```

import sys

def main():
    num = int(sys.stdin.readline())
    print(int(str(num)[::-1]))

if __name__ == '__main__':
    main()

```

## 01002

```

Write a program that reads an integer and prints the integer with its digits reversed.

```

python code:

```

import sys

def main():
    num = int(sys.stdin.readline())
    print(int(str(num)[::-1]))

if __name__ == '__main__':
    main()

```

## 01003

```

Write a program that reads an integer and prints the integer with its digits reversed.

```

python code:

```

import sys

def main():
    num = int(sys.stdin.readline())
    print(int(str(num)[::-1]))

if __name__ == '__main__':
    main()

```

## 01004

```

Write a program that reads an integer and prints the integer with its digits reversed.

```

python code:

```

import sys

def main():
    num = int(sys.stdin.readline())
    print(int(str(num)[::-1]))

if __name__ == '__main__':
    main()

```

## 01005

```

Write a program that reads an integer and prints the integer with its digits reversed.

```

python code:

```

import sys

def main():
    num = int(sys.stdin.readline())
    print(int(str(num)[::-1]))

if __name__ == '__main__':
    main()

```

## 01006

```

Write a program that reads an integer and prints the integer with its digits reversed.

```

python code:

```

import sys

def main():
    num = int(sys.stdin.readline())
    print(int(str(num)[::-1]))

if __name__ == '__main__':
    main()

```

## 01007

```

Write a program that reads an integer and prints the integer with its digits reversed.

```

python code:

```

import sys

def main():
    num = int(sys.stdin.readline())
    print(int(str(num)[::-1]))

if __name__ == '__main__':
    main()

```

## 01008

```

Write a program that reads an integer and prints the integer with its digits reversed.

```

python code:

```

import sys

def main():
    num = int(
