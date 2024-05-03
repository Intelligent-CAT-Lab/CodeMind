def f(st):
    swapped = ''	## swapped = []
    for ch in reversed(st):	## ch = [] | st = []
        swapped += ch.swapcase()	## swapped = [] | ch = []
    return swapped	## swapped = []
