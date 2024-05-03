def f(var):
    amount = len(var) if type(var) == list else 0	## <state>amount = CLRJ | var = CLRJ</state>
    if type(var) == dict:	## <state>var = CLRJ</state>
        amount = len(var.keys())
    nonzero = amount if amount > 0 else 0	## <state>nonzero = CLRJ | amount = CLRJ</state>
    return nonzero	## <state>nonzero = CLRJ</state>
