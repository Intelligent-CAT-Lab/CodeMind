def f(l1, l2):
    if len(l1) != len(l2):	## l1 = CLRJ | l2 = CLRJ
        return {}
    return dict.fromkeys(l1, l2)	## l1 = CLRJ | l2 = CLRJ
