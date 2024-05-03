def f(line, char):
    count = line.count(char)	## {"count" : '',"line" : '',"char" : ''}
    for i in range(count+1, 0, -1):	## {"i" : '',"count" : ''}
        line = line.center(len(line)+i // len(char), char)	## {"line" : '',"i" : '',"char" : ''}
    return line	## {"line" : ''}
