text = 'ertubwi'
sep = 'p'
maxsplit = 5
splitted = text.rsplit(sep, maxsplit)
length = len(splitted)
new_splitted = splitted[:length // 2]
new_splitted.reverse()
new_splitted += splitted[length // 2:]
print(sep.join(new_splitted))