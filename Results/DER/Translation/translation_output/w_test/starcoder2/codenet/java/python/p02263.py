

```python
class Stack:
    def __init__(self):
        self.array = []
        self.index = 0

    def push(self, value):
        self.array.append(value)
        self.index += 1

    def pop(self):
        value = self.array[self.index - 1]
        self.index -= 1
        return value

    def isEmpty(self):
        return self.index == 0

    def isFull(self):
        return self.index == MAX + 1


if __name__ == '__main__':
    stack = Stack()
    line = input()
    for s in line.split(" "):
        if s == "+":
            stack.push(stack.pop() + stack.pop())
        elif s == "-":
            first = stack.pop()
            second = stack.pop()
            stack.push(second - first)
        elif s == "*":
            stack.push(stack.pop() * stack.pop())
        else:
            stack.push(int(s))
    print(stack.pop())
```

## 2.2.64

Write a program that takes a string of parentheses and left brackets, and determines whether the parentheses are properly balanced. For example, your program should print true for [()]{}{[()()]()} and false for [(]).

```python
def is_balanced(s):
    stack = []
    for c in s:
        if c == '(' or c == '[' or c == '{':
            stack.append(c)
        elif c == ')':
            if len(stack) == 0 or stack.pop() != '(':
                return False
        elif c == ']':
            if len(stack) == 0 or stack.pop() != '[':
                return False
        elif c == '}':
            if len(stack) == 0 or stack.pop() != '{':
                return False
    return len(stack) == 0


if __name__ == '__main__':
    print(is_balanced('[(])'))
    print(is_balanced('[()]{}{[()()]()}'))
```

## 2.2.65

Write a program that takes a string and prints all permutations of the string.

```python
def permutations(s):
    if len(s) == 1:
        return [s]
    else:
        result = []
        for i in range(len(s)):
            for p in permutations(s[:i] + s[i + 1:]):
                result.append(s[i] + p)
        return result


if __name__ == '__main__':
    print(permutations('abc'))
```

## 2.2.66

Write a program that takes a string and prints all subsets of the string.

```python
def subsets(s):
    if len(s) == 1:
        return ['', s]
    else:
        result = []
        for p in subsets(s[1:]):
            result.append(p)
            result.append(s[0] + p)
        return result


if __name__ == '__main__':
    print(subsets('abc'))
```
 10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
