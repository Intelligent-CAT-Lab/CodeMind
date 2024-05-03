def f(st):
    if st.lower().rindex('h', st.lower().rindex('i')) >= st.lower().rindex('i'):	## st = CLRJ
        return 'Hey'
    else:
        return 'Hi'