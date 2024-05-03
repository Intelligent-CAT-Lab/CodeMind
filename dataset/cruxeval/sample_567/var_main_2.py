def f(s, n):
    ls = s.rsplit()	## ls = [] | s = []
    out = []	## out = []
    while len(ls) >= n:	## ls = [] | n = []
        out += ls[-n:]	## out = [] | ls = [] | n = []
        ls = ls[:-n]	## ls = [] | n = []
    return ls + ['_'.join(out)]	## ls = [] | out = []
