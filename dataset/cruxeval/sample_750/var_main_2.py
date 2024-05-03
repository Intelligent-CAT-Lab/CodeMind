def f(char_map, text):
    new_text = ''	## new_text = []
    for ch in text:	## ch = [] | text = []
        val = char_map.get(ch)	## val = [] | char_map = [] | ch = []
        if val is None:	## val = []
            new_text += ch	## new_text = [] | ch = []
        else:
            new_text += val
    return new_text	## new_text = []
