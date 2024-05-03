def f(st, pattern):
    for p in pattern:	## <state>p = CLRJ | pattern = CLRJ</state>
        if not st.startswith(p): return False	## <state>st = CLRJ | p = CLRJ</state>
        st = st[len(p):]
    return True