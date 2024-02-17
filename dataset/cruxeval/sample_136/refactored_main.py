text = "a\nbc\n\nd\nef"
width = 5
lines = [line.center(width) for line in text.split('\n')]
print('\n'.join(lines))