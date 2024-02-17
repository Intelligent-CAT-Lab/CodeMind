text = 'only one line'
char = ' '
if char in text:
    text = [t.strip() for t in text.split(char) if t]
    if len(text) > 1:
        print(True)
print(False)