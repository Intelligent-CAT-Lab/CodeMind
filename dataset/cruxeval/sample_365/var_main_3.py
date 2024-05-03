def f(n, s):
    if s.startswith(n):	## <state>s = CLRJ | n = CLRJ</state>
        pre, _ = s.split(n, 1)
        return pre + n + s[len(n):]
    return s	## <state>s = CLRJ</state>
