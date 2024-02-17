text = 'new-medium-performing-application - XQuery 2.2'
chars = '0123456789-'
if chars:
    text = text.rstrip(chars)
else:
    text = text.rstrip(' ')
if text == '':
    print('-')
else:
    print(text)