def f(aDict):
    # transpose the keys and values into a new dict
    return dict([v for v in aDict.items()])
f({1:1, 2:2, 3:3})