def f(line, char):
    count = line.count(char)	## count = CLRJ | line = CLRJ | char = CLRJ
    for i in range(count+1, 0, -1):	## i = CLRJ | count = CLRJ
        line = line.center(len(line)+i // len(char), char)	## line = CLRJ | i = CLRJ | char = CLRJ
    return line	## line = CLRJ
