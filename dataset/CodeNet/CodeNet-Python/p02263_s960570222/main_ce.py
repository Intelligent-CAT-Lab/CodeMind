stack = []
for op in "1 2 +".split():
    if op in '+-*':
        b = stack.pop()
        a = stack.pop()
        stack.append(str(eval(a+op+b)))
    else:
        stack.append(op)
print(''.join(stack))
