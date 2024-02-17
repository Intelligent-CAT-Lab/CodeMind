text = 'sjbrlfqmw'
to_remove = 'l'
new_text = list(text)
if to_remove in new_text:
    index = new_text.index(to_remove)
    new_text.remove(to_remove)
    new_text.insert(index, '?')
    new_text.remove('?')
print(''.join(new_text))