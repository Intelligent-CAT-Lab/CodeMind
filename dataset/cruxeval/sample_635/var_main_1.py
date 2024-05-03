def f(text):
    valid_chars = ['-', '_', '+', '.', '/', ' ']	## valid_chars = CLRJ
    text = text.upper()	## text = CLRJ
    for char in text:	## char = CLRJ | text = CLRJ
        if char.isalnum() == False and char not in valid_chars:	## char = CLRJ | valid_chars = CLRJ
            return False
    return True