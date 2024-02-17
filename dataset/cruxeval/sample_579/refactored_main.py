text = ''
if text.istitle():
    if len(text) > 1 and text.lower() != text:
        print(text[0].lower() + text[1:])
elif text.isalpha():
    print(text.capitalize())
print(text)