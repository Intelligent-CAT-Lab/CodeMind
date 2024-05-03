def f(text):
    ls = list(text)	## ls = [] | text = []
    ls[0], ls[-1] = ls[-1].upper(), ls[0].upper()	## ls = []
    return ''.join(ls).istitle()	## ls = []
