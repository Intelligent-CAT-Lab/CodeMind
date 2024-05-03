Here is the Python version of the Java code:

```python
import re

PRI = {
    '(': 5,
    ')': 0,
    '+': 1,
    '-': 1,
    '*': 2,
    '\0': -1,
}

def parse_input(input_str):
    words = re.findall(r'\d+|\D', input_str)
    expr = []
    for word in words:
        if word in PRI:
            expr.append(word)
        else:
            expr.append(int(word))
    return expr

def postfix(expr, pri):
    stack = []
    list_ = []
    stack.append('Nop')
    for e in expr:
        p1 = pri[stack[-1]]
        p2 = pri[e]
        while p2 <= p1 and stack[-1] != '(':
            list_.append(stack.pop())
            p1 = pri[stack[-1]]
        if e != ')':
            stack.append(e)
        else:
            stack.pop()
    while stack[-1] != 'Nop':
        list_.append(stack.pop())
    return list_

def eval(expr):
    stack = []
    for e in expr:
        if isinstance(e, str):
            if e in ['+', '-', '*']:
                b = stack.pop()
                a = stack.pop()
                stack.append(e(a, b))
        else:
            stack.append(e)
    return stack.pop()

def main():
    input_str = input()
    expr = parse_input(input_str)
    max_val = float('-inf')
    for i in range(len(PRI)):
        postfix_expr = postfix(expr, PRI)
        max_val = max(max_val, eval(postfix_expr))
    print(max_val)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an input
