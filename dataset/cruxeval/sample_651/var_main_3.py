def f(text, letter):
    if letter.islower(): letter = letter.upper()	## <state>letter = CLRJ</state>
    text = ''.join([letter if char == letter.lower() else char for char in text])	## <state>text = CLRJ | char = CLRJ | letter = CLRJ</state>
    return text.capitalize()	## <state>text = CLRJ</state>
