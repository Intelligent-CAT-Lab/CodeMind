text = 'wduhzxlfk'
char = 'w'
position = len(text)
if char in text:
    position = text.index(char)
    if position > 1:
        position = (position + 1) % len(text)
print(position)