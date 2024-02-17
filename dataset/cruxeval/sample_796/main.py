def f(str,toget):
    if str.startswith(toget): return str[len(toget):]
    else: return str