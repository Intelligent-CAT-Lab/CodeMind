Here's the translated code from Java to Python. Note that Java's static typing and class-based structure have been translated into Python's dynamic typing and more functional style:

```python
import sys
from typing import Tuple

INF = 1 << 28
EPS = 1e-12

class Result:
    def __init__(self, p: int, value: int):
        self.p = p
        self.value = value
        self.good = True
        self.update()

    def update(self):
        self.good &= 0 <= self.value < 1024


def main():
    s = input()
    solve(s)


def solve(s: str):
    s += "$"
    cs = list(s)
    max_val = [-1]

    def dfs(i):
        op = ['0', '1', '+', '-', '*', '(', ')']
        if i == len(cs):
            max_val[0] = max(max_val[0], calc(cs))
            return
        if cs[i] == '.':
            for c in op:
                cs[i] = c
                dfs(i+1)
                cs[i] = '.'
        else:
            dfs(i+1)

    def calc(cs):
        r = E(cs, 0)
        r.good &= r.p == len(cs) - 1
        if r.good:
            n = len(cs)
            for i in range(n):
                if cs[i] != '(':
                    continue
                left = i
                right = left + 1
                stack = 0
                op = False
                while cs[right] != ')' or stack != 0:
                    if cs[right] == '(':
                        stack += 1
                    elif cs[right] == ')':
                        stack -= 1
                    if stack == 0:
                        op |= cs[right] in ['+', '-', '*']
                    right += 1
                r.good &= op
        return r.value if r.good else -1

    def E(cs, p):
        r = F(cs, p)
        if not r.good:
            return r
        while cs[r.p] in ['+', '-']:
            r2 = F(cs, r.p + 1)
            if not r2.good:
                return r2
            if cs[r.p] == '+':
                r.value += r2.value
            else:
                r.value -= r2.value
            r.update()
            if not r.good:
                return r
            r.p = r2.p
        return r

    def F(cs, p):
        r = T(cs, p)
        if not r.good:
            return r
        while cs[r.p] == '*':
            r2 = T(cs, r.p + 1)
            if not r2.good:
                return r2
            r.value *= r2.value
            r.update()
            if not r.good:
                return r
            r.p = r2.p
        return r

    def T(cs, p):
        if cs[p] == '(':
            r = E(cs, p + 1)
            if not r.good or cs[r.p] != ')':
                r.good = False
                return r
            r.p += 1
            return r
        elif cs[p] in ['0', '1']:
            r = Result(p, 0)
            while cs[r.p].isdigit():
                r.value = r.value * 2 + int(cs[r.p]) - int('0')
                r.update()
                r.p += 1
            return r
        else:
            return Result(0, -1)

    dfs(0)
    print(max_val[0])

if __name__ == '__main__':
    main()
```

Explanation of the changes:

1. The class `Result` is declared at the top level, as Python does not require classes to be nested within others unless it's needed for organization or scoping purposes.
   
2. Instead of using a `Scanner`, input is retrieved using the `input()` function in Python.

3. The Java character array is translated to a Python list of characters, as strings in Python are immutable.

4. Array indexing and manipulation are done directly on the list of characters.

5. Python uses 'def' to define functions rather than blocks of a class, moving all the logic defined in methods to top-level functions or nested functions within `solve()`.

6. Python's print function is directly used in place of a custom `println(String s)` method.

7. The calculation of maximum value (`max` in Java) is handled in Python using a list `max_val` with one element, as integers are immutable in Python and cannot be modified from within nested functions without using the `nonlocal` keyword or using mutable structures.
   
8. Python does not have a built-in way to check if a character is a digit while taking into account only certain digits ('0' and '1'). As such, a membership test in `['0', '1']` is used instead.

9. Python supports the actual `max` function that can be used to replace the usage of `Math.max`.

10. The `void` return type is omitted because Python functions do not define return types in the function signature.

11. Access to instance variables is done with the `self` keyword in Python, compared to using `this` in Java.

12. The `main()` method is translated into a Python main guard (`if __name__ == '__main__':`) to invoke the `main()` function when the script is run directly.

This is a general, straight-forward translation and may not be the most Pythonic way to write the equivalent code, but it should serve as a direct translation of the Java logic into Python.
