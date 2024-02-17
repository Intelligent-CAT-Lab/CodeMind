def f(text, character):
    subject = text[text.rfind(character):]
    return subject*text.count(character)