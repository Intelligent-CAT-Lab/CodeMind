def f(n):
    length = len(n) + 2
    revn = list(n)
    result = ''.join(revn)
    revn.clear()
    return result + ('!' * length)