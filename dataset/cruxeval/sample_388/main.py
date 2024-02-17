def f(text, characters):
    character_list = list(characters) + [' ', '_']

    i = 0
    while i < len(text) and text[i] in character_list:
        i += 1

    return text[i:]