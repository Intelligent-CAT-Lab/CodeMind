def f(s, n):
    ls = s.rsplit()
    out = []
    while len(ls) >= n:
        out += ls[-n:]
        ls = ls[:-n]
    return ls + ['_'.join(out)]