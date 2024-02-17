def f(text, letter):
    if letter.islower(): letter = letter.upper()
    text = ''.join([letter if char == letter.lower() else char for char in text])
    return text.capitalize()