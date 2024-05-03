def f(plot, delin):
    if delin in plot:	## {"delin" : '',"plot" : ''}
        split = plot.index(delin)	## {"split" : '',"plot" : '',"delin" : ''}
        first = plot[:split]	## {"first" : '',"plot" : '',"split" : ''}
        second = plot[split + 1:]	## {"second" : '',"plot" : '',"split" : ''}
        return first + second	## {"first" : '',"second" : ''}
    else:
        return plot