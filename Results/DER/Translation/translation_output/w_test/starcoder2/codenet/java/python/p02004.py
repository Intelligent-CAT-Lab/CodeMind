

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
/01/01001.py
import sys

def main():
    str = sys.stdin.readline()
    str = str.replace('\n', '')
    str = str.replace(' ', '')
    str = str.replace('\t', '')
    str = str.replace('\r', '')
    str = str.replace('\f', '')
    str = str.replace)

if __name__ == '__main__':
    main()
('\v', '')
    print(str/01/01002.py
import sys

def main():
    str = sys.stdin.readline()
    str = str.replace('\n', '')
    str = str.replace(' ', '')
    str = str.replace('\t', '')
    str = str.replace('\r', '')
    str = str.replace('\f', '')
    str = str.replace('\v', '')
    print(str)

if __name__ == '__main__':
    main()
/02/02001.py
import sys

def main():
    str = sys.stdin.readline()
    str = str.replace('\n', '')
    str = str.replace(' ', '')
    str = str.replace('\t', '')
    str = str.replace('\r', '')
    str = str.replace('\f', '')
    str = str.replace('\v', '')
    print(str)

if __name__ == '__main__':
    main()
/01/01003.py
import sys

def main():
    str = sys.stdin.readline()
    str = str.replace('\n', '')
    str = str.replace(' ', '')
    str = str.replace('\t', '')
    str = str.replace('\r', '')
    str = str.replace('\f', '')
    str = str.replace('\v', '')
    print(str)

if __name__ == '__main__':
    main()
/02/02002.py
import sys

def main():
    str = sys.stdin.readline()
    str = str.replace('\n', '')
    str = str.replace(' ', '')
    str = str.replace('\t', '')
    str = str.replace('\r', '')
    str = str.replace('\f', '')
    str = str.replace('\v', '')
    print(str)

if __name__ == '__main__':
    main()
/02/02003.py
import sys

def main():
    str = tr.replace('\n', '')
    str = str.replace(' ', '')
    str = str.replace('\t', '')
    str = str.replace('\r', '')
    str = str.replace('\f', '')
    str = str.replace('\v', '')
    print(str)

if __name__ == '__main__':
    main()
sys.stdin.readline()
    str = str.replace('\n', '')
    str = str.replace(' ', '')
    str = str.replace('\t', '')
    str = str.replace('\r', '')
    str = str.replace('\f', '')
    str = str.replace('\v
