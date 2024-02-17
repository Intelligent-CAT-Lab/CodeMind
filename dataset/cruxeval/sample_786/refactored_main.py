text = '19kefp7'
letter = '9'
if letter in text:
    start = text.index(letter)
    print(text[start + 1:] + text[:start + 1])
else:
    print(text)