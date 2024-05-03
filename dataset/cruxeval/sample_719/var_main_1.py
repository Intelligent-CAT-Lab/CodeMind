def f(code):
    lines = code.split(']')	## lines = CLRJ | code = CLRJ
    result = []	## result = CLRJ
    level = 0	## level = CLRJ
    for line in lines:	## line = CLRJ | lines = CLRJ
        result.append(line[0] + ' ' + '  ' * level + line[1:])	## result = CLRJ | line = CLRJ | level = CLRJ
        level += line.count('{') - line.count('}')	## level = CLRJ | line = CLRJ
    return '\n'.join(result)	## result = CLRJ
