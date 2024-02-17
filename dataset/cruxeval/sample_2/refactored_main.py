text = 'hbtofdeiequ'
new_text = list(text)
for i in '+':
    if i in new_text:
        new_text.remove(i)
print(''.join(new_text))