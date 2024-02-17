text = 'A'
text = text.replace('#', '1').replace('$', '5')
print('yes' if text.isnumeric() else 'no')