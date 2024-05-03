def f(st, pattern):
    for p in pattern:	## p = CLRJ | pattern = CLRJ
        if not st.startswith(p): return False	## st = CLRJ | p = CLRJ
        st = st[len(p):]
    return True