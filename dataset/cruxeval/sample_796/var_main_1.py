def f(str,toget):
    if str.startswith(toget): return str[len(toget):]	## str = CLRJ | toget = CLRJ
    else: return str	## str = CLRJ
