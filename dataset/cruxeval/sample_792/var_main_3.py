def f(l1, l2):
    if len(l1) != len(l2):	## <state>l1 = CLRJ | l2 = CLRJ</state>
        return {}
    return dict.fromkeys(l1, l2)	## <state>l1 = CLRJ | l2 = CLRJ</state>
