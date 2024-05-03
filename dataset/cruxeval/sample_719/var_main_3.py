def f(code):
    lines = code.split(']')	## <state>lines = CLRJ | code = CLRJ</state>
    result = []	## <state>result = CLRJ</state>
    level = 0	## <state>level = CLRJ</state>
    for line in lines:	## <state>line = CLRJ | lines = CLRJ</state>
        result.append(line[0] + ' ' + '  ' * level + line[1:])	## <state>result = CLRJ | line = CLRJ | level = CLRJ</state>
        level += line.count('{') - line.count('}')	## <state>level = CLRJ | line = CLRJ</state>
    return '\n'.join(result)	## <state>result = CLRJ</state>
