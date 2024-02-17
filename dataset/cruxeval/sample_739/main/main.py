def f(st, pattern):
    for p in pattern:
        if not st.startswith(p): return False
        st = st[len(p):]
    return True