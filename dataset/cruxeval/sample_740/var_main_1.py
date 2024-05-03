def f(plot, delin):
    if delin in plot:	## delin = CLRJ | plot = CLRJ
        split = plot.index(delin)	## split = CLRJ | plot = CLRJ | delin = CLRJ
        first = plot[:split]	## first = CLRJ | plot = CLRJ | split = CLRJ
        second = plot[split + 1:]	## second = CLRJ | plot = CLRJ | split = CLRJ
        return first + second	## first = CLRJ | second = CLRJ
    else:
        return plot