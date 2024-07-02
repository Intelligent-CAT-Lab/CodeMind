def f(string):
    count = string.count(':')
    return string.replace(':', '', count - 1)
f('1::1')