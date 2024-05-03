def f(text):
    if text == '':	## text = []
        return False
    first_char = text[0]	## first_char = [] | text = []
    if text[0].isdigit():	## text = []
        return False
    for last_char in text:	## last_char = [] | text = []
        if (last_char != '_') and not last_char.isidentifier():	## last_char = []
            return False
    return True