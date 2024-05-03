def f(var):
    amount = len(var) if type(var) == list else 0	## amount = CLRJ | var = CLRJ
    if type(var) == dict:	## var = CLRJ
        amount = len(var.keys())
    nonzero = amount if amount > 0 else 0	## nonzero = CLRJ | amount = CLRJ
    return nonzero	## nonzero = CLRJ
