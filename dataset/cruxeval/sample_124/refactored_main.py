txt = 'i like you'
sep = ' '
sep_count = -1
o = ''
while sep_count > 0 and txt.count(sep) > 0:
    o += txt.rsplit(sep, 1)[0] + sep
    txt = txt.rsplit(sep, 1)[1]
    sep_count -= 1
print(o + txt)