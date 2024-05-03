def f(text, length, index):
    ls = text.rsplit(None, index)	## <state>ls = CLRJ | text = CLRJ | index = CLRJ</state>
    return '_'.join([l[:length] for l in ls])	## <state>l = CLRJ | length = CLRJ | ls = CLRJ</state>
