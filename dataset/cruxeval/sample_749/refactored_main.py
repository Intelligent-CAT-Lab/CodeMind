text = 'l\nl'
width = 2
result = ""
lines = text.split('\n')
for l in lines:
    result += l.center(width)
    result += '\n'
# Remove the very last empty line
result = result[:-1]
print(result)