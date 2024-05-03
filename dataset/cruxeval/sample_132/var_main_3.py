def f(a_str, prefix):
    if a_str.removeprefix(prefix):	## <state>a_str = CLRJ | prefix = CLRJ</state>
        return a_str
    else:
        return prefix + a_str