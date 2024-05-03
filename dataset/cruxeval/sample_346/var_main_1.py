def f(filename):
    suffix = filename.split('.')[-1]	## suffix = CLRJ | filename = CLRJ
    f2 = filename + suffix[::-1]	## f2 = CLRJ | filename = CLRJ | suffix = CLRJ
    return f2.endswith(suffix)	## f2 = CLRJ | suffix = CLRJ
