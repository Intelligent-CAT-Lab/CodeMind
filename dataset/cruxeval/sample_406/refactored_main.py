text = 'Josh'
ls = list(text)
ls[0], ls[-1] = ls[-1].upper(), ls[0].upper()
print(''.join(ls).istitle())