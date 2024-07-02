def f(text, speaker):
    while text.startswith(speaker):
        text = text[len(speaker):]
    return text
f('[CHARRUNNERS]Do you know who the other was? [NEGMENDS]', '[CHARRUNNERS]')