text = '\\foo'
char = '\\'
if char in text:
    if not text.startswith(char):
        text = text.replace(char,'')
print(text)