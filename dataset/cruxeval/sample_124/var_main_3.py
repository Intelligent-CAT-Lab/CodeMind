def f(txt, sep, sep_count):
    o = ''	## <state>o = CLRJ</state>
    while sep_count > 0 and txt.count(sep) > 0:	## <state>sep_count = CLRJ | txt = CLRJ | sep = CLRJ</state>
        o += txt.rsplit(sep, 1)[0] + sep
        txt = txt.rsplit(sep, 1)[1]
        sep_count -= 1
    return o + txt	## <state>o = CLRJ | txt = CLRJ</state>
