def f(txt, sep, sep_count):
    o = ''	## o = []
    while sep_count > 0 and txt.count(sep) > 0:	## sep_count = [] | txt = [] | sep = []
        o += txt.rsplit(sep, 1)[0] + sep
        txt = txt.rsplit(sep, 1)[1]
        sep_count -= 1
    return o + txt	## o = [] | txt = []
