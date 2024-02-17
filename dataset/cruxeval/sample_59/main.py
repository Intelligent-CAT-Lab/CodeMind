def f(s):
    a = [char for char in s if char != ' ']
    b = a
    for c in reversed(a):
        if c == ' ':
            b.pop()
        else:
            break
    return ''.join(b)