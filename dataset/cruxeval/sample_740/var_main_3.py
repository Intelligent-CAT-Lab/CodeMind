def f(plot, delin):
    if delin in plot:	## <state>delin = CLRJ | plot = CLRJ</state>
        split = plot.index(delin)	## <state>split = CLRJ | plot = CLRJ | delin = CLRJ</state>
        first = plot[:split]	## <state>first = CLRJ | plot = CLRJ | split = CLRJ</state>
        second = plot[split + 1:]	## <state>second = CLRJ | plot = CLRJ | split = CLRJ</state>
        return first + second	## <state>first = CLRJ | second = CLRJ</state>
    else:
        return plot