def f(plot, delin):
    if delin in plot:
        split = plot.index(delin)
        first = plot[:split]
        second = plot[split + 1:]
        return first + second
    else:
        return plot