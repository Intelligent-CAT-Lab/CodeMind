code = "if (x) {y = 1;} else {z = 1;}"
lines = code.split(']')
result = []
level = 0
for line in lines:
    result.append(line[0] + ' ' + '  ' * level + line[1:])
    level += line.count('{') - line.count('}')
print('\n'.join(result))