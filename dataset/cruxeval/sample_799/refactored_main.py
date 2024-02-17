st = 'eqe-;ew22'
if st[0] == '~':
    e = st.rjust(10, 's')
    if e[0] == '~':
        e = e.rjust(10, 's')
        print(f(e))
    else:
        print(e.rjust(10, 'n'))
else:
    print(st.rjust(10, 'n'))