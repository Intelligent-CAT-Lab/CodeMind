def f(s):
    a = [char for char in s if char != ' ']	## a = CLRJ | char = CLRJ | s = CLRJ
    b = a	## b = CLRJ | a = CLRJ
    for c in reversed(a):	## c = CLRJ | a = CLRJ
        if c == ' ':	## c = CLRJ
            b.pop()
        else:
            break
    return ''.join(b)	## b = CLRJ
