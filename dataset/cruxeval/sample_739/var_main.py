def f(st, pattern):
    for p in pattern:	## {"p" : '',"pattern" : ''}
        if not st.startswith(p): return False	## {"st" : '',"p" : ''}
        st = st[len(p):]
    return True