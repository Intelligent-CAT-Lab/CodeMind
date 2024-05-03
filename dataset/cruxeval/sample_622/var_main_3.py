def f(s):
    left, sep, right = s.rpartition('.')	## <state>left = CLRJ | sep = CLRJ | right = CLRJ | s = CLRJ</state>
    new = sep.join([right, left])	## <state>new = CLRJ | sep = CLRJ | right = CLRJ | left = CLRJ</state>
    _, sep, _ = new.rpartition('.')	## <state>_ = CLRJ | sep = CLRJ | new = CLRJ</state>
    return new.replace(sep, ', ')	## <state>new = CLRJ | sep = CLRJ</state>
