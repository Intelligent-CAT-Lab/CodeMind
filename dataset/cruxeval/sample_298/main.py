def f(text):
    new_text = list(text)
    for i in range(len(new_text)):
        character = new_text[i]
        new_character = character.swapcase()
        new_text[i] = new_character
    return ''.join(new_text)