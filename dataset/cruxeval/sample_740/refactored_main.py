plot = [1, 2, 3, 4]
delin = 3
if delin in plot:
    split = plot.index(delin)
    first = plot[:split]
    second = plot[split + 1:]
    print(first + second)
else:
    print(plot)