def f(text, letter):
    if letter.islower(): letter = letter.upper()	## letter = []
    text = ''.join([letter if char == letter.lower() else char for char in text])	## text = [] | char = [] | letter = []
    return text.capitalize()	## text = []
