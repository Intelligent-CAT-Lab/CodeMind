def f(text, speaker):
    while text.startswith(speaker):
        text = text[len(speaker):]
    return text