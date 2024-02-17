def f(text, width):
    lines = [line.center(width) for line in text.split('\n')]
    return '\n'.join(lines)