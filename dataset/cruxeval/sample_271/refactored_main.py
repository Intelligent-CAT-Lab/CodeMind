text = 'uufhl'
c = 'l'
ls = list(text)
if c not in text:
    raise ValueError('Text has no {c}')
ls.pop(text.rindex(c))
print(''.join(ls))