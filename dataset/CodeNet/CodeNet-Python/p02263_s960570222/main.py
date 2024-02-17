stack = []

for op in input().split():
    if op in '+-*':
        b = stack.pop()
        a = stack.pop()
        stack.append(str(eval(a+op+b)))
    else:
        stack.append(op)

print(''.join(stack))
