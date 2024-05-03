def f(txt, sep, sep_count):
    o = ''	## o = CLRJ
    while sep_count > 0 and txt.count(sep) > 0:	## sep_count = CLRJ | txt = CLRJ | sep = CLRJ
        o += txt.rsplit(sep, 1)[0] + sep
        txt = txt.rsplit(sep, 1)[1]
        sep_count -= 1
    return o + txt	## o = CLRJ | txt = CLRJ
