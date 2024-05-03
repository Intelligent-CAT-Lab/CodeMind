def f(str,toget):
    if str.startswith(toget): return str[len(toget):]	## <state>str = CLRJ | toget = CLRJ</state>
    else: return str	## <state>str = CLRJ</state>
