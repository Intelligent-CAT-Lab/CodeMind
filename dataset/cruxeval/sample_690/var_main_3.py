def f(n):
    if str(n).find('.') != -1:	## <state>n = CLRJ</state>
        return str(int(n)+2.5)
    return str(n)	## <state>n = CLRJ</state>
