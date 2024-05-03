def f(text, characters):
    character_list = list(characters) + [' ', '_']	## character_list = [] | characters = []

    i = 0	## i = []
    while i < len(text) and text[i] in character_list:	## i = [] | text = [] | character_list = []
        i += 1

    return text[i:]	## text = [] | i = []
