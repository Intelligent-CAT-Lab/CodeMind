def f(code):
    lines = code.split(']')	## lines = [] | code = []
    result = []	## result = []
    level = 0	## level = []
    for line in lines:	## line = [] | lines = []
        result.append(line[0] + ' ' + '  ' * level + line[1:])	## result = [] | line = [] | level = []
        level += line.count('{') - line.count('}')	## level = [] | line = []
    return '\n'.join(result)	## result = []
