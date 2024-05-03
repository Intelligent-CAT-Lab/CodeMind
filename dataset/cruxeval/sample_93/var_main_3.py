def f(n):
    length = len(n) + 2	## <state>length = CLRJ | n = CLRJ</state>
    revn = list(n)	## <state>revn = CLRJ | n = CLRJ</state>
    result = ''.join(revn)	## <state>result = CLRJ | revn = CLRJ</state>
    revn.clear()	## <state>revn = CLRJ</state>
    return result + ('!' * length)	## <state>result = CLRJ | length = CLRJ</state>
