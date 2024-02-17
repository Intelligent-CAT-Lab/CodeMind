def f(string):
    count = string.count(':')
    return string.replace(':', '', count - 1)