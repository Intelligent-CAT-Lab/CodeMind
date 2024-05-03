def f(orig):
    copy = orig	## <state>copy = CLRJ | orig = CLRJ</state>
    copy.append(100)	## <state>copy = CLRJ</state>
    orig.pop()	## <state>orig = CLRJ</state>
    return copy	## <state>copy = CLRJ</state>
