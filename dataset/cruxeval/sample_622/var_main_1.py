def f(s):
    left, sep, right = s.rpartition('.')	## left = CLRJ | sep = CLRJ | right = CLRJ | s = CLRJ
    new = sep.join([right, left])	## new = CLRJ | sep = CLRJ | right = CLRJ | left = CLRJ
    _, sep, _ = new.rpartition('.')	## _ = CLRJ | sep = CLRJ | new = CLRJ
    return new.replace(sep, ', ')	## new = CLRJ | sep = CLRJ
