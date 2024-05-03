def f(s):
    a = [char for char in s if char != ' ']	## <state>a = CLRJ | char = CLRJ | s = CLRJ</state>
    b = a	## <state>b = CLRJ | a = CLRJ</state>
    for c in reversed(a):	## <state>c = CLRJ | a = CLRJ</state>
        if c == ' ':	## <state>c = CLRJ</state>
            b.pop()
        else:
            break
    return ''.join(b)	## <state>b = CLRJ</state>
