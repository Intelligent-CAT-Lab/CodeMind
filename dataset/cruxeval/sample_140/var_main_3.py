def f(st):
    if st.lower().rindex('h', st.lower().rindex('i')) >= st.lower().rindex('i'):	## <state>st = CLRJ</state>
        return 'Hey'
    else:
        return 'Hi'