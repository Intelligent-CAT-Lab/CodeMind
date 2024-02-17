def f(st):
    swapped = ''
    for ch in reversed(st):
        swapped += ch.swapcase()
    return swapped