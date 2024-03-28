Below is the converted Python code from the given Java code snippet:

```python
class OldState:
    def __init__(self, depth, ans):
        self.depth = depth
        self.ans = ans

def main():
    s = input()
    n = len(s)

    elements = [0]
    elements_before = []

    def valid_undo():
        elements.append(elements.pop() - 1)
        elements.append(elements_before.pop())

    def invalid_undo():
        elements.pop()
        elements.append(elements_before.pop())

    def open():
        elements.pop()

    undo = []
    old_states = []

    depth = 0
    ans = 0

    for i in range(n):
        if s[i] != '-':
            old_states.append(OldState(depth, ans))
        if s[i] == '(':
            depth += 1
            elements.append(0)
            undo.append(open)
        elif s[i] == ')':
            depth -= 1
            elements_before.append(elements.pop())
            if depth < 0:
                depth = 0
                elements.append(0)
                undo.append(invalid_undo)
            else:
                elements.append(elements.pop() + 1)
                undo.append(valid_undo)

            delta = elements[-1]
            ans += delta
        else:
            state = old_states.pop()
            ans = state.ans
            depth = state.depth
            undo.pop()()

        print(ans)

if __name__ == "__main__":
    main()
```

The converted Python code maintains the same basic structure as the original Java code:

- We use Python's dynamic typing, so we don't need to specify the types of variables.
- `List` in Python is used in place of `Stack` in Java as it inherently has last-in-first-out (LIFO) capabilities with `append()` and `pop()` operations.
- `Runnable` interfaces in Java, which are used as lambdas for delayed code execution, are replaced with Python's functions `def`. They are defined within the same scope as where they were defined in the Java code (within the `main` function).
- Java's `try-with-resources` is not required in Python because Python deals with resources using context managers, but for the code snippet provided, no context manager is needed for input and output.
- The `print` function is used to output the result instead of `PrintWriter`.

Ensure to adapt the input/output handling in Python as per your program's execution environment, as the Python code outputs directly to the standard output.
