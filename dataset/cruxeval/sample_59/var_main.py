def f(s):
    a = [char for char in s if char != ' ']	## {"a" : '',"char" : '',"s" : ''}
    b = a	## {"b" : '',"a" : ''}
    for c in reversed(a):	## {"c" : '',"a" : ''}
        if c == ' ':	## {"c" : ''}
            b.pop()
        else:
            break
    return ''.join(b)	## {"b" : ''}
