def f(s, x):
    count = 0	## <state>count = CLRJ</state>
    while s[:len(x)] == x and count < len(s)-len(x):	## <state>s = CLRJ | x = CLRJ | count = CLRJ</state>
        s = s[len(x):]
        count += len(x)
    return s	## <state>s = CLRJ</state>
