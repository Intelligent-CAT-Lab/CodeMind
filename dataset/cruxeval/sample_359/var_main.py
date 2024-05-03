def f(lines):
    for i in range(len(lines)):	## {"i" : '',"lines" : ''}
        lines[i] = lines[i].center(len(lines[-1]))	## {"lines" : '',"i" : ''}
    return lines	## {"lines" : ''}
