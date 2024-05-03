def f(var):
    amount = len(var) if type(var) == list else 0	## amount = [] | var = []
    if type(var) == dict:	## var = []
        amount = len(var.keys())
    nonzero = amount if amount > 0 else 0	## nonzero = [] | amount = []
    return nonzero	## nonzero = []
