char_map = {}
text = 'hbd'
new_text = ''
for ch in text:
    val = char_map.get(ch)
    if val is None:
        new_text += ch
    else:
        new_text += val
print(new_text)