text = '[CHARRUNNERS]Do you know who the other was? [NEGMENDS]'
speaker = '[CHARRUNNERS]'
while text.startswith(speaker):
    text = text[len(speaker):]
print(text)