text = 'tqzym'
limit = 5
char = 'c'

if limit < len(text):
    print(text[0:limit])
else:
    print(text.ljust(limit, char))