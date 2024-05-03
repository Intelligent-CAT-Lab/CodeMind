def f(text, letter):
    if letter.islower(): letter = letter.upper()	## letter = CLRJ
    text = ''.join([letter if char == letter.lower() else char for char in text])	## text = CLRJ | char = CLRJ | letter = CLRJ
    return text.capitalize()	## text = CLRJ
