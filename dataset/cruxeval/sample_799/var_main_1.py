def f(st):
    if st[0] == '~':	## st = CLRJ
        e = st.rjust(10, 's')
        return f(e)
    else:
        return st.rjust(10, 'n')	## st = CLRJ
