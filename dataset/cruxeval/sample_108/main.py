def f(var):
    amount = len(var) if type(var) == list else 0
    if type(var) == dict:
        amount = len(var.keys())
    nonzero = amount if amount > 0 else 0
    return nonzero