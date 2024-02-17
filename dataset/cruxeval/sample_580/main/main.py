def f(text, char):
    new_text = text
    a = []
    while char in new_text:
        a.append(new_text.index(char))
        new_text = new_text.replace(char,"",1)
    return a