def f(text):
    new_text = list(text)	## new_text = [] | text = []
    for i in range(len(new_text)):	## i = [] | new_text = []
        character = new_text[i]	## character = [] | new_text = [] | i = []
        new_character = character.swapcase()	## new_character = [] | character = []
        new_text[i] = new_character	## new_text = [] | i = [] | new_character = []
    return ''.join(new_text)	## new_text = []
