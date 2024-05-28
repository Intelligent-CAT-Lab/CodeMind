exp = "{()}[{}]"
if len(exp) & 1:
    print(False)
else:
    from collections import deque
    stack = deque()
    for ch in exp:
        if ch == '(' or ch == '{' or ch == '[':
            stack.append(ch)
        if ch == ')' or ch == '}' or ch == ']':
            if not stack:
                print(False)
            else:
                top = stack.pop()
                if (top == '(' and ch != ')') or (top == '{' and ch != '}' or (top == '[' and ch != ']')):
                    print(False)
    print(not stack)