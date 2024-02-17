text = '5f83u23saa'
new_text = [c if c.isdigit() else '*' for c in text]
print(''.join(new_text))